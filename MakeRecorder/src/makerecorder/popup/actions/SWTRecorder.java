package makerecorder.popup.actions;

import java.util.Iterator;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import recorder.CommandType;
import recorder.RecButton;
import recorder.RecColor;
import recorder.RecFile;
import recorder.RecFunctions;
import recorder.RecStatus;
import recorder.RecorderFactory;
import recorder.RecorderModel;

public class SWTRecorder {

	protected Shell shell;

	private Label lblRec, lblPlay, lblMem, lblRecord,lblTime;
	Button btnStop, btnStart, btnMode, btnDel, btnUp, btnDown;
	private int recInd;
	private int totalRec;
	int recTime;
	private Color defaultFgColor;
	
	private RecorderModel recorder;
	
	/**
	 * The constructor to initialize a recorder.
	 * @param rec
	 */
	public SWTRecorder(RecorderModel rec){
		recorder = rec;
		recorder.setCurFunction(RecFunctions.SOUND_RECORD);
		recorder.setCurStatus(RecStatus.STOPPED);
		recInd = totalRec = 0;
		//recorder.getMemContainer().setMemories(RecorderFactory.eINSTANCE.createRecMem());
	}

	public SWTRecorder(){
	}
	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Composite composite = new Composite(shell, SWT.BORDER);
		composite.setBounds(10, 10, 430, 258);
		
		Canvas canvas = new Canvas(composite, SWT.NONE);
		RecColor cavColor = recorder.getDispContainer().getDisplays().get(0).getDispColor();
		switch (cavColor.getValue()){
		case RecColor.BLUE_VALUE:
			this.defaultFgColor =  SWTResourceManager.getColor(SWT.COLOR_YELLOW);
			canvas.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
			break;
		case RecColor.GRAY_VALUE:
			this.defaultFgColor = SWTResourceManager.getColor(SWT.COLOR_BLACK);
			canvas.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
			break;
		default:
			this.defaultFgColor = SWTResourceManager.getColor(SWT.COLOR_YELLOW);
			canvas.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
			break;
		}
		canvas.setBounds(46, 26, 287, 96);
		
		lblRec = new Label(canvas, SWT.BORDER);
		lblRec.setBounds(10, 10, 35, 14);
		lblRec.setText("REC");
		lblRec.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
		lblRec.setForeground(defaultFgColor);
		
		lblPlay = new Label(canvas, SWT.NONE);
		lblPlay.setText("PLAY");
		lblPlay.setBounds(10, 30, 35, 14);
		lblPlay.setForeground(defaultFgColor);
		
		lblMem = new Label(canvas, SWT.BORDER);
		lblMem.setText("MEM");
		lblMem.setBounds(10, 50, 35, 14);
		lblMem.setForeground(defaultFgColor);
		
		lblRecord = new Label(canvas, SWT.NONE);
		lblRecord.setBounds(112, 10, 59, 14);
		lblRecord.setText("Rec : 1");
		lblRecord.setForeground(defaultFgColor);
		
		lblTime = new Label(canvas, SWT.NONE);
		lblTime.setFont(SWTResourceManager.getFont("Lucida Grande", 18, SWT.NORMAL));
		lblTime.setText("Rec Time: ");
		lblTime.setBounds(112, 43, 165, 34);
		lblTime.setForeground(defaultFgColor);
		
		btnStop = new Button(composite, SWT.NONE);
		btnStop.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sendCommand(CommandType.STOP);
			}
		});
		btnStop.setBounds(244, 128, 88, 44);
		btnStop.setText(this.getButtonName(CommandType.STOP));

		btnMode = new Button(composite, SWT.NONE);
		btnMode.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sendCommand(CommandType.CHANGE_MODE);
			}
		});
		btnMode.setText(getButtonName(CommandType.CHANGE_MODE));
		btnMode.setBounds(46, 128, 88, 44);
		btnMode.setVisible(this.checkVisible(CommandType.CHANGE_MODE));
		
		
		btnStart = new Button(composite, SWT.NONE);
		btnStart.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sendCommand(CommandType.START);
			}
		});
		btnStart.setText(getButtonName(CommandType.START));
		btnStart.setBounds(150, 128, 88, 44);
		
		btnUp = new Button(composite, SWT.ARROW_UP);
		btnUp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sendCommand(CommandType.UP);
			}
		});
		btnUp.setText("/\\");
		btnUp.setBounds(349, 26, 50, 44);
		btnUp.setVisible(this.checkVisible(CommandType.UP));
		
		btnDel = new Button(composite, SWT.NONE);
		btnDel.setText(getButtonName(CommandType.DELETE));
		btnDel.setBounds(46, 190, 88, 44);
		btnDel.setVisible(this.checkVisible(CommandType.DELETE));
		
		btnDown = new Button(composite, SWT.CENTER);
		btnDown.setText("\\/");
		btnDown.setBounds(349, 76, 50, 44);
		btnDown.setVisible(this.checkVisible(CommandType.DOWN));
		btnDown.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				sendCommand(CommandType.DOWN);
			}
		});
	}
	/**
	 * The controller to handle command
	 * @param com
	 * @return
	 */
	public boolean sendCommand(CommandType com){
		if(com == CommandType.STOP){
			switch(recorder.getCurFunction().getValue()){
				case RecFunctions.SOUND_RECORD_VALUE :
					this.lblRec.setForeground(defaultFgColor);
					if(recorder.getCurStatus() == RecStatus.WORKING){
						RecFile f = RecorderFactory.eINSTANCE.createRecFile();
						f.setSize(this.recTime * 2);
						recorder.getMemContainer().getMemories().getFiles().add(f);
					}
					break;
				case RecFunctions.SOUND_PLAY_VALUE :
					this.lblPlay.setForeground(defaultFgColor);
					
					break;
				default:
					break;
			}
			recorder.setCurStatus(RecStatus.STOPPED);
			this.btnStart.setEnabled(true);
			this.btnMode.setEnabled(true);
			this.btnDel.setEnabled(true);
		}else if(com == CommandType.START && recorder.getCurFunction() != RecFunctions.CHECK_MEM){
			recorder.setCurStatus(RecStatus.WORKING);
			this.btnStart.setEnabled(false);
			this.btnMode.setEnabled(false);
			this.btnDel.setEnabled(false);
			switch(recorder.getCurFunction().getValue()){
			case RecFunctions.SOUND_RECORD_VALUE :
				this.lblRec.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
				
				this.totalRec ++;
				this.recInd = this.totalRec;
				this.lblRecord.setText("Rec : " + totalRec);
				Thread timeThread = new Thread() {
		            public void run() {
					    recTime = 0;
		                while (recorder.getCurStatus() == RecStatus.WORKING) {
		                    Display.getDefault().syncExec(new Runnable() {

		                        @Override
		                        public void run() {
		                            lblTime.setText("Rec Time: " + recTime++);
		                        }
		                    });
		                    try {
		                        Thread.sleep(1000);
		                    } catch (InterruptedException e) {
		                        e.printStackTrace();
		                    }
		                }
		            }
		        };
		        timeThread.setDaemon(true);
		        timeThread.start();
				break;
			case RecFunctions.SOUND_PLAY_VALUE :
				if(this.totalRec > 0){
					this.lblPlay.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
					//System.out.println("======: " + recorder.getMemContainer().getMemories().getFiles().get(1).getSize());
					//System.out.println("------:" + this.recInd);
					Thread timeThread2 = new Thread() {
			            public void run() {
						    recTime = recorder.getMemContainer().getMemories().getFiles().get(recInd - 1).getSize()/2;
						    
			                while (recorder.getCurStatus() == RecStatus.WORKING) {
			                    Display.getDefault().syncExec(new Runnable() {
	
			                        @Override
			                        public void run() {
			                            lblTime.setText("Play Time: " + recTime--);
			                            if(recTime < 0) 
			                            	sendCommand(CommandType.STOP);
			                        }
			                    });
			                    try {
			                        Thread.sleep(1000);
			                    } catch (InterruptedException e) {
			                        e.printStackTrace();
			                    }
			                }
			            }
			        };
			        timeThread2.setDaemon(true);
			        timeThread2.start();
				}
				break;
			default:
				break;
			}
		}else if(com == CommandType.CHANGE_MODE){
			if(recorder.getCurStatus() != RecStatus.WORKING){
				this.clearLabelBgCor();
				switch(recorder.getCurFunction().getValue()){
				case RecFunctions.SOUND_RECORD_VALUE :
					recorder.setCurFunction(RecFunctions.SOUND_PLAY);
					this.lblPlay.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
					this.lblTime.setText("Play Time: ");
					break;
				case RecFunctions.SOUND_PLAY_VALUE :
					recorder.setCurFunction(RecFunctions.CHECK_MEM);
					int totalUsed = 0;
					Iterator<RecFile> it = recorder.getMemContainer().getMemories().getFiles().iterator();
					while(it.hasNext()){
						totalUsed += it.next().getSize();
					}
					this.lblMem.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
					int rem = recorder.getMemContainer().getMemories().getMemSize() - totalUsed;
					this.lblTime.setText("MEM: "+ rem + " MB");
					break;
				case RecFunctions.CHECK_MEM_VALUE :
					recorder.setCurFunction(RecFunctions.SOUND_RECORD);
					this.lblRec.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
					this.lblTime.setText("Rec Time: ");
					break;
				default:
					break;
				}
			}
		}else if(com == CommandType.UP){
			if(recorder.getCurStatus() != RecStatus.WORKING && recorder.getCurFunction() == RecFunctions.SOUND_PLAY){
				recInd += 1;
				if(recInd > totalRec) recInd = 1;
				this.lblRecord.setText("Rec : " + this.recInd);
				//System.out.println("=== Total record: " + this.totalRec);
			}
		}else if(com == CommandType.DOWN){
			if(recorder.getCurStatus() != RecStatus.WORKING && recorder.getCurFunction() == RecFunctions.SOUND_PLAY){
				this.recInd -= 1;
				if(recInd == 0) recInd = totalRec;
				this.lblRecord.setText("Rec : " + this.recInd);
				//System.out.println("=== Total record: " + this.totalRec);
			}
		}
		return true;
	}
	private void clearLabelBgCor(){
		this.lblMem.setBackground(null);
		this.lblPlay.setBackground(null);
		this.lblRec.setBackground(null);
	}
	
	private boolean checkVisible(CommandType type){
		Iterator<RecButton> i = this.recorder.getBtnContainer().get(0).getButtons().iterator();
		boolean fnd = false;
		while(i.hasNext()){
			RecButton btn = i.next();
			if(btn.getCmdName() == type)
				fnd = true;
		}
		return fnd;
	}
	
	private String getButtonName(CommandType type){
		Iterator<RecButton> i = this.recorder.getBtnContainer().get(0).getButtons().iterator();
		String name = "No name";
		while(i.hasNext()){
			RecButton btn = i.next();
			if(btn.getCmdName() == type)
				name = btn.getName();
		}
		return name;
	}
	
	/*
	 * For SWT editor
	 */
	public static void main(String[] args) {
		try {
			SWTRecorder window = new SWTRecorder();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
