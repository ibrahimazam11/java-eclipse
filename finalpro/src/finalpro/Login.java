package finalpro;
import java.awt.BorderLayout;
import java.util.Scanner;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Login {
	
	 private static  String x;
	 private static  String pa;
	 private static  int z;
	public void setlogin()
	 {
		 //Scanner in=new Scanner(System.in);
		 JFrame p2=new JFrame("LOGIN");
		 p2.setSize(200,150);
		 p2.setLocationRelativeTo(null);
		 p2.setVisible(true);
		 p2.setLayout(new BorderLayout());
		 JPanel p=new JPanel();
		 JPanel p4=new JPanel();
		 p2.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		 p.add(new JLabel("USER NAME"));
		 final JTextField t=new JTextField(8);
		 p.add(t);
      
		 t.addActionListener(new ActionListener()
		 {
		 	 public void actionPerformed(ActionEvent e)
		 	 {
		 	 String user;
		 	user=t.getText();
		 	 x=user;
		 	System.out.println(""+user);
		 	 }
		 });
	
		 p2.add(p);
		 p4.add(new JLabel("Password"));
		 final JTextField t1=new JTextField(8);
		 p4.add(t1);

		 t1.addActionListener(new ActionListener()
		 {
		 	 public void actionPerformed(ActionEvent e)
		 	 {
		 	 String pass;
		 	pass=t1.getText();
		 	pa=pass;
		 	System.out.println(""+pass);
		 	 }
		 });
		   p2.add(p);
		 p2.add(p4);
		 if(x=="moiz" && pa=="123")
		 {
		 z=1;
		 }
	 }
	public static int get()
	{
		return z;
	}
}