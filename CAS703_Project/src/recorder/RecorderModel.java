/**
 */
package recorder;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link recorder.RecorderModel#getBtnContainer <em>Btn Container</em>}</li>
 *   <li>{@link recorder.RecorderModel#getDispContainer <em>Disp Container</em>}</li>
 *   <li>{@link recorder.RecorderModel#getMemContainer <em>Mem Container</em>}</li>
 *   <li>{@link recorder.RecorderModel#getRecorderNm <em>Recorder Nm</em>}</li>
 *   <li>{@link recorder.RecorderModel#getCurStatus <em>Cur Status</em>}</li>
 *   <li>{@link recorder.RecorderModel#getCurFunction <em>Cur Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see recorder.RecorderPackage#getRecorderModel()
 * @model
 * @generated
 */
public interface RecorderModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Btn Container</b></em>' containment reference list.
	 * The list contents are of type {@link recorder.ButtonContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Btn Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Btn Container</em>' containment reference list.
	 * @see recorder.RecorderPackage#getRecorderModel_BtnContainer()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<ButtonContainer> getBtnContainer();

	/**
	 * Returns the value of the '<em><b>Disp Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disp Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disp Container</em>' containment reference.
	 * @see #setDispContainer(DispContainer)
	 * @see recorder.RecorderPackage#getRecorderModel_DispContainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DispContainer getDispContainer();

	/**
	 * Sets the value of the '{@link recorder.RecorderModel#getDispContainer <em>Disp Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disp Container</em>' containment reference.
	 * @see #getDispContainer()
	 * @generated
	 */
	void setDispContainer(DispContainer value);

	/**
	 * Returns the value of the '<em><b>Mem Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem Container</em>' containment reference.
	 * @see #setMemContainer(MemoryContainer)
	 * @see recorder.RecorderPackage#getRecorderModel_MemContainer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MemoryContainer getMemContainer();

	/**
	 * Sets the value of the '{@link recorder.RecorderModel#getMemContainer <em>Mem Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem Container</em>' containment reference.
	 * @see #getMemContainer()
	 * @generated
	 */
	void setMemContainer(MemoryContainer value);

	/**
	 * Returns the value of the '<em><b>Recorder Nm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorder Nm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorder Nm</em>' attribute.
	 * @see #setRecorderNm(String)
	 * @see recorder.RecorderPackage#getRecorderModel_RecorderNm()
	 * @model
	 * @generated
	 */
	String getRecorderNm();

	/**
	 * Sets the value of the '{@link recorder.RecorderModel#getRecorderNm <em>Recorder Nm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder Nm</em>' attribute.
	 * @see #getRecorderNm()
	 * @generated
	 */
	void setRecorderNm(String value);

	/**
	 * Returns the value of the '<em><b>Cur Status</b></em>' attribute.
	 * The literals are from the enumeration {@link recorder.RecStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cur Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cur Status</em>' attribute.
	 * @see recorder.RecStatus
	 * @see #setCurStatus(RecStatus)
	 * @see recorder.RecorderPackage#getRecorderModel_CurStatus()
	 * @model
	 * @generated
	 */
	RecStatus getCurStatus();

	/**
	 * Sets the value of the '{@link recorder.RecorderModel#getCurStatus <em>Cur Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cur Status</em>' attribute.
	 * @see recorder.RecStatus
	 * @see #getCurStatus()
	 * @generated
	 */
	void setCurStatus(RecStatus value);

	/**
	 * Returns the value of the '<em><b>Cur Function</b></em>' attribute.
	 * The literals are from the enumeration {@link recorder.RecFunctions}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cur Function</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cur Function</em>' attribute.
	 * @see recorder.RecFunctions
	 * @see #setCurFunction(RecFunctions)
	 * @see recorder.RecorderPackage#getRecorderModel_CurFunction()
	 * @model
	 * @generated
	 */
	RecFunctions getCurFunction();

	/**
	 * Sets the value of the '{@link recorder.RecorderModel#getCurFunction <em>Cur Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cur Function</em>' attribute.
	 * @see recorder.RecFunctions
	 * @see #getCurFunction()
	 * @generated
	 */
	void setCurFunction(RecFunctions value);

} // RecorderModel
