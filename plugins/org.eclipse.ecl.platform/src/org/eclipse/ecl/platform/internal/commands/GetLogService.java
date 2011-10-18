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
import org.eclipse.ecl.platform.internal.log.LogEntry;
import org.eclipse.ecl.platform.internal.log.LogReader;
import org.eclipse.ecl.platform.objects.LogMessage;
import org.eclipse.ecl.platform.objects.ObjectsFactory;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class GetLogService implements ICommandService {

	@Override
	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		GetLog getLog = (GetLog) command;
		List<LogEntry> entries = new ArrayList<LogEntry>();
		
		List<Integer> severitiesToLog = new ArrayList<Integer>(Arrays.asList(IStatus.ERROR, IStatus.WARNING, IStatus.OK));
		if(!getLog.isSkipInfo()) {
			severitiesToLog.add(IStatus.INFO);
		}
		LogReader.parseLogFile(Platform.getLogFileLocation().toFile(), 
				entries, getLog.getLimit(), false, severitiesToLog);
		
		for(LogEntry entry : entries) {
			context.getOutput().write(createMessage(entry));
		}
		context.getOutput().close(Status.OK_STATUS);
		return Status.OK_STATUS;
	}
	
	private static LogMessage createMessage(LogEntry entry) {
		LogMessage result = ObjectsFactory.eINSTANCE.createLogMessage();
		result.setDateText(entry.getFormattedDate());
		result.setMessage(entry.getMessage());
		result.setSeverity(entry.getSeverityText());
		result.setPluginId(entry.getPluginId());
		return result;
	}

}