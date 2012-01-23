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
package org.eclipse.ecl.server.tcp;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public enum EclTcpServerManager {
	Instance;

	private final Map<Integer, EclTcpServer> servers = new HashMap<Integer, EclTcpServer>();

	public EclTcpServer startServer(int port) throws IOException {
		return startServer(port, true, false);
	}

	public synchronized EclTcpServer startServer(int port, boolean useJobs,
			boolean useFixedPool) throws IOException {
		EclTcpServer server = servers.get(port);
		if (server == null) {
			EclTcpServer newServer = new EclTcpServer(port, useJobs,
					useFixedPool);
			newServer.start();
			while (newServer.isStarting()) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// Ignore
				}
			}
			servers.put(port, newServer);
			return newServer;
		} else {
			throw new IOException("Another server is already running on port "
					+ port);
		}
	}

	public synchronized void stopServer(int port) throws IOException {
		EclTcpServer server = servers.remove(port);
		if (server != null) {
			server.interrupt();
		} else {
			throw new IOException("No server found on port " + port);
		}
	}

	public synchronized EclTcpServer getServer(int port) {
		return servers.get(port);
	}

	public synchronized void terminateAll() {
		HashSet<Integer> ports = new HashSet<Integer>(servers.keySet());
		for (int i : ports) {
			try {
				stopServer(i);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
