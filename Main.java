import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Main {
	public static void main(String args[]) {
		JFrame frame = new JFrame();
		
		ImageIcon icon = new ImageIcon("like.jpg");
		JLabel label = new JLabel();
		label.setText("Hi!");
		frame.add(label);
		label.setIcon(icon);
		
		JPanel redPanel = new JPanel();
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setBackground(Color.red);
		frame.add(redPanel);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBounds(250,0,250,250);
		bluePanel.setBackground(Color.BLUE);
		frame.add(bluePanel);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBounds(0,250,500,250);
		greenPanel.setBackground(Color.green);
		frame.add(greenPanel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		greenPanel.add(label);
		frame.setSize(750,750);
		frame.setVisible(true);
		
	}
}
