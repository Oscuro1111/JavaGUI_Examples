import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;
@SuppressWarnings({ "unused", "serial" })
public class MineSweeper extends JFrame implements ActionListener, MouseListener{
	
	private final int ROW = 15;
	private final int COLS =15;
	private final int NUM = ROW*COLS;
	private final int GAPS = 10;
	private int[] record = new int[NUM];
	private JPanel firstPanel = new JPanel( new GridLayout(ROW,COLS,GAPS ,GAPS ));
	private JButton exit = new JButton("Exit");
	private String[] num = new String[NUM];
    private Random rand = new Random();
	private JPanel[] panels = new JPanel[NUM];
	
	private boolean flg = true;
	private JPanel test= new JPanel();
	
	private Container con = getContentPane();
	private String str ="";
	private JLabel label = new JLabel("");
	private BorderLayout layout_ = new BorderLayout(2,2);
	private JLabel[] labels = new JLabel[NUM]           ;
	private Font font = new Font("Arial" , Font.ITALIC , 20);
	public MineSweeper()
	{
		
		setTitle("Mine Sweeper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		con.add(firstPanel);
		exit.addActionListener( this );
		int mines = rand.nextInt(NUM);
		
	   for( int x = 0 ; x<NUM ;x++)
	   {
		    panels[x]= new JPanel();
		    labels[x] = new JLabel();
		    panels[x].setLayout(new FlowLayout( FlowLayout.CENTER));
		    
		    
		    if(rand.nextInt(NUM)%mines==0)
		    {
		    	record[x]=-1;
		    	labels[x].setText("");
		    	
		    }
		    else {
		    	num[x]=""+rand.nextInt(50);
		    	
		    	record[x]=0;
		    	labels[x].setText("");
		    }
		    //num[x]= rand.nextInt(50);
		    
		    labels[x].setFont(font);
		    labels[x].setForeground(Color.BLUE);
		    panels[x].add(labels[x]);
		    firstPanel.add(panels[x]);
		    panels[x].addMouseListener( this );
			panels[x].setBackground(Color.darkGray);
		    
	   }
	}
	
	public void actionPerformed( ActionEvent event)
	{
		Object src  = event.getSource();
		if(src ==exit)
		{
			System.exit(0);
		}
	    
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(flg==false)
			return;
		
		Object src =  e.getSource();
		System.out.println("Enterd");
		for( int x = 0 ; x<NUM;x++)
		{
			System.out.println("loop");
	   if(src==panels[x])
	   {
		   if(record[x]==-1)
		   {
			   labels[x].setFont( new Font("Arial" ,Font.ITALIC , 10));
			   ImageIcon icon = new ImageIcon("C:\\Users\\Regal\\Desktop\\Mine.png");
			   labels[x].setIcon(icon);

			   //labels[x].setText("BOOOM!");
			   panels[x].setBackground(Color.RED);
			   
			   gameOver();
			   dispose();
		   }
		   if(record[x]==1) {
			   
			  
			   System.out.println("OOK");
				   labels[x].setText(" ");
				   
				   panels[x].setBackground(Color.darkGray);
			       record[x]=0;
			       break;
			   
		   }		   
		   else if(record[x]==0){
		   labels[x].setText(num[x]);
		  
		   panels[x].setBackground(Color.GREEN);
		   record[x]=1;
		   break;
		   }
		   else
			   continue;
	   }
	   
	  
}
	
		
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void gameOver() 
	{
		for( int x= 0 ; x<NUM;x++)
		{
			if( record[x]!=-1) {
			labels[x].setText(num[x]);
			panels[x].setBackground(Color.GREEN);
			}
			else
			{
				labels[x].setFont( new Font("Arial" ,Font.ITALIC , 20));
				 ImageIcon icon = new ImageIcon("C:\\Users\\Regal\\Desktop\\Mine.png");
				   labels[x].setIcon(icon);

				panels[x].setBackground(Color.RED);
			}
			
		}
		flg=false;
		
		JOptionPane.showMessageDialog(null,"Game Over ! ");
	  
	   
	 	gameOver over = new gameOver();
		over.setSize(700,600);
		over.setVisible(true);
		    
		 
	}


}
