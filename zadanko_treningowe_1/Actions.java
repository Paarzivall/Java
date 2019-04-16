package zadanko_treningowe_1;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;

public class Actions {
	public static class dodaj_zmienne extends AbstractAction{
		private double a, b;
		private MainFrame mainFrame;
		public dodaj_zmienne(MainFrame parent) {
			mainFrame = parent;
			putValue(Action.NAME, "Dodaj");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			a = Double.parseDouble(mainFrame.getA());
			b = Double.parseDouble(mainFrame.getB());
			double wynik = a + b;
			
			mainFrame.setText("" + wynik);
			
		}		
	}
	
	public static class odejmij_zmienne extends AbstractAction{
		private double a, b;
		private MainFrame mainFrame;
		public odejmij_zmienne(MainFrame parent) {
			mainFrame = parent;
			putValue(Action.NAME, "Odejmij");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			a = Double.parseDouble(mainFrame.getA());
			b = Double.parseDouble(mainFrame.getB());
			double wynik = a - b;
			mainFrame.setText("" + wynik);
		}
	}
}
