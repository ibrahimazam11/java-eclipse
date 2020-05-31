
package draw;
import java.awt.*;  

 import java.awt.event.*;  

 import javax.swing.*;  

 import javax.swing.event.*;  

 public class Paint extends JFrame implements MouseListener, MouseMotionListener, ActionListener  

 {  

   int last_x=-10;  

   int last_y=-10;  

   int xpos=-10;  

  int ypos=-10;  

   Container con = null;  

   Color b = (Color.black);  

   Color bblue = (Color.blue);  

   Color ggreen = (Color.green);  

   Color yyellow = (Color.yellow);  

      


   JButton ttext = new JButton("text");  
      
   private JPanel centerPanel;  
   private JPanel westPanel;  

   private JPanel southPanel;  

      
/*
  private boolean texton;  
   private JTextField text2;  
  private String font;  
   private int topX, topY;  
*/
   Label t;  
   

  public Paint() //constructor  

  {  

       Graphics g = getGraphics();  

          

     

   

        

  JButton text2 = new JButton("Clear");  

     text2.addActionListener(  

      new ActionListener () {  

   

          public void actionPerformed( ActionEvent event )  

          {  

                

              repaint();  

          }  

    }
     );


          

     setTitle("Paint");  

     setBackground(Color.white);  

     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

     con = this.getContentPane();   

     con.setBackground(Color.white);  

     addMouseListener(this);  

    addMouseMotionListener(this);  

       

     //file, help, top  

     JMenuBar menuBar = new JMenuBar();  

     getContentPane().add(menuBar, BorderLayout.NORTH);  

     JMenu fileMenu = new JMenu("File");       

     JMenu helpMenu = new JMenu("Help");  

     menuBar.add(fileMenu);  

     menuBar.add(helpMenu);  

        

     //text  

    

     centerPanel = new JPanel();  




     centerPanel.add(text2);  

    con.add(centerPanel, BorderLayout.CENTER);  



    westPanel = new JPanel();  

     westPanel.setLayout(new GridLayout(4,1));  

 
    southPanel = new JPanel();  

    southPanel.setLayout(new GridLayout(2,2));  

  
     con.add(southPanel, BorderLayout.SOUTH);   

        

   }  

    

     public void actionPerformed(ActionEvent ae){  

       String actionCommand = ae.getActionCommand();  

        if (actionCommand.compareTo("New") == 0){  

            startNewDocument();  

         } else if (actionCommand.compareTo("Exit") == 0){  

               

         } else if (actionCommand.compareTo("About") == 0){  

            }  

     }  

            

 public void startNewDocument(){  

        Graphics g = getGraphics();  

         g.setColor( Color.white );  

        g.fillRect( 0, 0, getSize().width, getSize().height );  

     }  



 public void text(){  

     

     }   


     

 public void mouseDragged(MouseEvent evt)  

   {  

     xpos=evt.getX();  

     ypos=evt.getY();  

     Graphics g = getGraphics();  

     g.setColor(b);  

     g.drawLine(last_x,last_y,xpos,ypos);  

    last_x = xpos;  

    last_y = ypos;  

   }  

    

   public void mousePressed(MouseEvent evt)  

   {  

     last_x = evt.getX();  

    last_y = evt.getY();  

   }  




   public void mouseMoved(MouseEvent evt) {}  

   public void mouseClicked(MouseEvent evt) {}  

   public void mouseReleased(MouseEvent evt) {}  

   public void mouseEntered(MouseEvent evt) {}  

  public void mouseExited(MouseEvent evt) {}  

   public static void main(String[] args)  

   {  
      Paint myDD = new Paint();  

     myDD.setSize(750,550);  

     myDD.setResizable(false); 

     myDD.setVisible(true);    

    

   }  

} 



