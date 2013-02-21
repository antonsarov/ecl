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
package org.eclipse.ecl.internal.core;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.CommandStack;
import org.eclipse.ecl.runtime.ICommandService;

public class CommandSession extends AbstractSession {

	private final CommandStack stack;
	private final AbstractRootSession session;

	public CommandSession(AbstractRootSession session, CommandStack stack) {
		this.session = session;
		this.stack = stack;
	}

	@Override
	protected AbstractRootSession getRoot() {
		return session;
	}

	@Override
	protected void doExecute(Command scriptlet, ICommandService svc,
			List<Object> inputContent, Process process) {
		session.doExecute(scriptlet, svc, inputContent, process);
	}

	@Override
	protected CommandStack getStack() {
		return stack;
	}

	// @Override
	// public void reconnect() throws CoreException {
	// session.reconnect();
	// }

	public void close() throws CoreException {
		session.close();
	}

	public boolean isClosed() {
		return session.isClosed();
	}

}
