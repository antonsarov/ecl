package org.eclipse.ecl.platform.internal.commands;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.variables.VariablesPlugin;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.commands.SubstituteVariables;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class SubstituteVariablesService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof SubstituteVariables)) {
			return Status.CANCEL_STATUS;
		}
		SubstituteVariables cmd = (SubstituteVariables) command;
		String result = VariablesPlugin
				.getDefault()
				.getStringVariableManager()
				.performStringSubstitution(cmd.getExpression(),
						!cmd.isIgnoreUndefined());

		context.getOutput().write(result);
		return Status.OK_STATUS;
	}

}
