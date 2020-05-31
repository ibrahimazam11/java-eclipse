package finalpro;

import java.awt.BorderLayout;
import java.awt.Component;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display {
public void display()
{
	 JFrame f=new JFrame("MENU");
	 f.setSize(200,150);
	 f.setLocationRelativeTo(null);
	 f.setVisible(true);
	 f.setLayout(new BorderLayout());
	 JPanel p=new JPanel();
	 p.add(new JLabel("Computer"),BorderLayout.WEST);
	 f.add(p);
		//RandomAccessFile input;
			try {
				File temp=new File("tem.txt");
				Scanner scan=new Scanner(temp);
				while(scan.hasNextLine())
				{
					String line=scan.nextLine();
					System.out.println(line);
					
				}
				scan.close();
			}
				catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	 
}
}
