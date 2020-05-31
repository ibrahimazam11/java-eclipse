package frame;

import java.awt.*;
import javax.swing.*;

public class jframe extends JFrame
{
	public static void main(String[] args)
	{
			
		JFrame frame = new JFrame("Ibrahim");
				
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		
		JLabel l1 = new JLabel("First Name");
		JLabel l2 = new JLabel("Last Name");
		JLabel l3 = new JLabel("Enter Age");
		JTextField t1 = new JTextField(8);
		JTextField t2 = new JTextField(8);
		JTextField t3 = new JTextField(5);
		
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		
		p1.add(b1, BorderLayout.EAST);
		p1.add(b2,BorderLayout.EAST);
		//JButton j1 = new JButton("Yes");
		//JButton j2 = new JButton("No");
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(l3);
		p.add(t3);
		
		frame.add(p1,BorderLayout.EAST);
		frame.add(p);
		frame.setTitle("abcdefg");
		frame.setSize(450,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(400,100);
		frame.setVisible(true);

	}
}
