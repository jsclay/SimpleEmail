package GUI;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;

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
		frame.setSize(500, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//panels
		JPanel topPanel = new JPanel();			//panel to hold recipient and subject panels
		JPanel toPanel = new JPanel();			//recipient field
		JPanel subjectPanel = new JPanel();		//subject field
		JPanel textPanel = new JPanel();		//text body field
		
		//Setup panels
			//toPanel
			JLabel toLabel = new JLabel("To:          ");
			JTextField toText = new JTextField(30);
			toPanel.add(toLabel);
			toPanel.add(toText);
			
			//subjectPanel
			JLabel subjectLabel = new JLabel("Subject: ");
			JTextField subjectText = new JTextField(30);
			subjectPanel.add(subjectLabel);
			subjectPanel.add(subjectText);
			
			//topPanel
			topPanel.setLayout(new GridBagLayout());
			GridBagConstraints c = new GridBagConstraints();
			c.fill = GridBagConstraints.HORIZONTAL;
			c.weightx = 0;
			c.gridx = 1;
			c.gridy = 0;
			topPanel.add(toPanel, c);
			
			c.weightx = 0;
			c.gridx = 1;
			c.gridy = 1;
			topPanel.add(subjectPanel, c);
			
			//textPanel
			JTextArea textBody = new JTextArea(32, 36);
			JScrollPane scroll = new JScrollPane(textBody);
			textPanel.add(scroll);
		
		//add panels to frame
		//frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(textPanel, BorderLayout.CENTER);
		
		//set frame visible
		frame.setVisible(true);
		
		//set up listeners
			//recipient text field listener
			toText.getDocument().addDocumentListener(new DocumentListener() {
				public void changedUpdate(DocumentEvent e){
					try {
						update(e.getDocument().getText(0, e.getDocument().getLength()));
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}
				}
				public void removeUpdate(DocumentEvent e) {
					try {
						update(e.getDocument().getText(0, e.getDocument().getLength()));
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}
				}
				public void insertUpdate(DocumentEvent e) {
					try {
						update(e.getDocument().getText(0, e.getDocument().getLength()));
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}
				}
				public void update(String s){
					m_controller.retrieveRecipient(s);
				}
			});
		
			//subject text field listener
			subjectText.getDocument().addDocumentListener(new DocumentListener() {
				public void changedUpdate(DocumentEvent e){
					try {
						update(e.getDocument().getText(0, e.getDocument().getLength()));
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}
				}
				public void removeUpdate(DocumentEvent e) {
					try {
						update(e.getDocument().getText(0, e.getDocument().getLength()));
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}
				}
				public void insertUpdate(DocumentEvent e) {
					try {
						update(e.getDocument().getText(0, e.getDocument().getLength()));
					} catch (BadLocationException e1) {
						e1.printStackTrace();
					}
				}
				public void update(String s){
					m_controller.retrieveSubject(s);
				}
			});
	}
}
