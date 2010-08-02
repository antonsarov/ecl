package org.eclipse.ecl.runtime;

import java.text.MessageFormat;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Binding;
import org.eclipse.ecl.core.Block;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.CorePackage;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.core.ExecutableParameter;
import org.eclipse.ecl.core.LiteralParameter;
import org.eclipse.ecl.core.Parameter;
import org.eclipse.ecl.internal.core.CorePlugin;
import org.eclipse.ecl.internal.core.ParamConverterManager;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EclCompiler {

	public static Command compile(Command command) throws CoreException {
		if (command instanceof Exec) {
			Exec exec = (Exec) command;
			return compile(new FQName(exec.getNamespace(), exec.getName()),
					exec.getParameters());
		}
		if (command instanceof Block) {
			Block block = (Block) command;
			for (int i = 0; i < block.getCommands().size(); i++) {
				block.getCommands().set(i, compile(block.getCommands().get(i)));
			}
		}
		return command;
	}

	public static Command compile(FQName fqn, List<Parameter> params)
			throws CoreException {
		Command target = CoreUtils.createCommand(fqn.ns, fqn.name);
		EClass targetClass = target.eClass();
		int i = 0;
		boolean processUnnamed = canProcessUnnamed(targetClass);
		for (Parameter param : params) {
			if (param.eIsSet(CorePackage.eINSTANCE.getParameter_Name())) {
				processUnnamed = false;
			} else {
				if (!processUnnamed) {
					IStatus status = new Status(IStatus.ERROR,
							CorePlugin.PLUGIN_ID,
							"unnamed parameters disallowed here");
					throw new CoreException(status);
				}
			}

			EStructuralFeature feature = processUnnamed ? targetClass
					.getEStructuralFeatures().get(i++) : targetClass
					.getEStructuralFeature(param.getName());

			if (feature == null) {
				IStatus status = new Status(IStatus.ERROR,
						CorePlugin.PLUGIN_ID, MessageFormat.format(
								"invalid param: {0}", new Object[] { param
										.getName() }));
				throw new CoreException(status);
			}
			evalFeatureValue(target, param, feature);
		}
		return target;
	}

	private static boolean canProcessUnnamed(EClass targetClass)
			throws CoreException {
		boolean wasOptional = false;
		for (EStructuralFeature feature : targetClass.getEStructuralFeatures()) {
			int lower = feature.getLowerBound();
			int upper = feature.getUpperBound();
			checkBounds(lower, upper);
			if (lower == 0) {
				wasOptional = true;
			} else if (wasOptional) {
				return false;
			}
		}
		return true;
	}

	private static void checkBounds(int lower, int upper) throws CoreException {
		if (lower < 0) {
			IStatus status = new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"lower bounds is negative");
			throw new CoreException(status);
		}
		if (upper > 1) {
			// TODO correct message
			IStatus status = new Status(IStatus.ERROR, CorePlugin.PLUGIN_ID,
					"upper bounds more than one is not supported yet");
			throw new CoreException(status);
		}
	}

	private static void evalFeatureValue(Command target, Parameter param,
			EStructuralFeature feature) throws CoreException {
		Object value = null;
		switch (param.eClass().getClassifierID()) {
		case CorePackage.LITERAL_PARAMETER:
			Class<?> instanceClass = feature.getEType().getInstanceClass();
			IParamConverter<?> converter = ParamConverterManager.getInstance()
					.getConverter(instanceClass);
			try {
				// Type to converter thought IParamConverter
				if (converter != null) {
					value = converter.convert(((LiteralParameter) param)
							.getLiteral());
				}
				// Type to converter thought EcoreUtil.createFromString
				if (value == null && feature.getEType() instanceof EDataType) {
					value = EcoreUtil.createFromString((EDataType) feature
							.getEType(), ((LiteralParameter) param)
							.getLiteral());
				}
			} catch (Exception e) {
				// Exception while converting
				IStatus status = new Status(IStatus.ERROR,
						CorePlugin.PLUGIN_ID, "converting failed", e);
				throw new CoreException(status);
			}
			// If failed to convert emit error
			if (value == null) {
				IStatus status = new Status(IStatus.ERROR,
						CorePlugin.PLUGIN_ID, MessageFormat.format(
								"no converter found for param type: {0}",
								new Object[] { instanceClass.getSimpleName() }));
				throw new CoreException(status);
			}
			try {
				target.eSet(feature, value);
			} catch (ClassCastException cce) {
				IStatus status = new Status(IStatus.ERROR,
						CorePlugin.PLUGIN_ID, MessageFormat.format(
								"can't assign value {0} to attribute {1}",
								new Object[] { value, feature }), cce);
				throw new CoreException(status);
			}
			break;
		case CorePackage.EXECUTABLE_PARAMETER:
			Binding binding = CoreFactory.eINSTANCE.createBinding();
			binding.setFeature(feature);
			ExecutableParameter execParam = (ExecutableParameter) param;
			binding.setCommand(compile(execParam.getCommand()));
			target.getBindings().add(binding);
			break;
		default:
			throw new RuntimeException("shall not be here");
		}
	}
}
