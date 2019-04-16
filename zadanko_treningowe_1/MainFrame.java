package zadanko_treningowe_1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements Runnable{
	private JPanel panelButtons, panelForms;
	private JTextField a, b, c;
	private JButton dodaj, odejmij;
	
	private Actions.dodaj_zmienne dodaj_zmienne;
	private Actions.odejmij_zmienne odejmij_zmienne;
	
	public MainFrame(String Tytul) {
		super(Tytul);
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(d.width/2, d.height/2);
		
		panelForms = new JPanel();
		
		panelForms.setPreferredSize(new Dimension(0, 100));
		panelForms.setBorder(BorderFactory.createRaisedBevelBorder());
		add(panelForms, BorderLayout.NORTH);
		
		a = new JTextField(10);
		b = new JTextField(10);
		c = new JTextField(10);
		
		panelForms.add(a);
		panelForms.add(b);
		panelForms.add(c);
		
		panelButtons = new JPanel();
		
		panelButtons.setPreferredSize(new Dimension(200,0));
		panelButtons.setBorder(BorderFactory.createRaisedBevelBorder());
		add(panelButtons, BorderLayout.WEST);
		
		dodaj_zmienne = new Actions.dodaj_zmienne(this);
		odejmij_zmienne = new Actions.odejmij_zmienne(this);
		
		dodaj = new JButton(dodaj_zmienne);
		odejmij = new JButton(odejmij_zmienne);
		panelButtons.add(dodaj);
		panelButtons.add(odejmij);
	}
	
	@Override
	public void run() {
		setVisible(true);
	}
	
	public String getA() {
		return a.getText();
	}
	
	public String getB() {
		return b.getText();
	}
	
	public void setText(String wynik) {
		c.setText(wynik);
	}
}
