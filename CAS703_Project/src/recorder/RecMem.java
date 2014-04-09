/**
 */
package recorder;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rec Mem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link recorder.RecMem#getId <em>Id</em>}</li>
 *   <li>{@link recorder.RecMem#getFiles <em>Files</em>}</li>
 *   <li>{@link recorder.RecMem#getCurFile <em>Cur File</em>}</li>
 *   <li>{@link recorder.RecMem#getMemSize <em>Mem Size</em>}</li>
 *   <li>{@link recorder.RecMem#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see recorder.RecorderPackage#getRecMem()
 * @model
 * @generated
 */
public interface RecMem extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see recorder.RecorderPackage#getRecMem_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link recorder.RecMem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link recorder.RecFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see recorder.RecorderPackage#getRecMem_Files()
	 * @model containment="true" upper="100"
	 * @generated
	 */
	EList<RecFile> getFiles();

	/**
	 * Returns the value of the '<em><b>Cur File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cur File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cur File</em>' attribute.
	 * @see #setCurFile(int)
	 * @see recorder.RecorderPackage#getRecMem_CurFile()
	 * @model
	 * @generated
	 */
	int getCurFile();

	/**
	 * Sets the value of the '{@link recorder.RecMem#getCurFile <em>Cur File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cur File</em>' attribute.
	 * @see #getCurFile()
	 * @generated
	 */
	void setCurFile(int value);

	/**
	 * Returns the value of the '<em><b>Mem Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Size</em>' attribute.
	 * @see #setMemSize(int)
	 * @see recorder.RecorderPackage#getRecMem_MemSize()
	 * @model required="true"
	 * @generated
	 */
	int getMemSize();

	/**
	 * Sets the value of the '{@link recorder.RecMem#getMemSize <em>Mem Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Size</em>' attribute.
	 * @see #getMemSize()
	 * @generated
	 */
	void setMemSize(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see recorder.RecorderPackage#getRecMem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link recorder.RecMem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RecMem
