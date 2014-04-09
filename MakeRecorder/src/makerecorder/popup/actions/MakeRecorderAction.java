package makerecorder.popup.actions;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class MakeRecorderAction implements IObjectActionDelegate {

	private Shell shell;
	private IWorkbenchPart part;
	
	/**
	 * Constructor for Action1.
	 */
	public MakeRecorderAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
		part = targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		RecorderUI recUI = new RecorderUI(shell);
		ISelection sel = part.getSite().getSelectionProvider().getSelection();
		if (sel instanceof TreeSelection) {
			TreeSelection treeSelection = (TreeSelection) sel;
			Object firstElement = treeSelection.getFirstElement();
			if (firstElement instanceof IFile) {
				try {
					recUI.loadContent((IFile) firstElement);
				} catch (IOException e) {
					Status status = new Status(IStatus.ERROR, "cas703.project", 0,
				            e.getMessage(), null);
					ErrorDialog.openError(shell, "Error on load", "File could not be loaded", status); 
				}
				catch (RuntimeException e){
					Status status = new Status(IStatus.ERROR, "cas703.project", 0,
				            e.getMessage(), null);
					ErrorDialog.openError(shell, "Error on load", "Probably there is no League contained in the ressource", status);
				}
				recUI.open();
			}
		}		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
