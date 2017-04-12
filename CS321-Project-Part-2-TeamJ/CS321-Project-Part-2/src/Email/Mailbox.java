import java.util.ArrayList;
import java.util.Iterator;

// Author: Jennifer Berry
public class Mailbox {
	
	private int boxFlag;
	static ArrayList<Email> box = new ArrayList<Email>();
	
	public Mailbox(){
		boxFlag = -1;
	}
	
	public void send(Email email){
		box.add(email);
	}
	
	public void delete(Email msg){
		if(!box.remove(msg)){
			System.out.println("Message not found.");
		}
	}
	
	public Email compose(){
		//Open window
		// accept data
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
