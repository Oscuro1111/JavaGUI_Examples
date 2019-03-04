
import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")

public class MAIN extends JFrame {
	private JPanel panel = new JPanel();
	private JScrollPane scroll = new JScrollPane(panel , ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	private JLabel label = new JLabel("Four score and seven");
	private Font font = new Font("Arial" , Font.PLAIN,20);
	
	private Container con ;
	
	public MAIN()
	{
		super("JScrollBar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		con = getContentPane();
		label.setFont(font);
		con.add(scroll);
		panel.add(label);
		
	}
	public static void main( String[] args)
	{
		final int WIDTH = 180;
		final int HEIGHT = 200;
		
			Menu_Bar mouse = new Menu_Bar();
			
			
		
		mouse.setSize(WIDTH,HEIGHT);
		mouse.setVisible(true);
		
	}

}
