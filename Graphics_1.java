

//Chapter: 16
//Graphics

import javax.swing.*;
import  java.awt.event.*;
import java.awt.*       ;

@SuppressWarnings({"unused","serial"})

public class Graphics_1 extends JFrame implements ActionListener{
      private JButton button = new JButton("Press me ");
      
      
      public Graphics_1()
      {
    	  setTitle("Pain Demo");
    	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	  setLayout(new FlowLayout());
    	  button.addActionListener( this );
    	  add(button);
    	  
    	  
      }
      public void actionPerformed( ActionEvent event)
      {
    	 System.out.println("Button Pressed");
    	 repaint();
      }
     public void paint( Graphics g)
      {
    	  super.paint(g)                         ;
    	  System.out.println(" In paint method ");
      }
}
