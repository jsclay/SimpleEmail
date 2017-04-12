import java.sql.Timestamp;

// Author: Jennifer Berry
public class Email {
	private String to;
	private String from;
	private String subject;
	private String message;
	private Timestamp time;
	private int boxFlag;//1=inbox  2=sentbox  3=trashbox
	public Email(){
		
	}
	
	public void setMessage(String s){
		message = s;
	}
	
	public void setSubject(String s){
		subject = s;
	}
	
	public void setRecipient(String s){
		to = s;
	}
	
	public void setSender(String s){
		from = s;
	}
	
	/*
	 * setFlag
	 * @param i 
	 * 1 = inbox, 2 = sentbox, 3 = trashbox
	 * any other value sets the flag to -1
	 */
	public void setFlag(int i){
		if( i < 1 || i > 3)
			boxFlag = -1;
		else
			boxFlag = i;
	}
	public String getMessage(){
		return message;
	}
	
	public String getSubject(){
		return subject;
	}
	
	public String getRecipient(){
		return to;
	}
	
	public String getSender(){
		return from;
	}
	
	public int getFlag(){
		return boxFlag;
	}
	
	public void setTime(){
		time = new Timestamp(System.currentTimeMillis());
	}
	
	public Timestamp getTime(){
		return time;
	}
}
