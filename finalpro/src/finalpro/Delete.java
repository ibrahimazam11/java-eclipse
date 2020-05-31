package finalpro;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Delete extends Input {
	static int x=0;
	protected static final String MODE_APPEND = null;
	public void setdelete()
	{
		 JFrame f=new JFrame("delete");
		 f.setSize(200,150);
		 f.setLocationRelativeTo(null);
		 f.setVisible(true);
		 f.setLayout(new BorderLayout());
		 JPanel p=new JPanel();
	   Search s1=new Search();
		s1.setsearch();
		x=s1.get();
		JButton del=new JButton("Delete");
		p.add(del);
		
		del.addActionListener(new ActionListener()
		{
			 public void actionPerformed(ActionEvent e)
			 {
				 File temp=new File("tem.txt");
				 FileWriter output=null;
				 FileWriter input=null;
				 BufferedWriter bufferfilewriter = null;
					File t=new File("new.txt");
					
					 try{
						
						 output=new FileWriter(t,true);
						 input=new FileWriter(temp,true);
						 bufferfilewriter=new BufferedWriter(output);
						 bufferfilewriter=new BufferedWriter(input); 
						 output.append("0");
						 //File oo=new File(temp);
							bufferfilewriter.close();
							
							if(temp.delete())
							{
								t.renameTo(temp);
							}
							else
							{
								System.out.println("not done");
							}
				 }
						catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					

				 
}
});
		 f.add(p);
}
}
