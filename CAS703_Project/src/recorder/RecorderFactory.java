/**
 */
package recorder;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see recorder.RecorderPackage
 * @generated
 */
public interface RecorderFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RecorderFactory eINSTANCE = recorder.impl.RecorderFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rec File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rec File</em>'.
	 * @generated
	 */
	RecFile createRecFile();

	/**
	 * Returns a new object of class '<em>Rec Mem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rec Mem</em>'.
	 * @generated
	 */
	RecMem createRecMem();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	RecorderModel createRecorderModel();

	/**
	 * Returns a new object of class '<em>Normal Btn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Btn</em>'.
	 * @generated
	 */
	NormalBtn createNormalBtn();

	/**
	 * Returns a new object of class '<em>Disp LCD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disp LCD</em>'.
	 * @generated
	 */
	DispLCD createDispLCD();

	/**
	 * Returns a new object of class '<em>Button Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Container</em>'.
	 * @generated
	 */
	ButtonContainer createButtonContainer();

	/**
	 * Returns a new object of class '<em>Disp Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disp Container</em>'.
	 * @generated
	 */
	DispContainer createDispContainer();

	/**
	 * Returns a new object of class '<em>Memory Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory Container</em>'.
	 * @generated
	 */
	MemoryContainer createMemoryContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RecorderPackage getRecorderPackage();

} //RecorderFactory
