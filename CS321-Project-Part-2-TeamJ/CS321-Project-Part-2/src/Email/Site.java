package Email;

import java.util.Iterator;
import java.util.Objects;
import java.util.Vector;

// Author: Jennifer Berry
public class Site {
	private String siteName;
	private Vector <Account> accounts;
	//Constructor
	public Site(String s){
		siteName = s;
		accounts = new Vector <Account>(50);
	}
	
	public void addAccount(Account a){
		accounts.add(a);
	}
	
	public void selectAccount(){
		
	}
	
	public void deleteAccount(Account a){
		Iterator<Account> itr = accounts.iterator();
		int i = 0;
		do{
			if(Objects.equals(a, itr.next().getAccountName())){
				accounts.remove(i);
				break;
			}
			//compare strings and remove account from vector
			//itr.next();
		i++;
		}while(itr.hasNext());
	}
	
	//is the account in this site
	public boolean isAccountHere(String s){
		Iterator<Account> itr = accounts.iterator();
		do{
			if(Objects.equals(s, itr.next().getAccountName())){
				return true;
			}
			//compare strings and remove account from vector
			//itr.next();
	   
		}while(itr.hasNext());
		return false;
	}
}
