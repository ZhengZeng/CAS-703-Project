/**
 */
package recorder.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import recorder.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see recorder.RecorderPackage
 * @generated
 */
public class RecorderSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RecorderPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecorderSwitch() {
		if (modelPackage == null) {
			modelPackage = RecorderPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RecorderPackage.REC_COMPONENT: {
				RecComponent recComponent = (RecComponent)theEObject;
				T result = caseRecComponent(recComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RecorderPackage.REC_DISPLAY: {
				RecDisplay recDisplay = (RecDisplay)theEObject;
				T result = caseRecDisplay(recDisplay);
				if (result == null) result = caseRecComponent(recDisplay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RecorderPackage.REC_BUTTON: {
				RecButton recButton = (RecButton)theEObject;
				T result = caseRecButton(recButton);
				if (result == null) result = caseRecComponent(recButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RecorderPackage.REC_FILE: {
				RecFile recFile = (RecFile)theEObject;
				T result = caseRecFile(recFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RecorderPackage.REC_MEM: {
				RecMem recMem = (RecMem)theEObject;
				T result = caseRecMem(recMem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RecorderPackage.RECORDER_MODEL: {
				RecorderModel recorderModel = (RecorderModel)theEObject;
				T result = caseRecorderModel(recorderModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RecorderPackage.NORMAL_BTN: {
				NormalBtn normalBtn = (NormalBtn)theEObject;
				T result = caseNormalBtn(normalBtn);
				if (result == null) result = caseRecButton(normalBtn);
				if (result == null) result = caseRecComponent(normalBtn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RecorderPackage.DISP_LCD: {
				DispLCD dispLCD = (DispLCD)theEObject;
				T result = caseDispLCD(dispLCD);
				if (result == null) result = caseRecDisplay(dispLCD);
				if (result == null) result = caseRecComponent(dispLCD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RecorderPackage.BUTTON_CONTAINER: {
				ButtonContainer buttonContainer = (ButtonContainer)theEObject;
				T result = caseButtonContainer(buttonContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RecorderPackage.DISP_CONTAINER: {
				DispContainer dispContainer = (DispContainer)theEObject;
				T result = caseDispContainer(dispContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RecorderPackage.MEMORY_CONTAINER: {
				MemoryContainer memoryContainer = (MemoryContainer)theEObject;
				T result = caseMemoryContainer(memoryContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rec Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rec Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecComponent(RecComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rec Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rec Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecDisplay(RecDisplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rec Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rec Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecButton(RecButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rec File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rec File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecFile(RecFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rec Mem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rec Mem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecMem(RecMem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecorderModel(RecorderModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Btn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Btn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalBtn(NormalBtn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disp LCD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disp LCD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispLCD(DispLCD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonContainer(ButtonContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disp Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disp Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDispContainer(DispContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryContainer(MemoryContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RecorderSwitch
