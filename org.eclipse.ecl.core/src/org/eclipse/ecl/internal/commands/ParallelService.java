/*******************************************************************************
 * Copyright (c) 2008 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Andrey Platov)
 *******************************************************************************/

package org.eclipse.ecl.internal.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Parallel;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class ParallelService implements ICommandService {

	public IStatus service(Command command, IProcess process) throws InterruptedException, CoreException {
		List<IProcess> processes = new ArrayList<IProcess>();
		Parallel seq = (Parallel)command;
		for (Command cmd: seq.getCommands()) {
			processes.add(process.getSession().execute(cmd, null, null));
		}		
		for (IProcess p: processes) {
			p.waitFor();
		}
		return Status.OK_STATUS;
	}

}
