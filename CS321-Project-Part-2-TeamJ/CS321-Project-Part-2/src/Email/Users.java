package Email;

// Author: Jennifer Berry
import java.util.*;

public class Users {
	private Vector <User> users;
	//stores default 3 users in constuctor
	public Users(){
		users = new Vector <User>(500);
		users.add(new User("John Coan"));
		users.add(new User("Jennifer Berry"));
		users.add(new User("John Clay"));
	}
	
	
	//prints all users
	public void printAll(){
		Iterator<User> itr = users.iterator();
		do{
			itr.next().showUserName();
	   
		}while(itr.hasNext());
	}
	
	public void addUser(User u){
		users.add(u);
	}
	
	public void selectAccount(){
		
	}
	
	public void deleteAccount(Account a){
		Iterator<User> itr = users.iterator();
		do{
			
			//compare strings and remove account from vector
			//itr.next();
	   
		}while(itr.hasNext());
	}
	
	//finds user with the account name s
	public User findUser(String s){
		Iterator<User> itr = users.iterator();
		do{
			if (itr.next().searchLocal(s) == true){
				return itr.next();
			}
			if (itr.next().searchRemote(s) == true){
				return itr.next();
			}
			//compare strings and remove account from vector
			//itr.next();
	   
		}while(itr.hasNext());
		System.out.println("Error faild to find user");
		return null;
	}
}
