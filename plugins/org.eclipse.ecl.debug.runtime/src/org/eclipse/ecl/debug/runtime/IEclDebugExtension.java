package org.eclipse.ecl.debug.runtime;

import org.eclipse.ecl.core.CommandStack;
import org.eclipse.ecl.debug.model.StackFrame;
import org.eclipse.ecl.debug.model.Variable;
import org.eclipse.ecl.internal.debug.runtime.EclStackSupport;

/**
 * Using this interface it is possible to extend ECL debugger variables
 * providing.
 * 
 * @author haiodo
 * 
 */
public interface IEclDebugExtension {

	/**
	 * Update current stack frame with variables etc.
	 * 
	 * @param stack
	 * @param frame
	 */
	void updateFrame(CommandStack stack, StackFrame frame);

	/**
	 * Flag to delegate variable value computation to extension.
	 */
	boolean supportVariableValue(Object value);

	/**
	 * Fill variable value based on object value.
	 */
	void processVariable(Variable var, Object value, boolean prepare);

	/**
	 * Return true if variable are complex one.
	 */
	boolean isComplexVariableValue(Object value);

	/**
	 * Return true if child is filtered.
	 */
	boolean isVariableChildFiltered(Object childValue);

	void prepareFrame(CommandStack stack, StackFrame frame, EclStackSupport eclStackSupport);

}
