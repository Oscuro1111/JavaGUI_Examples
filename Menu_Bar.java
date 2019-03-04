
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings({ "unused", "serial" })

public class Menu_Bar extends JFrame implements ActionListener {
             private JMenuBar mainBar = new JMenuBar();
             private JMenu menu1 = new JMenu("File");
             private JMenu menu2 = new JMenu("Color");
             
              private JMenuItem exit = new JMenuItem("Exit");
              private JMenu bright = new JMenu("Bright");
              
              private JMenuItem dark = new JMenuItem("Dark");
              private JMenuItem white = new JMenuItem("White");
              private JMenuItem pink =  new JMenuItem("Pink");
              private JMenuItem yellow = new JMenuItem("Yellow");
              
              private JLabel label = new JLabel("Hello");
             
              
              public Menu_Bar()
              {
            	  setTitle("Menu Bar Demo");
            	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	  
            	  setLayout( new FlowLayout());
            	  
            	  setJMenuBar(mainBar);
            	  mainBar.add(menu1);
            	  mainBar.add(menu2);
            	  
            	  menu1.add(exit);
            	  menu2.add(bright);
            	  menu2.add(dark);
            	  menu2.add( white);
            	  //submenu
            	  bright.add(pink);
            	  bright.add( yellow);
            	  
            	  dark.addActionListener( this )  ;
            	  white.addActionListener( this ) ;
            	  yellow.addActionListener( this );
            	  pink.addActionListener( this )  ;
            	  exit.addActionListener( this )  ;
            	  
            	  add( label);
            	  label.setFont( new Font("Arial" , Font.BOLD , 30));
            	  
            	  
              }
              
              public void actionPerformed( ActionEvent event )
              {
            	  Object src = event.getSource();
            	  
            	  Container con = getContentPane();
            	  
            	  if( exit==src)
            	  {
            		  System.exit(0);
            	  }
            	  else if( dark==src)
            	  {
            		  con.setBackground(Color.black);
            	  }
            	  else if( white==src)
            	  {
            		  con.setBackground(Color.white);
            	  }
            	  else if(src==pink)
            	  {
            		  con.setBackground(Color.pink);
            	  }
            	  else if( src==yellow)
            	  {
            		  con.setBackground(Color.yellow);
            	  }
            	  else
            	  {
            		  
            	  }
            	
              }
              
              
}