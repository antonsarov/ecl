/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;

import org.eclipse.ecl.core.Command;
import org.eclipse.ecl.core.Val;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.ecl.operations.Loop#getVals <em>Vals</em>}</li>
 *   <li>{@link org.eclipse.ecl.operations.Loop#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getLoop()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Executes recursive looping of a body. Allows to emulate \'while\' and \'for\' loops while preserving variable immutability. The idea is taken from Clojure\'s <a href=\"http://clojure.org/functional_programming#Functional%20Programming--Recursive%20Looping\">loop/recur</a> approach. Also see <a href=\"#recur\">recur</a> command.' example='// Example 1. returns how many times a 81 is divisible by 3\nloop [val count 0] [val n 81] {\n    if [mod $n 3 | eq 0] {\n        recur [$count | plus 1] [$n | div 3]\n    } -else {\n        log [format \"The answer is %d\" $count] //prints \'The answer is 4\'\n    }\n}\n\n\n// Example 2. deletes all elements from a tree\nproc \"get-my-tree\" { get-view \"My View\" | get-tree }\n\nproc \"has-elements\" {\n    get-my-tree | get-property itemCount -raw | int | gt 0\n}\n\nloop {\n    if [has-elements] {\n        // Selects a first top-level item and invokes \"Delete\" from context menu\n        get-my-tree | select \".*\" | get-menu \"Delete\" | click\n        // Confirms a removal in popup dialog\n        get-window \"Confirm Delete\" | get-button OK | click\n        // Continues execution from the beginning of loop body\n        recur\n    }\n}'"
 * @generated
 */
public interface Loop extends Command {
	/**
	 * Returns the value of the '<em><b>Vals</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.ecl.core.Val}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vals</em>' containment reference list.
	 * @see org.eclipse.ecl.operations.OperationsPackage#getLoop_Vals()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/ecl/docs description='Valus which are going to be modified during iterations. All initial values must be set.'"
	 * @generated
	 */
	EList<Val> getVals();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(Command)
	 * @see org.eclipse.ecl.operations.OperationsPackage#getLoop_Body()
	 * @model annotation="http://www.eclipse.org/ecl/docs description='A script to execute. Whenever script invokes <a href=\"#recur\">recur</a> command, an execution jumps to the beginning of loop body script.'"
	 * @generated
	 */
	Command getBody();

	/**
	 * Sets the value of the '{@link org.eclipse.ecl.operations.Loop#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(Command value);

} // Loop
