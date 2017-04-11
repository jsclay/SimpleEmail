package GUI;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * GUI for the message box
 * 
 * @author John S. Clay
 *
 */
public class MessageGUI 
{
	private MessageGUIController m_controller;
	
	public MessageGUI(MessageGUIController controller)
	{
		//set up the controller
		m_controller = controller;
		
		//frame
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		
		//panels
		JPanel toPanel = new JPanel();			//recipient field
		JPanel subjectPanel = new JPanel();		//subject field
		JPanel textPanel = new JPanel();		//text body field
		
		//Setup panels
			//toPanel
			JLabel toLabel = new JLabel("To:         ");
			JTextField toText = new JTextField(30);
			toPanel.add(toLabel);
			toPanel.add(toText);
			
			//subjectPanel
			JLabel subjectLabel = new JLabel("Subject: ");
			JTextField subjectText = new JTextField(30);
			subjectPanel.add(subjectLabel);
			subjectPanel.add(subjectText);
		
		//add panels to frame
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.add(toPanel);
		frame.add(subjectPanel);
		frame.add(textPanel);
		
		//set frame visible
		frame.setVisible(true);
	}
}
