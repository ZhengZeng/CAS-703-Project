/**
 */
package recorder;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rec Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link recorder.RecComponent#getPos_x <em>Pos x</em>}</li>
 *   <li>{@link recorder.RecComponent#getPos_y <em>Pos y</em>}</li>
 *   <li>{@link recorder.RecComponent#getComp_width <em>Comp width</em>}</li>
 *   <li>{@link recorder.RecComponent#getComp_height <em>Comp height</em>}</li>
 *   <li>{@link recorder.RecComponent#getId <em>Id</em>}</li>
 *   <li>{@link recorder.RecComponent#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see recorder.RecorderPackage#getRecComponent()
 * @model abstract="true"
 * @generated
 */
public interface RecComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Pos x</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos x</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos x</em>' attribute.
	 * @see #setPos_x(int)
	 * @see recorder.RecorderPackage#getRecComponent_Pos_x()
	 * @model
	 * @generated
	 */
	int getPos_x();

	/**
	 * Sets the value of the '{@link recorder.RecComponent#getPos_x <em>Pos x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos x</em>' attribute.
	 * @see #getPos_x()
	 * @generated
	 */
	void setPos_x(int value);

	/**
	 * Returns the value of the '<em><b>Pos y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pos y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pos y</em>' attribute.
	 * @see #setPos_y(int)
	 * @see recorder.RecorderPackage#getRecComponent_Pos_y()
	 * @model
	 * @generated
	 */
	int getPos_y();

	/**
	 * Sets the value of the '{@link recorder.RecComponent#getPos_y <em>Pos y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pos y</em>' attribute.
	 * @see #getPos_y()
	 * @generated
	 */
	void setPos_y(int value);

	/**
	 * Returns the value of the '<em><b>Comp width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp width</em>' attribute.
	 * @see #setComp_width(int)
	 * @see recorder.RecorderPackage#getRecComponent_Comp_width()
	 * @model
	 * @generated
	 */
	int getComp_width();

	/**
	 * Sets the value of the '{@link recorder.RecComponent#getComp_width <em>Comp width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp width</em>' attribute.
	 * @see #getComp_width()
	 * @generated
	 */
	void setComp_width(int value);

	/**
	 * Returns the value of the '<em><b>Comp height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comp height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comp height</em>' attribute.
	 * @see #setComp_height(int)
	 * @see recorder.RecorderPackage#getRecComponent_Comp_height()
	 * @model
	 * @generated
	 */
	int getComp_height();

	/**
	 * Sets the value of the '{@link recorder.RecComponent#getComp_height <em>Comp height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comp height</em>' attribute.
	 * @see #getComp_height()
	 * @generated
	 */
	void setComp_height(int value);

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
	 * @see recorder.RecorderPackage#getRecComponent_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link recorder.RecComponent#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

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
	 * @see recorder.RecorderPackage#getRecComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link recorder.RecComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RecComponent
