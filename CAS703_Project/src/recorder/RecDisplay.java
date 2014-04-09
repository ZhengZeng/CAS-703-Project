/**
 */
package recorder;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rec Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link recorder.RecDisplay#getDispColor <em>Disp Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see recorder.RecorderPackage#getRecDisplay()
 * @model abstract="true"
 * @generated
 */
public interface RecDisplay extends RecComponent {
	/**
	 * Returns the value of the '<em><b>Disp Color</b></em>' attribute.
	 * The literals are from the enumeration {@link recorder.RecColor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disp Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disp Color</em>' attribute.
	 * @see recorder.RecColor
	 * @see #setDispColor(RecColor)
	 * @see recorder.RecorderPackage#getRecDisplay_DispColor()
	 * @model
	 * @generated
	 */
	RecColor getDispColor();

	/**
	 * Sets the value of the '{@link recorder.RecDisplay#getDispColor <em>Disp Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disp Color</em>' attribute.
	 * @see recorder.RecColor
	 * @see #getDispColor()
	 * @generated
	 */
	void setDispColor(RecColor value);

} // RecDisplay
