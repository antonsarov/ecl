package org.eclipse.ecl.platform.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class PlatformUIPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.ecl.platform.ui"; //$NON-NLS-1$

	// The shared instance
	private static PlatformUIPlugin plugin;

	/**
	 * The constructor
	 */
	public PlatformUIPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static PlatformUIPlugin getDefault() {
		return plugin;
	}

	public static IStatus createError(Throwable cause, String format,
			Object... args) {
		return new Status(IStatus.ERROR, PLUGIN_ID,
				String.format(format, args), cause);
	}

	public static IStatus createError(String format, Object... args) {
		return createError(null, format, args);
	}
}
