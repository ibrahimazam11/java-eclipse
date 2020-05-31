package finalpro;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.xml.stream.events.Characters;

import java.io.*;
import java.util.Scanner;
public class Input extends Display{
	String name;
	String model;
	String make;
	String price;
	String serial;
	protected static final String MODE_APPEND = null;
	public void setdata()
	{
JFrame f1=new JFrame("INPUT");
f1.setSize(1000,150);
f1.setLocationRelativeTo(null);
f1.setVisible(true);
f1.setLayout(new BorderLayout());
final JPanel p1=new JPanel();
JPanel p2=new JPanel();
//f1.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
JButton ok=new JButton("OK");

p1.add(new JLabel("COMPUTER NAME"));
final JTextField t=new JTextField(8);
p1.add(t);
p1.add(new JLabel("MODEL NO."));
final JTextField t1=new JTextField(8);
p1.add(t1);
p1.add(new JLabel("MAKE"));
final JTextField t2=new JTextField(8);
p1.add(t2);
p1.add(new JLabel("PRICE"));
final JTextField t3=new JTextField(8);
p1.add(t3);
p1.add(new JLabel("Serial NO."));
final JTextField t4=new JTextField(8);
p1.add(t4);
ok.addActionListener(new ActionListener()
{
	public void actionPerformed(ActionEvent e)
	 {
	//final String n;
	name=t.getText();
	//String name=n;
	File temp=new File("tem.txt");
BufferedWriter bufferfilewriter = null;
	RandomAccessFile set=null;
	
	FileWriter output=null;
		try {
			//new RandomAccessFile(temp,"rw");
			output =new FileWriter(temp,true);
			bufferfilewriter=new BufferedWriter(output); 
			output.append(name);
			output.append("\n");
			bufferfilewriter.close();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	model=t1.getText();
		try {
			output = new FileWriter(temp,true);
			bufferfilewriter=new BufferedWriter(output); 
		output.append("\n");
			output.append(model);
			output.append("\n");
			bufferfilewriter.close();

			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	



	make=t2.getText();
	
	try {
			output = new FileWriter(temp,true);
			bufferfilewriter=new BufferedWriter(output); 
			output.append("\n");
			output.append(make);
			output.append("\n");
			bufferfilewriter.close();
		
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}



	price=t3.getText();
	//int pric=Integer.parseInt(price);

try {
			output = new FileWriter(temp,true);
			bufferfilewriter=new BufferedWriter(output); 
			output.append("\n");
			output.append(price);
			output.append("\n");
			bufferfilewriter.close();
			

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
	serial=t4.getText();
	
	try {
			output = new FileWriter(temp,true);
			bufferfilewriter=new BufferedWriter(output); 
			output.append("\n");
			output.append(serial);
			output.append("\n");
			bufferfilewriter.close();			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}); 
p1.add(ok);

f1.add(p1);
	}
}

/*public class Input extends Display{
	String name;
	String model;
	String make;
	String price;
	String serial;
	protected static final String MODE_APPEND = null;
	public void setdata()
	{
            JFrame f1=new JFrame("INPUT");
            f1.setSize(1000,150);
            f1.setLocationRelativeTo(null);
            f1.setVisible(true);
            f1.setLayout(new BorderLayout());
            final JPanel p1=new JPanel();
            JPanel p2=new JPanel();
            //f1.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
            JButton ok=new JButton("OK");

            p1.add(new JLabel("COMPUTER NAME"));
            final JTextField t=new JTextField(8);
            p1.add(t);
            p1.add(new JLabel("MODEL NO."));
            final JTextField t1=new JTextField(8);
            p1.add(t1);
            p1.add(new JLabel("MAKE"));
            final JTextField t2=new JTextField(8);
            p1.add(t2);
            p1.add(new JLabel("PRICE"));
            final JTextField t3=new JTextField(8);
            p1.add(t3);
            p1.add(new JLabel("Serial NO."));
            final JTextField t4=new JTextField(8);
            p1.add(t4);
            
            ok.addActionListener(new ActionListener(){
	
                public void actionPerformed(ActionEvent e){
                    String filename = "input.csv";
                    name=t.getText();
                    model=t1.getText();
                    make=t2.getText();
                    price=t3.getText();
                    serial=t4.getText();
	
                    PrintWriter csvWriter;
        
                    try {
                            StringBuffer myStringBuffer = new StringBuffer();
                            File file = new File(filename);
			
                            if (!file.exists()) {
                                file = new File(filename);
                            }
        
                            csvWriter = new PrintWriter(new FileWriter(file, true));

                            /*2. append to stringBuffer*/   
        
                            //myStringBuffer.append(name + "," + model + "," + make + "," + price + "," + serial);
                            //myStringBuffer.append("\n");
        
                            /*3. print to csvWriter*/
                            /*csvWriter.print(myStringBuffer);
                            
                            csvWriter.close();
                  
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

            
            
    } 
	
});
            p1.add(ok);
            f1.add(p1);
}
        
}
*/