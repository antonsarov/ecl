/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.data.commands;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.data.commands.CommandsPackage
 * @generated
 */
public interface CommandsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandsFactory eINSTANCE = org.eclipse.ecl.data.commands.impl.CommandsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Read Csv File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Csv File</em>'.
	 * @generated
	 */
	ReadCsvFile createReadCsvFile();

	/**
	 * Returns a new object of class '<em>Print</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Print</em>'.
	 * @generated
	 */
	Print createPrint();

	/**
	 * Returns a new object of class '<em>Write Csv File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Csv File</em>'.
	 * @generated
	 */
	WriteCsvFile createWriteCsvFile();

	/**
	 * Returns a new object of class '<em>Exclude Columns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclude Columns</em>'.
	 * @generated
	 */
	ExcludeColumns createExcludeColumns();

	/**
	 * Returns a new object of class '<em>Select Columns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Columns</em>'.
	 * @generated
	 */
	SelectColumns createSelectColumns();

	/**
	 * Returns a new object of class '<em>Assert Tables Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assert Tables Match</em>'.
	 * @generated
	 */
	AssertTablesMatch createAssertTablesMatch();

	/**
	 * Returns a new object of class '<em>Write Lines</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write Lines</em>'.
	 * @generated
	 */
	WriteLines createWriteLines();

	/**
	 * Returns a new object of class '<em>Read Lines</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Lines</em>'.
	 * @generated
	 */
	ReadLines createReadLines();

	/**
	 * Returns a new object of class '<em>Select Rows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Rows</em>'.
	 * @generated
	 */
	SelectRows createSelectRows();

	/**
	 * Returns a new object of class '<em>Exclude Rows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclude Rows</em>'.
	 * @generated
	 */
	ExcludeRows createExcludeRows();

	/**
	 * Returns a new object of class '<em>As Table Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>As Table Data</em>'.
	 * @generated
	 */
	AsTableData createAsTableData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommandsPackage getCommandsPackage();

} //CommandsFactory
