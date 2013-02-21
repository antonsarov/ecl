package org.eclipse.ecl.platform.internal.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.platform.commands.GetLog;
import org.eclipse.ecl.platform.internal.PlatformPlugin;
import org.eclipse.ecl.platform.internal.log.LogEntry;
import org.eclipse.ecl.platform.internal.log.LogReader;
import org.eclipse.ecl.platform.util.EclPlatformUtil;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class GetLogService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		if (!(command instanceof GetLog)) {
			return Status.CANCEL_STATUS;
		}
		GetLog getLog = (GetLog) command;
		List<LogEntry> entries = new ArrayList<LogEntry>();

		List<Integer> severitiesToLog = new ArrayList<Integer>();
		if (getLog.getLevels().isEmpty()) {
			severitiesToLog.addAll(Arrays.asList(IStatus.ERROR,
					IStatus.WARNING, IStatus.OK, IStatus.CANCEL, IStatus.INFO));
		} else {
			for (String level : getLog.getLevels()) {
				if (!LogService.severities.containsKey(level.toLowerCase())) {
					return new Status(
							IStatus.ERROR,
							PlatformPlugin.PLUGIN_ID,
							String.format("Unknown log entry level '%s'", level));
				}
				severitiesToLog.add(LogService.severities.get(level
						.toLowerCase()));
			}
		}

		LogReader.parseLogFile(Platform.getLogFileLocation().toFile(), entries,
				getLog.getLimit(), false, severitiesToLog);

		for (LogEntry entry : entries) {
			context.getOutput().write(EclPlatformUtil.createMessage(entry));
		}
		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}

}
