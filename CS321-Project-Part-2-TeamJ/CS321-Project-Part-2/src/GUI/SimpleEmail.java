package GUI;
import Email.Users;
import javax.swing.ListModel;

import Email.Users;

/**
 * This class serves as the controller for the main GUI
 * 
 * ------------------------------------------------
 * Also currently holds the main, making this the
 * entry point of the program.
 * ------------------------------------------------
 * 
 * @author John S. Clay
 *
 */
public class SimpleEmail 
{
	private int m_currentIndex; //holds the index of the currently selected item in the list box
	private ListModel m_listModel; //holds the things to display in the list box.
	
	public static void main(String[] args) 
	{
		SimpleEmail email = new SimpleEmail();
	}
	
	/**
	 * Constructor for the GUI controller
	 */
	public SimpleEmail()
	{
		//member field initialization 
		m_currentIndex = -1; //we don't have anything in list box currently selected
		
		//Set up GUI
		GUI gui = new GUI(this);   //
		Users usersTester = new Users();
		//usersTester.printAll();
	}
	
	/**
	 * Sets the index of the currently selected item of the list box 
	 * 
	 * (This should only be called by the GUI.)
	 * 
	 * @param index zero-based position of the selected item in list box
	 */
	public void setCurrentIndex(int index)
	{
		m_currentIndex = index;
	}
	
	/**
	 * Gets the index of the currently selected item of the list box
	 * 
	 * ----------------------------------
	 * TODO: add a check to ensure current index is not still -1;
	 * ----------------------------------
	 */
	public int getCurrentIndex()
	{
		return m_currentIndex;
	}
	
	/**
	 * Sets the model for the list box. (The model is what actually
	 * holds what is to be displayed in the list box.)
	 * 
	 * (This method is only to be called from the GUI. To change what is in the 
	 * list box model, call the get function, and perform your updates on the 
	 * returned object.)
	 */
	public void setListBoxModel(ListModel model)
	{
		m_listModel = model;
	}
	
	/**
	 * Gets the model from the list box. The model is what actually
	 * holds what is to be displayed in the list box
	 */
	public ListModel getListBoxModel()
	{
		return m_listModel;
	}
	
	/**
	 * The "Compose" button was clicked on the GUI. Compose a new message.
	 */
	public void composeMessage()
	{
		
	}
	
	/**
	 * The "Reply" button was clicked on the GUI. Compose a reply e-mail.
	 */
	public void replyMessage()
	{
		
	}
	
	/**
	 * The "Send" button was clicked on the GUI. Send the composed message.
	 */
	public void sendMessage()
	{
		
	}
	
	/**
	 * The "Remove" button was clicked on the GUI. Remove the message from the
	 * list box model.
	 */
	public void removeMessage()
	{
		
	}
	
	/**
	 * The add account option was selected from the account drop down menu.
	 */
	public void addAccount()
	{
		
	}
	
	/**
	 * The delete account option was selected from the account drop down menu.
	 */
	public void deleteAccount()
	{
		
	}
	
	/**
	 * The add user option was selected from the user drop down menu.
	 */
	public void addUser()
	{
		
	}
	
	/**
	 * The delete user option was selected from the user drop down menu.
	 */
	public void deleteUser()
	{
		
	}
	
}
