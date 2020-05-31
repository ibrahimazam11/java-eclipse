package finalpro;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Search extends Display{
	static int n=0;
	static int x=0;
	public void setsearch()
	{
		Input i=new Input();
		JFrame f1=new JFrame("SEARCH");
		f1.setSize(200,150);
		f1.setLocationRelativeTo(null);
		f1.setVisible(true);
		f1.setLayout(new BorderLayout());
		f1.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		 final JPanel p1=new JPanel();
		p1.add(new JLabel("ENTER SERIAL NUMBER"));
		final JTextField t=new JTextField(8);
		p1.add(t);
		JButton ok=new JButton("OK");
		p1.add(ok);
		ok.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent e)
			 {
				 final String serial;
			serial=t.getText();
			//System.out.println(""+serial);

			//RandomAccessFile input=null;
			try {
				File temp=new File("tem.txt");
				//input=new RandomAccessFile("tem.txt","rw");
				Scanner scan=new Scanner(temp);
				do
				{
					String line=scan.nextLine();
					//System.out.println(line);
					if(line.equalsIgnoreCase(serial))
					{
						System.out.println(line);
						x=1;
						//display();
	break;
				}
					else
					{
						n=n+1;
					}
			}while(scan.hasNextLine());
				if(n==5){
					System.out.println("No data Found");
					x=2;
				}
			}
			
		catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 }
		});
		f1.add(p1);
		f1.add(p1);
	}
	public int get()
	{
		return x;
	}
}
