

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("unused")

public class Mouse_Event_Handel extends JFrame implements MouseListener{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private int x,y;
	private JLabel label = new JLabel("Do somthing with Mouse!");
	private JButton button = new JButton("Click me");
	private Container con = getContentPane();
	
	String msg = "";
	public Mouse_Event_Handel()
	{
		setTitle("Mose Action");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		con.add(button);
		addMouseListener( this );
		add(label);
		
	}
	public void MouseClicked( MouseEvent event)
	{
	
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Hello");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent event ) {
		// TODO Auto-generated method stub
		
		int whichButton =event.getButton();
		msg="";
		msg ="You Pressed Mouse " ;
		
		if(whichButton==MouseEvent.BUTTON1)
			msg+=" BUTTON 1";
		else if(whichButton==MouseEvent.BUTTON2)
			msg+="Button 2";
		else
			msg+="Button 3";
		
		msg+="You are at position "+"<X "+event.getX()+" Y "+event.getY()+">";
		
		if(event.getClickCount()==2)
		{
			msg+=" You double Clicked";
		}
		else
			msg+=" You singel-Clicked";
		
		label.setText(msg);
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		msg="";
		msg+=" You Entered the frame";
		
		label.setText(msg);
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		msg="";
		msg+="You Exited the frame";
		
		label.setText(msg);
	}
	
}
