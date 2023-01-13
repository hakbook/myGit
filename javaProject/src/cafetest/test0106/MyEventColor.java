package cafetest.test0106;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


public class MyEventColor extends JFrame {
	public MyEventColor() {
		setTitle("MyEventColor");
		setSize(300, 200);
		setVisible(true);
		
		Button b1 = new Button("North");
		Button b2 = new Button("East");
		Button b3 = new Button("South");
		Button b4 = new Button("West");
		
		add(b1, "North");
		add(b2, "East");
		add(b3, "South");
		add(b4, "West");
		
		b1.addActionListener(new MyColorAction(this, Color.red));
		b2.addActionListener(new MyColorAction(this, Color.green));
		b3.addActionListener(new MyColorAction(this, Color.blue));
		b4.addActionListener(new MyColorAction(this, Color.yellow));
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new MyEventColor();
	}

class MyColorAction implements ActionListener {
	private JFrame f;
	private Color c;
	private Container con;
	
	public MyColorAction(JFrame f, Color c) {
		this.f = f;
		con = f.getContentPane();
		this.c = c;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);
	}
}
}