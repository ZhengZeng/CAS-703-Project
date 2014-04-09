/**
 */
package recorder;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link recorder.ButtonContainer#getButtons <em>Buttons</em>}</li>
 * </ul>
 * </p>
 *
 * @see recorder.RecorderPackage#getButtonContainer()
 * @model
 * @generated
 */
public interface ButtonContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Buttons</b></em>' containment reference list.
	 * The list contents are of type {@link recorder.RecButton}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buttons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttons</em>' containment reference list.
	 * @see recorder.RecorderPackage#getButtonContainer_Buttons()
	 * @model containment="true" lower="2" upper="10"
	 * @generated
	 */
	EList<RecButton> getButtons();

} // ButtonContainer
