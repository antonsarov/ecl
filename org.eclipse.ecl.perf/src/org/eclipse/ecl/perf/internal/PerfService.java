package org.eclipse.ecl.perf.internal;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ecl.perf.PerfCounter;
import org.eclipse.ecl.perf.PerfFactory;

public class PerfService {

	public synchronized void startTimeMeasure(String label) {
		if (times.containsKey(label)) {
			EclPerfPlugin
					.logWarn(String
							.format("Request to start time measure for %s which is already running",
									label));
		}

		times.put(label, System.currentTimeMillis());
	}

	public synchronized PerfCounter stopTimeMeasure(String label) {
		long endTime = System.currentTimeMillis();
		PerfCounter result = PerfFactory.eINSTANCE.createPerfCounter();
		result.setName(label);
		if (!times.containsKey(label)) {
			EclPerfPlugin
					.logWarn(String
							.format("Request to stop time measure for %s which has not been started",
									label));
			result.setDuration(0);
			return result;
		}
		result.setDuration((int) (endTime - times.get(label)));
		return result;
	}

	private Map<String, Long> times = new HashMap<String, Long>();
}
