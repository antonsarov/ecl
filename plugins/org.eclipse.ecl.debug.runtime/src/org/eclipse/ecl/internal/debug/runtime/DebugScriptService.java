/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Yuri Strot)
 *******************************************************************************/
package org.eclipse.ecl.internal.debug.runtime;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.debug.commands.CommandsFactory;
import org.eclipse.ecl.debug.commands.DebugCommand;
import org.eclipse.ecl.debug.commands.DebugScript;
import org.eclipse.ecl.parser.EclCoreParser;
import org.eclipse.ecl.runtime.ICommandService;
import org.eclipse.ecl.runtime.IProcess;

public class DebugScriptService implements ICommandService {

	public IStatus service(Command command, IProcess context)
			throws InterruptedException, CoreException {
		DebugScript s = (DebugScript) command;

		String content = s.getContent();
		if (content == null || content.length() == 0)
			return Status.OK_STATUS;
		Command c = EclCoreParser.newCommand(content);
		DebugCommand dc = CommandsFactory.eINSTANCE.createDebugCommand();
		dc.setCommand(c);
		dc.setPath(s.getPath());
		dc.setSession(s.getSession());

		IProcess process = context.getSession().execute(c);
		return process.waitFor();
	}

}
