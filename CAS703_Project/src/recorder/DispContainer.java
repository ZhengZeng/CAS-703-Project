/**
 */
package recorder;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disp Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link recorder.DispContainer#getDisplays <em>Displays</em>}</li>
 * </ul>
 * </p>
 *
 * @see recorder.RecorderPackage#getDispContainer()
 * @model
 * @generated
 */
public interface DispContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Displays</b></em>' containment reference list.
	 * The list contents are of type {@link recorder.RecDisplay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displays</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displays</em>' containment reference list.
	 * @see recorder.RecorderPackage#getDispContainer_Displays()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<RecDisplay> getDisplays();

} // DispContainer
