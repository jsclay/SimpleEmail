// Author: Jennifer Berry
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
	
	//method to select box
	public Mailbox selectMailbox(int flag){
		Mailbox box;
		switch(flag){
		case 1:
			box = in;
			System.out.println("Inbox selected");
		case 2:
			box = sent;
			System.out.println("sent selected");
			break;
		case 3:
			box = trash;
			System.out.println("trash selected");
			break;
		default:
			System.out.println("no box selected");
			return null;
		}
		return box;
	}
	
	public String getAccountName(){
		return accountName;
	}
	
	public void send(Email e){
		int flag = e.getFlag();
		switch(flag){
		case 1:
			in.send(e);
			System.out.println("sent to inbox");
			break;
		case 2:
			sent.send(e);
			System.out.println("sent to sent");
			break;
		case 3:
			trash.send(e);
			System.out.println("sent to trash");
			break;
		}
	}
	
	public void deleteEmail(Email e){
		int flag = e.getFlag();
		switch(flag){
		case 1:
			in.delete(e);
			e.setFlag(3);
			trash.send(e);
			break;
		case 2:
			sent.delete(e);
			e.setFlag(3);
			trash.send(e);
			break;
		case 3:
			trash.delete(e);
			break;
		}
		
	}

}
