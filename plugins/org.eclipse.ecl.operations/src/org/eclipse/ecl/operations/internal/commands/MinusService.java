package org.eclipse.ecl.operations.internal.commands;

import static org.eclipse.ecl.runtime.BoxedValues.box;

import org.eclipse.ecl.core.BoxedValue;

public class MinusService extends BinaryOpService {

	protected BoxedValue doDoubleOp(double left, double right) {
		return box(left - right);
	}

	protected BoxedValue doFloatOp(float left, float right) {
		return box(left - right);
	}

	protected BoxedValue doIntOp(int left, int right) {
		return box(left - right);
	}

	protected BoxedValue doLongOp(long left, long right) {
		return box(left - right);
	}

}
