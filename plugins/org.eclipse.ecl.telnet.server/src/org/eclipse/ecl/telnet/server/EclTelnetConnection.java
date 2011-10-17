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
package org.eclipse.ecl.telnet.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.ecl.eclsh.AbstractEclShellConnection;

public class EclTelnetConnection extends AbstractEclShellConnection {
	InputStream inputStream;

	public void disconnect() {
		super.disconnect();
		try {
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void connect(InputStream inputStream, OutputStream outputStream) {
		this.inputStream = inputStream;
		connect(outputStream);
	}

	@Override
	public InputStream getInputStream() {
		return inputStream;
	}

	@Override
	public void processSymbol(char c) {
		super.processSymbol(c);
		// try {
		// outputStream.write((byte) c);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
	}

	protected void outputNewLine() {
		try {
			outputStream.write(13);
			outputStream.write(10);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
