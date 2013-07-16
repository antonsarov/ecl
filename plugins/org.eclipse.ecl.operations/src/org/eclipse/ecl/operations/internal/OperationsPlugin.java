package org.eclipse.ecl.operations.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.BundleContext;

public class OperationsPlugin extends Plugin {

	private static OperationsPlugin plugin = null;
	public static final String PLUGIN_ID = "org.eclipse.ecl.operations";

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	public static OperationsPlugin getDefault() {
		return plugin;
	}

	public static IStatus createErr(Throwable cause, String format,
			Object... args) {
		return createStatus(IStatus.ERROR, cause, format, args);
	}

	public static IStatus createErr(String format, Object... args) {
		return createErr(null, format, args);
	}

	public static IStatus createStatus(int severity, Throwable cause,
			String format, Object... args) {
		return new Status(severity, PLUGIN_ID, String.format(format, args),
				cause);
	}
}
