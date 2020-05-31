package paintbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PaintBox extends JFrame implements ActionListener
{
    Container c;
    JMenuBar menubar;
    JMenu shape;
	JButton b1,b2,b3,b4;

    JMenuItem circle, rectangle, line,poly;
    
    int col=0;
    Graphics g;
    PaintBox ()
    {
        c=getContentPane ();
        setLayout (null );
		b1=new JButton("BLUE");
               b1.setBounds(900,200,120,20);
        add(b1);
                b2=new JButton("RED");
        b2.setBounds(900,300,120,20);
        add(b2);
                b3=new JButton("GREEN");
                b3.setBounds(900,400,120,20);
        add(b3);
        
        b4=new JButton("YELLOW");
                 b4.setBounds(900,500,120,20);
        add(b4);
             
        menubar=new JMenuBar ();
        menubar.setBounds(500,500,120,20);
        shape=new JMenu ("Shape");
        
        circle=new JMenuItem ("Circle");
        rectangle=new JMenuItem ("Rectangle");
        line=new JMenuItem ("Line");
        poly=new JMenuItem("Ploygon");

        shape.add (circle);
        shape.add (rectangle);
        shape.add (line);
shape.add(poly);
        menubar.add (shape);
              
  setJMenuBar (menubar);
        
        
        setSize (1600, 1600);
        setTitle ("Draw Shape");
        setVisible (true);
        circle.addActionListener (this);
        rectangle.addActionListener (this);
        line.addActionListener (this);
        poly.addActionListener(this);
        b1.addActionListener (this);
        b2.addActionListener (this);
        b4.addActionListener (this);
        b3.addActionListener (this);
    }
    public void actionPerformed (ActionEvent ae)
    {
        g=getGraphics ();
        if (col==1)
            g.setColor (Color.blue);
        if (col==2)
            g.setColor (Color.red);
        if (col==3)
            g.setColor (Color.green);
        if (col==4)
            g.setColor (Color.yellow);
        if (ae.getSource () == b1)
          
            col=1;
        if (ae.getSource () == b2)
              
            col=2;
        if (ae.getSource () == b3)
             
            col=3;
        if (ae.getSource () == b4)
          
            col=4;
        if (ae.getSource() == circle)
        {
            g.clearRect (0, 20, 600, 600);
            g.fillOval (150, 150, 400, 400);
        }
        if (ae.getSource() == rectangle)
        {
            g.clearRect (0, 20, 600, 600);
            g.fillRect (150, 150, 400, 400);
        }
        if (ae.getSource() == line)
        {
            g.clearRect (0, 20, 600, 600);
            g.drawLine (150, 150, 400, 400);
        }
        if(ae.getSource()==poly){
            g.clearRect (0, 20, 600, 600);
            int [ ] x = {20, 35, 50, 65, 80, 95};
int [ ] y = {60, 105, 105, 110, 95, 95};
g.drawPolygon(x, y, 6);
        }
    }
    public static void main (String args [] )
    {
        new PaintBox ();
    }
}