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

import org.eclipse.ecl.internal.core.Session;

import com.xored.espace.memory.MemorySpace;

public class EclRuntime {

	public static ISession createSession() {
		return new Session(new MemorySpace());
	}
}
