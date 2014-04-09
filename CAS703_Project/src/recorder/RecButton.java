/**
 */
package recorder;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rec Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link recorder.RecButton#getCmdName <em>Cmd Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see recorder.RecorderPackage#getRecButton()
 * @model abstract="true"
 * @generated
 */
public interface RecButton extends RecComponent {
	/**
	 * Returns the value of the '<em><b>Cmd Name</b></em>' attribute.
	 * The literals are from the enumeration {@link recorder.CommandType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd Name</em>' attribute.
	 * @see recorder.CommandType
	 * @see #setCmdName(CommandType)
	 * @see recorder.RecorderPackage#getRecButton_CmdName()
	 * @model
	 * @generated
	 */
	CommandType getCmdName();

	/**
	 * Sets the value of the '{@link recorder.RecButton#getCmdName <em>Cmd Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cmd Name</em>' attribute.
	 * @see recorder.CommandType
	 * @see #getCmdName()
	 * @generated
	 */
	void setCmdName(CommandType value);

} // RecButton
