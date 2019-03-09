
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class gameOver extends JFrame implements ActionListener{
	
	private JPanel panel = new JPanel( new FlowLayout(FlowLayout.CENTER));
	private JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
	private JLabel label = new JLabel("YOU steped over a Mine !");
 	private JLabel label2 = new JLabel("Better off next Time! ") ;
    private Font font = new Font("Arial" ,Font.ITALIC,30);
    private JButton exit = new JButton("Exit");
    private Container con = getContentPane();
    private JButton start = new JButton("Start Again");
	public gameOver()
	{
		setTitle( " Game Over " ) ;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//dispose();
		
		label.setFont(font);
		//con.add(panel2);
		label2.setFont(font);
		label.setForeground(Color.GREEN);
		label2.setForeground(Color.BLUE);
		
		panel.add(label);
		panel.add(label2);
		exit.addActionListener( this );
		start.addActionListener( this );
		panel.add(start);
		panel.add(exit) ;
		panel.setBackground(Color.RED);
		con.add(panel)   ;
	      
		
	}
	
	public void actionPerformed( ActionEvent event)
	{
		Object src = event.getSource();
		
		if( src ==exit)
		{
			dispose();
		}
		if( src == start)
		{
			MineSweeper game = new MineSweeper();
			game.setSize(680,780)      ;
			game.setVisible(true)      ;
			dispose();
			
		}
		
	}

}
