package finalpro;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Modify extends Search{
	static int x=0;
	Input i;
	protected static final String MODE_APPEND = null;
public void editdata()
{
	 final JFrame p2=new JFrame("Modify");
	 p2.setSize(200,150);
	 p2.setLocationRelativeTo(null);
	 p2.setVisible(true);
	 JPanel p=new JPanel();
	 p2.setLayout(new BorderLayout());
	 //Search s=new Search();
	 setsearch();
	 JButton mo=new JButton("modify");
	 p.add(mo);
	 mo.addActionListener(new ActionListener()
	 {
			public void actionPerformed(ActionEvent e)
			 {
				/*final JFrame f=new JFrame("Modi");
				 f.setSize(200,150);
				 f.setLocationRelativeTo(null);
				 f.setVisible(true);
				 f.setLayout(new BorderLayout());
				final JPanel p1=new JPanel();
				final JPanel p3=new JPanel();
				/*JButton n=new JButton("Name");
				JButton m=new JButton("Model");
				JButton ma=new JButton("Make");
				final JButton p=new JButton("Price");
				JButton s=new JButton("Serial num");
				p1.add(n);
				p1.add(m);
				p1.add(ma);
				p1.add(p);
				p1.add(s);
			//	p.add(m);
			//	p.add(ma);
			//	p.add(p);
			//	p.add(s);
			//	p.add(new JLabel("name"));
				n.addActionListener(new ActionListener()
				 {
					public void actionPerformed(ActionEvent e)
					{
						final JFrame f2=new JFrame("Modi");
						 f2.setSize(200,150);
						 f2.setLocationRelativeTo(null);
						 f2.setVisible(true);
						 f2.setLayout(new BorderLayout());
						 final JPanel p6=new JPanel();
						p6.add(new JLabel("NAME"));
		 final JTextField t=new JTextField(8);
					JButton ok =new JButton("OK");
					p3.add(ok);
			 ok.addActionListener(new ActionListener()
			 {
				public void actionPerformed(ActionEvent e)
				{*/
					
	//final String nn="mate";
	//nn=t.getText();
	
	
	//File n=new File("new.txt");
	//BufferedWriter bufferfilewriter = null;
	//FileWriter output=null;
	try {
		File temp=new File("tem.txt");
		//input=new RandomAccessFile("tem.txt","rw");
		Scanner scan=new Scanner(temp);
		do
		{
			//Scanner scan=new Scanner(temp);
			String line=scan.nextLine();
			//System.out.println(line);
			if(line.equalsIgnoreCase(i.name))
			{
				i.name="mmmm";
				System.out.println(i.name);
				break;

		}
			else
			{
				System.out.println("modify");
			}

	}while(scan.hasNextLine());
	}
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	/*try{
		Scanner scan=new Scanner(temp);
do
{
	
	String ii=scan.nextLine();
	output=new FileWriter(n,true);
	bufferfilewriter=new BufferedWriter(output); 
	int y=1;
	if(y==1)
	{
		output.append(i.name);
		y++;
	}
	if(ii==i.model)
	{
	output.append(ii);
	bufferfilewriter.close();
	}
	if(ii==i.make)
	{
	output.append(ii);
	bufferfilewriter.close();
	}
	if(ii==i.price)
	{
	output.append(ii);
	bufferfilewriter.close();
	}
	if(ii==i.serial)
	{
	output.append(ii);
	bufferfilewriter.close();
	}
}while(scan.hasNextLine());
	}
	catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	f.add(p1);
	//f2.add(p6);
				}
				});
		//	 }
	 //});*/
			 }
	 });
	 p2.add(p);
}
}