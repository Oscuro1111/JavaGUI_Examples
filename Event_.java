
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("unused")
public class Event_  extends JFrame implements KeyListener,ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel prompt = new JLabel("Type Keys Belows");
	private JPanel panel = new JPanel()   ;
	private JPanel panel2 = new JPanel()  ;
	private JButton button_red = new JButton("Click to change Red")  ; 
	private JButton button_blue = new JButton("Click to change Blue");
	private JButton button_green = new JButton("Cick to change to Green " ) ;
	
	private JLabel outputlabel = new JLabel("")               ;
	private Container container = getContentPane();
	private CardLayout card = new CardLayout();
	private JTextField text_field = new JTextField(100); 
	private int len ;
	private int  record = 0 ;
	private JScrollPane scroll = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS , JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	String entry ="Entry:"  ;
	StringBuilder con = new StringBuilder( entry ) ;
	
	public Event_()
	{
		
		super( " Select title " )              ;
		
		container.setLayout(new BorderLayout());
		container.add(panel,BorderLayout.WEST) ;
		container.add(panel2 , BorderLayout.EAST);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(scroll)                             ;
		panel.setLayout( new BorderLayout() )         ;
		panel.add( prompt , BorderLayout.NORTH)       ;
		panel.add( text_field , BorderLayout.CENTER ) ;
		panel.add( outputlabel , BorderLayout.SOUTH)  ;
	    
		panel2.setLayout(new FlowLayout())     ;
		panel2.add(button_red)  ;
		panel2.add(button_green);
		panel2.add(button_blue) ;
		
		button_red.addActionListener(this);
		button_green.addActionListener(this);
		button_blue.addActionListener( this );
	    
		text_field.addKeyListener( this )             ;
		
	}
	
	public void actionPerformed( ActionEvent e){
		Object src = e.getSource() ;
		if(src==button_red)
		{
			panel2.setForeground(Color.RED);
			
		} 
		if(src==button_blue)
		{
			panel.setBackground(Color.BLUE);
		}
		if( src==button_green)
		{
			text_field.setBackground(Color.GREEN);
			panel.setBackground(Color.GREEN);
		}
	}
	
	public void keyTyped( KeyEvent e )
	{
		char ch = e.getKeyChar() ;
		short flg = 0            ;
		
		String get_string = text_field.getText();
	    len = get_string.length()               ;
	    //System.out.println("Output: "+get_string+"\n Length : "+len);
	    
	   if(len>=record) {
		con.append(ch); 
		outputlabel.setText(con.toString());
		++record;          
		flg=1   ;
		
	   }
	   
	   if ( record > len)
	    {
		   if(flg==1)
		   {
			     return;
		   }
	    	 System.out.println(" else Output: "+get_string+"\n Length : "+len+" Record: "+record ) ;
	        con.deleteCharAt(5+record);
	        outputlabel.setText(con.toString());
	       
	        record=record-1;
	 
	        System.out.println("Record: "+record);
	        
	        	
	    }
	    
	   
	}
	@Override
	public void keyPressed(KeyEvent e) {
		
		 
	       
		//System.out.println("I am Runing too!");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
