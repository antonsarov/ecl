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
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.perf;

import org.eclipse.ecl.core.Command;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrain Max</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.perf.ConstrainMax#getCounter <em>Counter</em>}</li>
 *   <li>{@link org.eclipse.ecl.perf.ConstrainMax#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.ecl.perf.ConstrainMax#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.perf.PerfPackage#getConstrainMax()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Takes a property name and a number. Reads from the input stream object, takes his property and compares with a defined value.' returns='True if received number is less or equal to defined value. False if number is greater than defined value.' example='measure-time \"MyCounterName\" {\r\n   // some ECL script\r\n} | constrain-max duration 2000 \r\n// fail if the operation was more than 2 seconds with a message \r\n//Max constraint violation: \'MyCounterName\' duration is 100500 which is greater than 2000.'"
 * @generated
 */
public interface ConstrainMax extends Command {
	/**
	 * Returns the value of the '<em><b>Counter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' reference.
	 * @see #setCounter(EObject)
	 * @see org.eclipse.ecl.perf.PerfPackage#getConstrainMax_Counter()
	 * @model
	 * @generated
	 */
	EObject getCounter();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.perf.ConstrainMax#getCounter <em>Counter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' reference.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(EObject value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' attribute.
	 * @see #setProperty(String)
	 * @see org.eclipse.ecl.perf.PerfPackage#getConstrainMax_Property()
	 * @model
	 * @generated
	 */
	String getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.perf.ConstrainMax#getProperty <em>Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' attribute.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.eclipse.ecl.perf.PerfPackage#getConstrainMax_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.perf.ConstrainMax#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // ConstrainMax
