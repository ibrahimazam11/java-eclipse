package finalpro;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class Menu{

	public static void main(String [] args)
	 {
		   final String u="moiz";
		  final String pa="123";
	 final JFrame p2=new JFrame("MENU");
	 p2.setSize(200,150);
	 p2.setLocationRelativeTo(null);
	 p2.setVisible(true);
	 p2.setLayout(new BorderLayout());
	 JPanel p1=new JPanel();
	 JButton login=new JButton("LOGIN");
	 login.setBackground(Color.WHITE);	
	 p1.add(login);
	 p2.add(p1);
	 login.addActionListener(new ActionListener()
	 {
		 public  void actionPerformed(ActionEvent e)
		 {
			 final JFrame p2=new JFrame("LOGIN");
			 p2.setSize(250,150);
			 p2.setLocationRelativeTo(null);
			 p2.setVisible(true);
			 p2.setLayout(new BorderLayout());
			 final JPanel p11=new JPanel();
			 final JPanel p4=new JPanel();
			 final JPanel pp=new JPanel();
			 final JPanel pp1=new JPanel();
			 p2.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
			 p4.add(new JLabel("USER NAME"));
			 final JTextField t=new JTextField(8);
			 p4.add(t);
			 pp.add(new JLabel("Password"));
			 final JTextField t1=new JTextField(8);
			 pp.add(t1);
			 final JButton ok1=new JButton("OK");
			 pp.add(ok1);
			 ok1.addActionListener(new ActionListener()
			 {
				 public void actionPerformed(ActionEvent e)
				 {
				 	 final String user;
					 user=t.getText();
					 final String pass;
					pass=t1.getText();
					 if(user.equalsIgnoreCase(u)&& pass.equalsIgnoreCase(pa))
					 {
						
					 JFrame p5=new JFrame("Management");
					 p5.setSize(200,200);
					 p5.setLocationRelativeTo(null);
					 p5.setVisible(true);
					 p5.setLayout(new BorderLayout());
					 JPanel p=new JPanel();
					JButton search=new JButton("SEARCH");
				   search.setBackground(Color.WHITE);
				   p.add(search);
				   
				   search.addActionListener(new ActionListener()
				   {
				   public void actionPerformed(ActionEvent e)
					 {
						 Search s=new Search();
						 s.setsearch();
					 }
					 });
				   p5.add(p);
				   JButton input=new JButton("INPUT");
				   input.setBackground(Color.WHITE);
				   p.add(input);
				   p5.add(p);
				   input.addActionListener(new ActionListener()
				   {
				   public void actionPerformed(ActionEvent e)
					 {
						 Input i=new Input();
						 i.setdata();
					 }
					 });
				   JButton modify=new JButton("MODIFY");
				   modify.setBackground(Color.WHITE);
				   p.add(modify);
				   p5.add(p);
				   modify.addActionListener(new ActionListener()
				   {
				   public void actionPerformed(ActionEvent e)
					 {

						 Modify m=new Modify();
						 m.editdata();
					 }
					 });
				   JButton delete=new JButton("DELETE");
				   delete.setBackground(Color.WHITE);
				   p.add(delete);
				   p5.add(p);
				   delete.addActionListener(new ActionListener()
				   {
				   public void actionPerformed(ActionEvent e)
					 {
					   Delete d=new Delete();
						 d.setdelete();
					 }
					 });
				   JButton display=new JButton("DISPLAY");
				   display.setBackground(Color.WHITE);
				   p.add(display);
				   p5.add(p);
				   display.addActionListener(new ActionListener()
				   {
				   public void actionPerformed(ActionEvent e)
					 {
					   Display d=new Display();
						 d.display();
				   }
					 });
				 }
				 }
			 });

			 
			   p2.add(p4);
			 p2.add(pp);
			 p2.add(pp1);
		 }
		
	 });
	
}
	 }