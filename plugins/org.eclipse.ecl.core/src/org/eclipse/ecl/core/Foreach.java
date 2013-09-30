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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreach</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.core.Foreach#getItem <em>Item</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.Foreach#getDo <em>Do</em>}</li>
 *   <li>{@link org.eclipse.ecl.core.Foreach#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.core.CorePackage#getForeach()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Reads objects from input pipe and for each object executes a given <code>do</code> command for each item. An optional variable declaration to hold a current value can be passed, if it is not passed, then current value is sent into an input pipe of a <code>do</code> command.  ' returns='An aggregated output of <code>do</code> command' example='// Implicit item: sent to an input pipe of inner script\nlist-launch-configurations | foreach { get name | log }\n\n// Explicit item:\nlist-launch-configuration | foreach [val item] {\n   $item | get-name | log\n}'"
 * @generated
 */
public interface Foreach extends Command {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(Val)
	 * @see org.eclipse.ecl.core.CorePackage#getForeach_Item()
	 * @model containment="true"
	 * @generated
	 */
	Val getItem();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.Foreach#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Val value);

	/**
	 * Returns the value of the '<em><b>Do</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Do</em>' containment reference.
	 * @see #setDo(Command)
	 * @see org.eclipse.ecl.core.CorePackage#getForeach_Do()
	 * @model containment="true"
	 * @generated
	 */
	Command getDo();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.core.Foreach#getDo <em>Do</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do</em>' containment reference.
	 * @see #getDo()
	 * @generated
	 */
	void setDo(Command value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see org.eclipse.ecl.core.CorePackage#getForeach_Input()
	 * @model
	 * @generated
	 */
	EList<EObject> getInput();

} // Foreach
