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
	
	public static void main(String[] args) 
	{
		MessageGUIController controller = new MessageGUIController();
	}
	/**
	 * controller for message GUI
	 */
	public MessageGUIController()
	{
		MessageGUI gui = new MessageGUI(this);
	}
	
	/**
	 * get and store the recipient from the "To" text field
	 * @param recipient text from the recipient text field
	 */
	public void retrieveRecipient(String recipient)
	{
		m_recipient = recipient;
	}
	
	/**
	 * get and store the subject from the "Subject" text field
	 * @param subject text from the subject text field
	 */
	public void retrieveSubject(String subject)
	{
		m_subject = subject;
	}
}
