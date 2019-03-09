
import java.awt.* ;
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings({"unused","serial"})

public class setLocation extends JFrame implements ActionListener{
	
	private JButton button = new JButton("Press");
	private int x= 0, y= 0;
	private final int GAPS = 30;
	public setLocation()
	{
		setTitle("Set Location Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout( new FlowLayout());
		add(button);
		button.addActionListener( this );
	}
	
	public void actionPerformed(ActionEvent e)
	{
		button.setLocation(x,y);
		x+=GAPS;
		y+=GAPS;
	}

}
