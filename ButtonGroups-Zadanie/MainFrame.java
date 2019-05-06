package buttons_group;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements Runnable{
	private JPanel DrawPanel, AddPanel;
	private JTextField a, b, c, d;
	private ButtonGroup colors;
	private JRadioButton red, blue;
	private JButton draw;
	
	public MainFrame(String Tytul) {
		super(Tytul);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(dim.width/2, dim.height/2);
		
		
		DrawPanel = new MyDraw();
		DrawPanel.setBorder(BorderFactory.createRaisedBevelBorder());
		add(DrawPanel, BorderLayout.CENTER);
		
		AddPanel = new JPanel();
		AddPanel.setBorder(BorderFactory.createRaisedBevelBorder());
		add(AddPanel, BorderLayout.SOUTH);
		
		a = new JTextField(8);
		b = new JTextField(8);
		c = new JTextField(8);
		d = new JTextField(8);
		AddPanel.add(a);
		AddPanel.add(b);
		AddPanel.add(c);
		AddPanel.add(d);
		
		colors = new ButtonGroup();
		red = new JRadioButton("Czerwony");
		blue = new JRadioButton("Niebieski");
		colors.add(red);
		colors.add(blue);
		AddPanel.add(red);
		AddPanel.add(blue);
		
		draw = new JButton("Rysuj");
		draw.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
			}
		});
		AddPanel.add(draw);		
	}

	@Override
	public void run() {
		setVisible(true);
	}
	
	class MyDraw extends JPanel{
		public MyDraw() {
			super();
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			Graphics2D g2 = (Graphics2D)g;
			Line2D line = new Line2D.Double(Double.parseDouble(a.getText()), Double.parseDouble(b.getText()), Double.parseDouble(c.getText()), Double.parseDouble(d.getText()));
			if(red.isSelected())
				g2.setColor(Color.RED);
			else if(blue.isSelected())
				g2.setColor(Color.BLUE);
			g2.draw(line);
		}
	}
}
