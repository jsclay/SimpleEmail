package Email;

// Author: Jennifer Berry
public class User {
	private String userName;
	private Site localSite;
	private Site remoteSite;
	//Constructor
	public User(String s){
		userName = s;
		Site localSite = new Site("Local");
		Site remoteSite = new Site("Remote");
		Account jvc = new Account("Default");
		Account other = new Account("RandomAccount");
		localSite.addAccount(jvc);
		remoteSite.addAccount(other);
	}
	//Prints the user name
	public void showUserName(){
		System.out.println(userName);
	}
	
	//searches remote sites for an account
	public Boolean searchRemote(String s){
		if(remoteSite.isAccountHere(s) == true){
			return true;
		}
		
		return false;
	}
	
	//searches local site for an account
	public Boolean searchLocal(String s){
		if(localSite.isAccountHere(s) == true){
			return true;
		}
		
		return false;
	}
}
