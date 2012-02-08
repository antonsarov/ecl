/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc - initial API and implementation
 ******************************************************************************/
package org.eclipse.ecl.core;

import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.core.runtime.IStatus;

public class SessionListenerManager {

	public static void addListener(ISessionListener listener) {
		listeners.addIfAbsent(listener);
	}

	public static void removeListener(ISessionListener listener) {
		listeners.remove(listener);
	}

	public static void beginCommand(Command cmd) {
		for (ISessionListener l : listeners) {
			l.beginCommand(cmd);
		}
	}

	public static void endCommand(Command cmd, IStatus s) {
		for (ISessionListener l : listeners) {
			l.endCommand(cmd, s);
		}
	}

	private static CopyOnWriteArrayList<ISessionListener> listeners = new CopyOnWriteArrayList<ISessionListener>();

}
