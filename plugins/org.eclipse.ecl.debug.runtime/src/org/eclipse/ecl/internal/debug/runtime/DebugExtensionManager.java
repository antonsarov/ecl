package org.eclipse.ecl.internal.debug.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ecl.debug.runtime.IEclDebugExtension;

public class DebugExtensionManager {
	private class Entry {
		String id;
		int priority;
		IEclDebugExtension provider;
	}

	private static DebugExtensionManager instance;

	private List<Entry> providers = null;

	public static synchronized DebugExtensionManager getInstance() {
		if (instance == null) {
			instance = new DebugExtensionManager();
		}
		return instance;
	}

	public List<IEclDebugExtension> getExtensions() {
		initialize();
		List<IEclDebugExtension> result = new ArrayList<IEclDebugExtension>();
		for (Entry e : providers) {
			result.add(e.provider);
		}
		return result;
	}

	private synchronized void initialize() {
		if (providers == null) {
			providers = new ArrayList<Entry>();

			IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor(
					EclDebugRuntimePlugin.PLUGIN_ID,
					"eclDebugExtension");
			for (IConfigurationElement e : elements) {
				try {
					Entry ee = new Entry();
					ee.id = e.getAttribute("id");
					ee.priority = Integer.parseInt(e.getAttribute("priority"));
					ee.provider = (IEclDebugExtension) e.createExecutableExtension("class");
					providers.add(ee);
				} catch (Exception eee) {
					EclDebugRuntimePlugin.log(eee.getMessage(), eee);
				}
			}
			Collections.sort(providers, new Comparator<Entry>() {
				@Override
				public int compare(Entry arg0, Entry arg1) {
					return Integer.valueOf(arg0.priority).compareTo(Integer.valueOf(arg1.priority));
				}
			});
		}
	}
}
