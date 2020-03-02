package guiintro;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class TaschenrechnerGUI {
	private static Text texttf;
	private static Text ergebnistf;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Button btnAdd = new Button(shell, SWT.NONE);
		btnAdd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			int ergebnis = Integer.parseInt(getErgebnis().getText());
			int wert = Integer.parseInt(getWert().getText());
			//
			ergebnis = ergebnis + wert;
			//
			getErgebnis().setText(Integer.toString(ergebnis));
			getWert().setText("");
			}
		});
		btnAdd.setBounds(32, 21, 75, 25);
		btnAdd.setText("+");
		
		Button btnMinus = new Button(shell, SWT.NONE);
		btnMinus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText());
				int wert = Integer.parseInt(getWert().getText());
				//
				ergebnis = ergebnis - wert;
		});
		Button btnDivide = new Button(shell, SWT.NONE);
		btnDivide.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText());
				int wert = Integer.parseInt(getWert().getText());
				//
				ergebnis = ergebnis / wert;
			}
			}
		});
		btnMinus.setBounds(32, 86, 75, 25);
		btnMinus.setText("-");
		
		Button btnMulti = new Button(shell, SWT.NONE);
		btnMulti.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int ergebnis = Integer.parseInt(getErgebnis().getText());
				int wert = Integer.parseInt(getWert().getText());
				//
				ergebnis = ergebnis * wert;
				//
				getErgebnis().setText(Integer.toString(ergebnis));
				getWert().setText("");
			}
		});
		btnMulti.setBounds(309, 21, 75, 25);
		btnMulti.setText("*");
		
		Button btnDivide = new Button(shell, SWT.NONE);
		btnDivide.setBounds(309, 86, 75, 25);
		btnDivide.setText("/");
		
		texttf = new Text(shell, SWT.BORDER);
		texttf.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});
		texttf.setBounds(31, 200, 76, 21);
		
		ergebnistf = new Text(shell, SWT.BORDER);
		ergebnistf.setEditable(false);
		ergebnistf.setText("0");
		ergebnistf.setBounds(308, 200, 76, 21);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	public Text getText() {
		return texttf;
	}
	public Text getErgebnís() {
		return Ergebnístf;
	}
	
}
