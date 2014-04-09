/**
 */
package recorder.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import recorder.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see recorder.RecorderPackage
 * @generated
 */
public class RecorderAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RecorderPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecorderAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RecorderPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecorderSwitch<Adapter> modelSwitch =
		new RecorderSwitch<Adapter>() {
			@Override
			public Adapter caseRecComponent(RecComponent object) {
				return createRecComponentAdapter();
			}
			@Override
			public Adapter caseRecDisplay(RecDisplay object) {
				return createRecDisplayAdapter();
			}
			@Override
			public Adapter caseRecButton(RecButton object) {
				return createRecButtonAdapter();
			}
			@Override
			public Adapter caseRecFile(RecFile object) {
				return createRecFileAdapter();
			}
			@Override
			public Adapter caseRecMem(RecMem object) {
				return createRecMemAdapter();
			}
			@Override
			public Adapter caseRecorderModel(RecorderModel object) {
				return createRecorderModelAdapter();
			}
			@Override
			public Adapter caseNormalBtn(NormalBtn object) {
				return createNormalBtnAdapter();
			}
			@Override
			public Adapter caseDispLCD(DispLCD object) {
				return createDispLCDAdapter();
			}
			@Override
			public Adapter caseButtonContainer(ButtonContainer object) {
				return createButtonContainerAdapter();
			}
			@Override
			public Adapter caseDispContainer(DispContainer object) {
				return createDispContainerAdapter();
			}
			@Override
			public Adapter caseMemoryContainer(MemoryContainer object) {
				return createMemoryContainerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link recorder.RecComponent <em>Rec Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recorder.RecComponent
	 * @generated
	 */
	public Adapter createRecComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recorder.RecDisplay <em>Rec Display</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recorder.RecDisplay
	 * @generated
	 */
	public Adapter createRecDisplayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recorder.RecButton <em>Rec Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recorder.RecButton
	 * @generated
	 */
	public Adapter createRecButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recorder.RecFile <em>Rec File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recorder.RecFile
	 * @generated
	 */
	public Adapter createRecFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recorder.RecMem <em>Rec Mem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recorder.RecMem
	 * @generated
	 */
	public Adapter createRecMemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recorder.RecorderModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recorder.RecorderModel
	 * @generated
	 */
	public Adapter createRecorderModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recorder.NormalBtn <em>Normal Btn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recorder.NormalBtn
	 * @generated
	 */
	public Adapter createNormalBtnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recorder.DispLCD <em>Disp LCD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recorder.DispLCD
	 * @generated
	 */
	public Adapter createDispLCDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recorder.ButtonContainer <em>Button Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recorder.ButtonContainer
	 * @generated
	 */
	public Adapter createButtonContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recorder.DispContainer <em>Disp Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recorder.DispContainer
	 * @generated
	 */
	public Adapter createDispContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link recorder.MemoryContainer <em>Memory Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see recorder.MemoryContainer
	 * @generated
	 */
	public Adapter createMemoryContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RecorderAdapterFactory
