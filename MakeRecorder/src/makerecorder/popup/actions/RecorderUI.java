package makerecorder.popup.actions;


import java.io.IOException;
import java.util.Iterator;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import recorder.ButtonContainer;
import recorder.DispContainer;
import recorder.MemoryContainer;
import recorder.RecButton;
import recorder.RecorderModel;
import recorder.RecorderPackage;


public class RecorderUI extends TitleAreaDialog {

	private ComposedAdapterFactory composedAdapterFactory;
	private Resource resource;
	private Text text;
	private DataBindingContext context;
	private Binding bindValue;
	
	private RecorderModel recorder;

	public RecorderModel getRecorder() {
		return recorder;
	}
	
	public void setRecorder(RecorderModel recorder) {
		this.recorder = recorder;
	}
	
	public RecorderUI(Shell parent) {
		super(parent);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void create() {
	    super.create();
	    setTitle("This is the prototype of recorder");
	    setMessage("The components for this recoder listed here:", IMessageProvider.INFORMATION);
    }
	  	  
	@Override
	protected Control createDialogArea(Composite parent) {

		Composite root = (Composite) super.createDialogArea(parent);

	    GridLayout layout = new GridLayout(2, false);

	    root.setLayout(layout);	
		new Label(root, SWT.NONE);
		new Label(root, SWT.NONE).setText("The Container");
		new Label(root, SWT.NONE).setText("The Components");
		
		GridData gd_list = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_list.widthHint = 110;
		gd_list.heightHint = 100;
		
		new Label(root, SWT.NONE).setText("Buttons");
		ListViewer listViewer = new ListViewer(root, SWT.H_SCROLL | SWT.V_SCROLL);
		List list = listViewer.getList();
		list.setLayoutData(gd_list);
		listViewer.setContentProvider(new AdapterFactoryContentProvider(getAdapterFactory()));
		listViewer.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));
		listViewer.setInput(this.getRecorder().getBtnContainer().get(0));
		
		new Label(root, SWT.NONE).setText("Displays");
		ListViewer listViewer2 = new ListViewer(root, SWT.H_SCROLL | SWT.V_SCROLL);
		List list2 = listViewer2.getList();
		list2.setLayoutData(gd_list);
		listViewer2.setContentProvider(new AdapterFactoryContentProvider(getAdapterFactory()));
		listViewer2.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));
		listViewer2.setInput(this.getRecorder().getDispContainer());
		
		new Label(root, SWT.NONE).setText("Displays");
		ListViewer listViewer3 = new ListViewer(root, SWT.H_SCROLL | SWT.V_SCROLL);
		List list3 = listViewer3.getList();
		list3.setLayoutData(gd_list);
		listViewer3.setContentProvider(new AdapterFactoryContentProvider(getAdapterFactory()));
		listViewer3.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));
		listViewer3.setInput(this.getRecorder().getMemContainer());
		/*
		listViewer2.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if(selection instanceof IStructuredSelection){
					IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
					
					setActiveElement((RecButton)iStructuredSelection.getFirstElement());
				}
				
			}
			
		});
		*/
		//Composite nameComposite = new Composite(root, SWT.None);
		//nameComposite.setLayout(new GridLayout(2, false));
		//createNameComposite(root);
		
		root.layout();
		parent.pack();

		return parent;
	}
	
	protected void createNameComposite(Composite nameComposite) {
		Label label1 = new Label(nameComposite, SWT.NONE);
		label1.setText("Some information");
		Label label2 = new Label(nameComposite, SWT.NONE);
		label2.setText("");
		
		text = new Text(nameComposite, SWT.NONE);
		context = new DataBindingContext();

	}
	
	protected AdapterFactory getAdapterFactory() {
		if (composedAdapterFactory == null) {
			composedAdapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		}
		return composedAdapterFactory;
	}
	
	protected void loadContent(IFile file) throws IOException {
		AdapterFactoryEditingDomain editingDomain = new AdapterFactoryEditingDomain(
				getAdapterFactory(), new BasicCommandStack());
		resource = editingDomain.createResource(file.getFullPath().toString());
		resource.load(null);
		EObject eObject = resource.getContents().get(0);
		//System.out.println("--------------test------");
		//System.out.println(eObject.toString());
		RecorderModel tmp = (RecorderModel) eObject;
		//System.out.println("===================");
		//System.out.println(tmp.toString());
		setRecorder(tmp);
	}
	
	protected void setActiveElement(RecButton firstElement) {
		if(bindValue!=null){
			bindValue.dispose();
		}
		text.setText("");
		
		ISWTObservableValue observeText = SWTObservables.observeText(text, SWT.Modify);
		
		IObservableValue observeValue = EMFObservables.observeValue(firstElement, RecorderPackage.eINSTANCE.getRecComponent_Name());
		bindValue = context.bindValue(observeText, observeValue);
	}

	@Override
	protected void buttonPressed(int buttonId) {
		// TODO Auto-generated method stub
		switch (buttonId) {
		case 1000:
			this.setMessage("1000 is pressed.", IMessageProvider.ERROR);
			break;
		case 1001:
			this.setMessage("1001 is pressed.", IMessageProvider.INFORMATION);
			break;
		case 1002:
			this.setMessage("1002 is pressed.", IMessageProvider.NONE);
			break;
		case 1003:
			this.setMessage("1003 is pressed.", IMessageProvider.WARNING);
			break;
		default:
			super.buttonPressed(buttonId);
		}
	}

	
	@Override
	protected void cancelPressed() {
		// TODO Auto-generated method stub
		super.cancelPressed();
	}
	
/*
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		// TODO Auto-generated method stub

		Iterator<RecButton> i = recorder.getBtnContainer().get(0).getButtons().iterator();
		while(i.hasNext()){
			RecButton btn = i.next();
			super.createButton(parent, btn.getId(), btn.getName(), true);
		}
		super.createButtonsForButtonBar(parent);
		
	}
*/
	@Override
	protected void okPressed() {
		try {
			SWTRecorder window = new SWTRecorder(recorder);
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.okPressed();
	}
	
	
}
