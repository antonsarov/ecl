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
package org.eclipse.ecl.internal.server.tcp.ui;

import java.io.IOException;

import org.eclipse.ecl.server.tcp.EclTcpServerManager;
import org.eclipse.ui.IStartup;

public class ServerStarter implements IStartup {

	private static final String ECL_SERVER_PORT = "eclPort";

	public void earlyStartup() {
		try {
			String port = System.getProperty(ECL_SERVER_PORT);
			if (port != null)
				EclTcpServerManager.Instance
						.startServer(Integer.parseInt(port));
			// else
			// EclTcp.runServer(5378);
		} catch (NumberFormatException e) {
			Activator.log("Ecl server port is incorrect.", e);
		} catch (IOException e) {
			Activator.log(e);
		}
	}
}
