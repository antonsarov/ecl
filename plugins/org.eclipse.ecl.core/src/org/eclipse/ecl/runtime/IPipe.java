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

package org.eclipse.ecl.runtime;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;

public interface IPipe {
	/**
	 * Take an object from the pipe.
	 * 
	 * @param timeout
	 *            How long the client is willing to wait for a proper matching
	 *            entry.
	 * @return object or status
	 * @throws InterruptedException
	 * @throws CoreException
	 */
	Object take(long timeout) throws CoreException;

	/**
	 * Write a new object into the pipe.
	 * 
	 * @param object
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws CoreException
	 * @throws CoreException
	 */
	IPipe write(Object object) throws CoreException;

	/**
	 * Close pipe. If status is null
	 * {@link org.eclipse.core.runtime.CoreExeption <em>CoreExeption</em>} will
	 * be thrown
	 * 
	 * @param status
	 * @throws CoreException
	 * @throws InterruptedException
	 */
	IPipe close(IStatus status) throws CoreException;

	void reinit();

	boolean isClosed();

}
