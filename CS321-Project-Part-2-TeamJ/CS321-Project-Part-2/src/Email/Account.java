package Email;

// Author: John Coan
public class Account {
	private String accountName;
	private Inbox in;
	private SentBox sent;
	private TrashBox trash;
	//Constructor
	public Account (String s){
		accountName = s;
		in = new Inbox();
		sent = new SentBox();
		trash = new TrashBox();
	}
	
	//method to select account
	public void selectAccount(){
		
	}
	
	public String getAccountName(){
		return accountName;
	}
}
