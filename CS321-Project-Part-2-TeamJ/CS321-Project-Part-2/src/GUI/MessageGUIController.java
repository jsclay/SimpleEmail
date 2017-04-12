package GUI;

/**
 * Controller for the message GUI
 * 
 * @author John S. Clay
 *
 */
public class MessageGUIController 
{
	private String m_recipient;
	private String m_subject;
	private MessageGUI m_gui;

	/**
	 * controller for message GUI
	 */
	public MessageGUIController()
	{
		MessageGUI gui = new MessageGUI(this);
	}
	
	/**
	 * get and store the recipient from the "To" text field into member variable
	 * @param recipient text from the recipient text field
	 */
	public void retrieveRecipient(String recipient)
	{
		m_recipient = recipient;
	}
	
	/**
	 * @return recipient from the recipient text field
	 */
	public String getRecipient()
	{
		return m_recipient;
	}
	
	/**
	 * get and store the subject from the "Subject" text field into member variable
	 * @param subject text from the subject text field
	 */
	public void retrieveSubject(String subject)
	{
		m_subject = subject;
	}
	
	/**
	 * @return subject from the subject text field
	 */
	public String getSubject()
	{
		return m_subject;
	}
	
	/**
	 * The "Send" button was clicked on the message window
	 * @param message message to send
	 */
	public void sendMessage(String message)
	{
		int i = 0 + 1;
	}
	
	
	/**
	 * !!!! THIS IS ONLY TO BE CALLED IN MESSAGE GUI !!!!
	 * get instance of GUI.
	 * this is only used in Reply when we need to manually set the recipient ourselves
	 * 
	 * @param g instance of MessageGUI
	 */
	public void retrieveGUIInstance(MessageGUI g)
	{
		m_gui = g;
	}
	
	public void setRecipient(String recipient)
	{
		
	}
}
