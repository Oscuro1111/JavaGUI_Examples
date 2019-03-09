import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings( "unused")
public class EventSelecter extends JFrame implements ActionListener {
	
	private JMenuBar mainBar = new JMenuBar();
	private JMenu menu1 = new JMenu("File");
	private JMenu menu2 = new JMenu("Event Types");
	
	private JMenuItem exit = new JMenuItem("Exit");
	
	private JMenu adult = new JMenu("Adult");
	private JMenu child = new JMenu("Child");
	
	private JMenuItem adultBirthday = new JMenuItem("Birthday");
	
	private JMenuItem anniversary = new JMenuItem("Anniversary");
	private JMenuItem retirement = new JMenuItem("Retirement")  ;
	
	private JMenuItem adultOther = new JMenuItem("Other");
	
	private JMenuItem childBirthday = new JMenuItem("Birthday");
	private JMenuItem childOther = new JMenuItem("Other");
	
	private JPanel birthdayPanel = new JPanel();
	private JPanel otherPanel  = new JPanel();
	
	private JLabel birthdayLabel = new JLabel("Birthday event is our Specialty");
	private JLabel otherLabel = new JLabel("We have lot of new Ideas for memorial events");
	
	private Font font = new Font("Ärial" , Font.BOLD,20 );
	
	private JPanel buttonPanel = new JPanel();
	
	private JRadioButton formelEvent = new JRadioButton("Formal Events");
	private JRadioButton casualEvent = new JRadioButton("Casual Events ");

	
	public EventSelecter()
	{
		setTitle("Event Selecter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout( new FlowLayout());
		composeMenu();
		addActionListener();
		layoutComponets();
		
		
	}
	public void composeMenu()
	{
		setJMenuBar(mainBar);
		
		mainBar.add(menu1);
		mainBar.add(menu2);
		
		menu1.add(exit);
		
		menu2.add(adult);
		menu2.add(child);
		
		adult.add(adultBirthday);
		adult.add(anniversary);
		adult.add(retirement) ;
		adult.add(adultOther) ;
		
		child.add(childBirthday);
		child.add(childOther);
	
		
		
	}
	public void layoutComponets()
	{
		//birthdayPanel.setLayout( new FlowLayout(FlowLayout.CENTER));
		birthdayPanel.setLayout(new BorderLayout());
		otherPanel.setLayout( new GridLayout(2,1,10,10));
		birthdayPanel.add(birthdayLabel,BorderLayout.CENTER);
		
		otherPanel.add("other",otherLabel);
		otherPanel.add("buttons" , buttonPanel);
		
		buttonPanel.add(formelEvent);
		buttonPanel.add(casualEvent);
		
		add(birthdayPanel);
		add( otherPanel)  ;
		
		
	}
	
	public void actionListener( ActionEvent Events)
	{
		
	}
	
	public void addActionListener()
	{
		exit.addActionListener(this);
		adultBirthday.addActionListener( this );
		childBirthday.addActionListener( this );
		
		childOther.addActionListener(  this );
		adultOther.addActionListener(  this );
		anniversary.addActionListener( this );
		retirement.addActionListener(  this );
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		Container con = getContentPane();
		
		if(src==exit)
		{
			System.exit(0);
		}
		else if( src==childBirthday || src==childOther)
		{
			con.setBackground(Color.PINK);
		}
		else 
			con.setBackground(Color.WHITE);
		 if( src==adultBirthday || src==childBirthday)
		{
			birthdayPanel.setBackground(Color.YELLOW);
			otherPanel.setBackground(Color.WHITE);
		}
		else
		{
			birthdayPanel.setBackground(Color.YELLOW);
			otherPanel.setBackground(Color.WHITE)    ;
			
		}
		// TODO Auto-generated method stub
		
	}
}
