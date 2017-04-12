package Email;

import java.util.ArrayList;
import java.util.Iterator;

// Author: Jennifer Berry
public class Mailbox {
	
	private int boxFlag;
	static ArrayList<Email> box = new ArrayList<Email>();
	
	/*
	 * Mailbox
	 * default constructor for parent class. Do not create mailbox objects;
	 * create an Inbox, SentBox, or TrashBox item.
	 * creating a new Mailbox object will result in an invalid box flag.
	 */
	public Mailbox(){
		boxFlag = -1;
	
	}
	/*
	 * send
	 * @param email
	 * recieves and email object and adds to the mailbox.
	 * This method is called by send in Account class to place the email in the correct box
	 */
	public void send(Email email){
		box.add(email);
	}
	
	/*
	 * delete
	 * @param Email msg
	 * removes specified email object from mailbox. 
	 * Assumes the email object to remove is selected somehow
	 */
	public void delete(Email msg){
		if(!box.remove(msg)){
			System.out.println("Message not found.");
		}
	}
	
	
	
	public Email compose(){
		/*
		 * Need to get information from the input window to this function somehow.
		 * Either the mailbox option can pull from the window, or the information 
		 * can be pulled in the GUI class and sent to this method as parameters.
		 * For controller issues, probably the latter
		 */
		String sender = "";
		String recip = "";
		String subject = "(no subject)";
		String message = "";
		
		// put data in an Email
		Email email = new Email();
		email.setFlag(1); // going to be sent to inbox first
		email.setMessage(message);
		email.setRecipient(recip);
		email.setSender(sender);
		email.setSubject(subject);
		email.setTime();
		return email;
	}
	
	public void display(){
		/*
		 * open pop-out window!
		 */
		Email msg = box.get(0); // default get first element
		String sender = msg.getSender();
		String recip = msg.getRecipient();
		String subject = msg.getSubject();
		String message = msg.getMessage();
		
		// These should now be put in the correct areas of the pop-out window
		
		
	}
	
	public int getBoxFlag(){return boxFlag;}

}
