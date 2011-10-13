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
package org.eclipse.ecl.core.util;

public class EclCommandNameConvention {
	public static String toCommandName(String scriptletName) {
		StringBuffer result = new StringBuffer();
		for (int index = 0; index < scriptletName.length(); index++) {
			char symbol = scriptletName.charAt(index);
			if (Character.isUpperCase(symbol)) {
				if (index != 0)
					result.append('-');
				symbol = Character.toLowerCase(symbol);
			}
			result.append(symbol);
		}

		return result.toString();
	}

	public static String toScriptletName(String commandName) {
		StringBuffer result = new StringBuffer();
		for (int index = 0; index < commandName.length(); index++) {
			char ch = commandName.charAt(index);
			if (ch == '-') {
				index++;
				if (index >= commandName.length())
					return null;
				ch = Character.toUpperCase(commandName.charAt(index));
			}
			if (index == 0)
				ch = Character.toUpperCase(ch);
			result.append(ch);
		}
		return result.toString();
	}
}
