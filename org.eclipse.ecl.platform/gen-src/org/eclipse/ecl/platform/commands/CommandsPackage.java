/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.ecl.platform.commands;

import org.eclipse.ecl.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.ecl.platform.commands.CommandsFactory
 * @model kind="package"
 * @generated
 */
public interface CommandsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "commands";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/ecl/platform/commands.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "platformCommands";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommandsPackage eINSTANCE = org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.commands.impl.ListPluginsImpl <em>List Plugins</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.commands.impl.ListPluginsImpl
	 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getListPlugins()
	 * @generated
	 */
	int LIST_PLUGINS = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PLUGINS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PLUGINS__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>List Plugins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PLUGINS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.commands.impl.ListFeaturesImpl <em>List Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.commands.impl.ListFeaturesImpl
	 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getListFeatures()
	 * @generated
	 */
	int LIST_FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURES__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURES__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>List Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURES_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.commands.impl.ListRepositoriesImpl <em>List Repositories</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.commands.impl.ListRepositoriesImpl
	 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getListRepositories()
	 * @generated
	 */
	int LIST_REPOSITORIES = 2;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORIES__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORIES__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>List Repositories</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORIES_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.commands.impl.AddRepositoryImpl <em>Add Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.commands.impl.AddRepositoryImpl
	 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getAddRepository()
	 * @generated
	 */
	int ADD_REPOSITORY = 3;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REPOSITORY__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REPOSITORY__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REPOSITORY__URI = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REPOSITORY__NAME = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REPOSITORY_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.commands.impl.RemoveRepositoryImpl <em>Remove Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.commands.impl.RemoveRepositoryImpl
	 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getRemoveRepository()
	 * @generated
	 */
	int REMOVE_REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REPOSITORY__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REPOSITORY__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REPOSITORY__URI = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REPOSITORY_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.commands.impl.UpdateFeatureImpl <em>Update Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.commands.impl.UpdateFeatureImpl
	 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getUpdateFeature()
	 * @generated
	 */
	int UPDATE_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE__ID = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Update Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FEATURE_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.commands.impl.UpdateAllImpl <em>Update All</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.commands.impl.UpdateAllImpl
	 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getUpdateAll()
	 * @generated
	 */
	int UPDATE_ALL = 6;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ALL__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ALL__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Update All</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ALL_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.commands.impl.PrintImpl <em>Print</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.commands.impl.PrintImpl
	 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getPrint()
	 * @generated
	 */
	int PRINT = 7;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>Print</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINT_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.commands.impl.SortByImpl <em>Sort By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.commands.impl.SortByImpl
	 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getSortBy()
	 * @generated
	 */
	int SORT_BY = 8;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY__FIELD = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sort By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.commands.impl.ListInstallUnitsImpl <em>List Install Units</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.commands.impl.ListInstallUnitsImpl
	 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getListInstallUnits()
	 * @generated
	 */
	int LIST_INSTALL_UNITS = 9;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_INSTALL_UNITS__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_INSTALL_UNITS__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The number of structural features of the '<em>List Install Units</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_INSTALL_UNITS_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.eclipse.ecl.platform.commands.impl.GetLogImpl <em>Get Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.ecl.platform.commands.impl.GetLogImpl
	 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getGetLog()
	 * @generated
	 */
	int GET_LOG = 10;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_LOG__HOST = CorePackage.COMMAND__HOST;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_LOG__BINDINGS = CorePackage.COMMAND__BINDINGS;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_LOG__LIMIT = CorePackage.COMMAND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skip Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_LOG__SKIP_INFO = CorePackage.COMMAND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Get Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_LOG_FEATURE_COUNT = CorePackage.COMMAND_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.commands.ListPlugins <em>List Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Plugins</em>'.
	 * @see org.eclipse.ecl.platform.commands.ListPlugins
	 * @generated
	 */
	EClass getListPlugins();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.commands.ListFeatures <em>List Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Features</em>'.
	 * @see org.eclipse.ecl.platform.commands.ListFeatures
	 * @generated
	 */
	EClass getListFeatures();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.commands.ListRepositories <em>List Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Repositories</em>'.
	 * @see org.eclipse.ecl.platform.commands.ListRepositories
	 * @generated
	 */
	EClass getListRepositories();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.commands.AddRepository <em>Add Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Repository</em>'.
	 * @see org.eclipse.ecl.platform.commands.AddRepository
	 * @generated
	 */
	EClass getAddRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.platform.commands.AddRepository#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.ecl.platform.commands.AddRepository#getUri()
	 * @see #getAddRepository()
	 * @generated
	 */
	EAttribute getAddRepository_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.platform.commands.AddRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.ecl.platform.commands.AddRepository#getName()
	 * @see #getAddRepository()
	 * @generated
	 */
	EAttribute getAddRepository_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.commands.RemoveRepository <em>Remove Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Repository</em>'.
	 * @see org.eclipse.ecl.platform.commands.RemoveRepository
	 * @generated
	 */
	EClass getRemoveRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.platform.commands.RemoveRepository#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.ecl.platform.commands.RemoveRepository#getUri()
	 * @see #getRemoveRepository()
	 * @generated
	 */
	EAttribute getRemoveRepository_Uri();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.commands.UpdateFeature <em>Update Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Feature</em>'.
	 * @see org.eclipse.ecl.platform.commands.UpdateFeature
	 * @generated
	 */
	EClass getUpdateFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.platform.commands.UpdateFeature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.ecl.platform.commands.UpdateFeature#getId()
	 * @see #getUpdateFeature()
	 * @generated
	 */
	EAttribute getUpdateFeature_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.commands.UpdateAll <em>Update All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update All</em>'.
	 * @see org.eclipse.ecl.platform.commands.UpdateAll
	 * @generated
	 */
	EClass getUpdateAll();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.commands.Print <em>Print</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Print</em>'.
	 * @see org.eclipse.ecl.platform.commands.Print
	 * @generated
	 */
	EClass getPrint();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.commands.SortBy <em>Sort By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort By</em>'.
	 * @see org.eclipse.ecl.platform.commands.SortBy
	 * @generated
	 */
	EClass getSortBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.platform.commands.SortBy#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.eclipse.ecl.platform.commands.SortBy#getField()
	 * @see #getSortBy()
	 * @generated
	 */
	EAttribute getSortBy_Field();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.commands.ListInstallUnits <em>List Install Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Install Units</em>'.
	 * @see org.eclipse.ecl.platform.commands.ListInstallUnits
	 * @generated
	 */
	EClass getListInstallUnits();

	/**
	 * Returns the meta object for class '{@link org.eclipse.ecl.platform.commands.GetLog <em>Get Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Log</em>'.
	 * @see org.eclipse.ecl.platform.commands.GetLog
	 * @generated
	 */
	EClass getGetLog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.platform.commands.GetLog#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see org.eclipse.ecl.platform.commands.GetLog#getLimit()
	 * @see #getGetLog()
	 * @generated
	 */
	EAttribute getGetLog_Limit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.ecl.platform.commands.GetLog#isSkipInfo <em>Skip Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip Info</em>'.
	 * @see org.eclipse.ecl.platform.commands.GetLog#isSkipInfo()
	 * @see #getGetLog()
	 * @generated
	 */
	EAttribute getGetLog_SkipInfo();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommandsFactory getCommandsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.commands.impl.ListPluginsImpl <em>List Plugins</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.commands.impl.ListPluginsImpl
		 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getListPlugins()
		 * @generated
		 */
		EClass LIST_PLUGINS = eINSTANCE.getListPlugins();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.commands.impl.ListFeaturesImpl <em>List Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.commands.impl.ListFeaturesImpl
		 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getListFeatures()
		 * @generated
		 */
		EClass LIST_FEATURES = eINSTANCE.getListFeatures();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.commands.impl.ListRepositoriesImpl <em>List Repositories</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.commands.impl.ListRepositoriesImpl
		 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getListRepositories()
		 * @generated
		 */
		EClass LIST_REPOSITORIES = eINSTANCE.getListRepositories();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.commands.impl.AddRepositoryImpl <em>Add Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.commands.impl.AddRepositoryImpl
		 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getAddRepository()
		 * @generated
		 */
		EClass ADD_REPOSITORY = eINSTANCE.getAddRepository();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_REPOSITORY__URI = eINSTANCE.getAddRepository_Uri();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_REPOSITORY__NAME = eINSTANCE.getAddRepository_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.commands.impl.RemoveRepositoryImpl <em>Remove Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.commands.impl.RemoveRepositoryImpl
		 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getRemoveRepository()
		 * @generated
		 */
		EClass REMOVE_REPOSITORY = eINSTANCE.getRemoveRepository();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_REPOSITORY__URI = eINSTANCE.getRemoveRepository_Uri();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.commands.impl.UpdateFeatureImpl <em>Update Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.commands.impl.UpdateFeatureImpl
		 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getUpdateFeature()
		 * @generated
		 */
		EClass UPDATE_FEATURE = eINSTANCE.getUpdateFeature();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_FEATURE__ID = eINSTANCE.getUpdateFeature_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.commands.impl.UpdateAllImpl <em>Update All</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.commands.impl.UpdateAllImpl
		 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getUpdateAll()
		 * @generated
		 */
		EClass UPDATE_ALL = eINSTANCE.getUpdateAll();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.commands.impl.PrintImpl <em>Print</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.commands.impl.PrintImpl
		 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getPrint()
		 * @generated
		 */
		EClass PRINT = eINSTANCE.getPrint();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.commands.impl.SortByImpl <em>Sort By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.commands.impl.SortByImpl
		 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getSortBy()
		 * @generated
		 */
		EClass SORT_BY = eINSTANCE.getSortBy();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORT_BY__FIELD = eINSTANCE.getSortBy_Field();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.commands.impl.ListInstallUnitsImpl <em>List Install Units</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.commands.impl.ListInstallUnitsImpl
		 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getListInstallUnits()
		 * @generated
		 */
		EClass LIST_INSTALL_UNITS = eINSTANCE.getListInstallUnits();

		/**
		 * The meta object literal for the '{@link org.eclipse.ecl.platform.commands.impl.GetLogImpl <em>Get Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.ecl.platform.commands.impl.GetLogImpl
		 * @see org.eclipse.ecl.platform.commands.impl.CommandsPackageImpl#getGetLog()
		 * @generated
		 */
		EClass GET_LOG = eINSTANCE.getGetLog();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_LOG__LIMIT = eINSTANCE.getGetLog_Limit();

		/**
		 * The meta object literal for the '<em><b>Skip Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_LOG__SKIP_INFO = eINSTANCE.getGetLog_SkipInfo();

	}

} //CommandsPackage