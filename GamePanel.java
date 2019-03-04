
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JFrame
{
	/**
	 * 
	 * Author: Oscuro Smith
	 * 
	 * Check Board
	 */
	
	private static final long serialVersionUID = 1L;
	private final int ROW = 8;
	private final int COLS = 8;
	final int GAPS =  2;
	private final int NUM = ROW*COLS;
	
	private JPanel first_panel = new JPanel(new GridLayout( ROW , COLS , GAPS , GAPS ) ) ;
	
	private JPanel[] panels = new JPanel[NUM];
	
	private int x;
	
	private Container con = getContentPane();
	private Color color = Color.WHITE;
	private Color color2 = Color.black;	
	private Color tempColor ;
	
	public GamePanel() {
		
		super("Check Panel ") ;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con.add(first_panel);
		for( x = 0 ; x<NUM ; x++)
		{
			panels[x] = new JPanel();
			first_panel.add(panels[x]);
			if( x % 8 == 0 )
			{
				tempColor = color;
				color = color2;
				color2= tempColor;
			}
			if(x%2 == 0 )
			{
				panels[x].setBackground(color);
			}
			else
				panels[x].setBackground(color2);
			
			
		}
		
	}
	
}