package guiintro;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class TaschenrechnerKompliziert {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TaschenrechnerKompliziert window = new TaschenrechnerKompliziert();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		shell.setSize(324, 304);
		shell.setText("SWT Application");

		Button btnZero = new Button(shell, SWT.NONE);
		btnZero.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText()) * 10;
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		btnZero.setBounds(75, 236, 75, 25);
		btnZero.setText("0");

		Button btnOne = new Button(shell, SWT.NONE);
		btnOne.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText()) * 10 + 1;
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		btnOne.setBounds(0, 212, 75, 25);
		btnOne.setText("1");

		Button btnTwo = new Button(shell, SWT.NONE);
		btnTwo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText()) * 10 + 2;
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		btnTwo.setBounds(75, 212, 75, 25);
		btnTwo.setText("2");

		Button btnThree = new Button(shell, SWT.NONE);
		btnThree.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText()) * 10 + 3;
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		btnThree.setBounds(151, 212, 75, 25);
		btnThree.setText("3");

		Button btnFour = new Button(shell, SWT.NONE);
		btnFour.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText()) * 10 + 4;
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		btnFour.setText("4");
		btnFour.setBounds(0, 187, 75, 25);

		Button btnFive = new Button(shell, SWT.NONE);
		btnFive.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText()) * 10 + 5;
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		btnFive.setBounds(75, 187, 75, 25);
		btnFive.setText("5");

		Button btnSix = new Button(shell, SWT.NONE);
		btnSix.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText()) * 10 + 6;
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		btnSix.setBounds(151, 187, 75, 25);
		btnSix.setText("6");

		Button btnSeven = new Button(shell, SWT.NONE);
		btnSeven.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText()) * 10 + 7;
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		btnSeven.setBounds(0, 162, 75, 25);
		btnSeven.setText("7");

		Button btnEight = new Button(shell, SWT.NONE);
		btnEight.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText()) * 10 + 8;
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		btnEight.setBounds(75, 162, 75, 25);
		btnEight.setText("8");

		Button btnNine = new Button(shell, SWT.NONE);
		btnNine.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText()) * 10 + 9;
				getErgebnis().setText(Integer.toString(ergebnis));
			}
		});
		btnNine.setBounds(151, 162, 75, 25);
		btnNine.setText("9");

		text = new Text(shell, SWT.BORDER);
		text.setText("0");
		text.setEditable(false);
		text.setBounds(-1, 118, 308, 38);

		Button btn1 = new Button(shell, SWT.NONE);
		btn1.setBounds(0, 236, 75, 25);

		Button btnAdd = new Button(shell, SWT.NONE);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnAdd.setText("+");
		btnAdd.setBounds(232, 236, 75, 25);

		Button btnMinus = new Button(shell, SWT.NONE);
		btnMinus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnMinus.setText("-");
		btnMinus.setBounds(232, 212, 75, 25);

		Button btnMulti = new Button(shell, SWT.NONE);
		btnMulti.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnMulti.setBounds(232, 187, 75, 25);
		btnMulti.setText("*");

		Button Divide = new Button(shell, SWT.NONE);
		Divide.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		Divide.setBounds(232, 162, 75, 25);
		Divide.setText("/");

		Button btnSolve = new Button(shell, SWT.NONE);
		btnSolve.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnSolve.setBounds(151, 236, 75, 25);
		btnSolve.setText("=");

	}

	public Text getErgebnis() {
		return text;
	}
}
