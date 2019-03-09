
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

@SuppressWarnings({"unused","serial"})

public class JDemoGraphic extends JFrame {
	
	private String moveQuote = new String("You talk to me ?");
	
	private int x= 30 , y = 100 ;
	
	private Font bigFont = new Font("Boope",Font.ITALIC,30);
	
	public JDemoGraphic()
	{
		setTitle("JDemoGrapics");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public void paint( Graphics g)
	{
		super.paint(g);
		g.setColor(Color.magenta);
	    g.setFont(bigFont);
		g.drawString(moveQuote, x, y);
	}
	

}
