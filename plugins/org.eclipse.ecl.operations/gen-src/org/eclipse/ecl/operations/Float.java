/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.operations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.ecl.operations.OperationsPackage#getFloat()
 * @model annotation="http://www.eclipse.org/ecl/docs description='Converts its argument to float.' returns='<p>Returns float value or fails if value cannot be converted. <code>true</code> is converted to <code>1.0</code> and <code>false</code> is converted to <code>0</code>. This command uses <code>java.lang.Float.parseFloat</code> method, but also supports a few additional text values for infinity:</p>\n<ul>\n  <li><b>+inf</b> &ndash; returns <code>Float.POSITIVE_INFINITY</code></li>\n  <li><b>inf</b> &ndash; returns <code>Float.POSITIVE_INFINITY</code></li>\n  <li><b>-inf</b> &ndash; returns <code>Float.NEGATIVE_INFINITY</code></li>\n</ul>'"
 * @generated
 */
public interface Float extends Convert {
} // Float
