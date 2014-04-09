/**
 */
package recorder;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memory Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link recorder.MemoryContainer#getMemories <em>Memories</em>}</li>
 * </ul>
 * </p>
 *
 * @see recorder.RecorderPackage#getMemoryContainer()
 * @model
 * @generated
 */
public interface MemoryContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Memories</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memories</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memories</em>' containment reference.
	 * @see #setMemories(RecMem)
	 * @see recorder.RecorderPackage#getMemoryContainer_Memories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RecMem getMemories();

	/**
	 * Sets the value of the '{@link recorder.MemoryContainer#getMemories <em>Memories</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memories</em>' containment reference.
	 * @see #getMemories()
	 * @generated
	 */
	void setMemories(RecMem value);

} // MemoryContainer
