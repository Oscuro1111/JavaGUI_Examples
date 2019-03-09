
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings({ "unsed", "serial" })

public class JCheckBox_MenuItem extends JFrame {
	private JMenuBar mainBar = new JMenuBar();
	private JMenu menu1 = new JMenu("File");
	
	private JCheckBoxMenuItem check1 = new JCheckBoxMenuItem("Check Box A");
	private JCheckBoxMenuItem check2 = new JCheckBoxMenuItem("Check Box B");
	
	private JRadioButtonMenuItem radio1= new JRadioButtonMenuItem("Radio option A");
	private JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Radio Option B");
	private JRadioButtonMenuItem radio3 = new JRadioButtonMenuItem("Radio Option C");
	
	private ButtonGroup group = new ButtonGroup();
	
	public JCheckBox_MenuItem()
	
	{
		setTitle("Menu Demonnstration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout( new FlowLayout());
		
		setJMenuBar(mainBar);
		mainBar.add(menu1);
		menu1.add(check1);
		menu1.add(check2);
		
		menu1.addSeparator();
		menu1.add(radio1);
		menu1.add(radio2);
		menu1.add(radio3);
		
		menu1.setMnemonic('F');
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		
		
		
	}

}
