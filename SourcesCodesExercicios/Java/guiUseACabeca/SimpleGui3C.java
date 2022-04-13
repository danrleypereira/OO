import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sun.prism.Graphics;


public class SimpleGui3C implements ActionListener {

	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	public static void main(String[] args) {
		SimpleGui3C gui = new SimpleGui3C();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton colorButton = new JButton("Change colors");
		colorButton.addActionListener(new ColorListener());
		
		JButton labelButton = new JButton("Change label");
		labelButton.addActionListener(new LabelListener());
		
		label = new JLabel("I'm a label");		
		MyDrawPanel drawPanel = new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	}
	
	class LabelListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			label.setText("Ouch");
			
		}	
	}
	class ColorListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			frame.repaint();
			
		}
	}


	@Override
	public void actionPerformed(ActionEvent event) {
		frame.repaint();		
	}
}

	class MyDrawPanel extends JPanel {
	
		public void paintComponent(Graphics g){
			Graphics2D g2d = (Graphics2D) g;
			
			int red = (int) (Math.random() * 255);
			int green = (int) (Math.random() * 255);
			int blue = (int) (Math.random() * 255);
			Color startColor = new Color(red, green, blue);
			
			red = (int) (Math.random() * 255);
			green = (int) (Math.random() * 255);
			blue = (int) (Math.random() * 255);
			Color endColor = new Color(red, green, blue);
			
			GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
			
			g2d.setPaint(gradient);
			g2d.fillOval(70, 70, 100, 100);
			
	}
}
