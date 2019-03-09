import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings({"unused","serial"})
public class drawString  extends JFrame {
	
	private Font bigFont = new Font("Arial",Font.BOLD,20);
	private String hello = "Hello";
			
			public drawString()
			{
				setTitle("Draw String Demo");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
			
			@Override
			public void paint( Graphics g)
			{
				super.paint(g);
				g.setColor(Color.GREEN);
				g.setFont(bigFont);
				g.drawString(hello,10,100);
				
				
			}
			

}
