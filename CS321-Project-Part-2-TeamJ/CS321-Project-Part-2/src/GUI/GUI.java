package GUI;
/**
 * This class functions as the GUI for the simple email program.
 *
 * @Author  John S. Clay
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class GUI{
	private SimpleEmail m_controller;
	
	public GUI(SimpleEmail controller){
			//Set up the controller for this GUI
			m_controller = controller;
			
			//frame
				JFrame frame = new JFrame();
				frame.setSize(500, 500);
		
			//Account combo box
				String[] accountComboItems = {"Account", "Add Account", "Delete Account" };
				JComboBox accountCombo = new JComboBox(accountComboItems);
				
			//User combo box
				String[] userComboItems = {"User", "Add User", "Delete User" };
				JComboBox userCombo = new JComboBox(userComboItems);
				
			//menu bar
				JMenuBar menuBar = new JMenuBar();
				menuBar.add(accountCombo);
				menuBar.add(userCombo);
				menuBar.setVisible(true);
				
				//panels
					//panelTopEast
					JPanel panelTopEast = new JPanel();
					//panelBottomEast
					JPanel panelBottomEast = new JPanel();
					//panelEast
					JPanel panelEast = new JPanel();
					//panelWest
					JPanel panelWest = new JPanel();
				
				//East panel
					//Top of the east panel: holds the buttons	
					//button: "Compose"
					JButton btnCompose = new JButton();
					btnCompose.setText("Compose");
					//button: "Reply"
					JButton btnReply = new JButton();
					btnReply.setText("Reply");
					//button: "Send"
					JButton btnSend = new JButton();
					btnSend.setText("Send");
					//button: "Remove"
					JButton btnRemove = new JButton();
					btnRemove.setText("Remove");
					//add buttons to top of east panel
					panelTopEast.add(btnCompose);
					panelTopEast.add(btnReply);
					panelTopEast.add(btnSend);
					panelTopEast.add(btnRemove);
					
					//Bottom of the east panel: holds the list box
					JList list = new JList();
					list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					list.setLayoutOrientation(JList.VERTICAL);
					list.setVisibleRowCount(10);
					JScrollPane scroll = new JScrollPane(list);
					scroll.setPreferredSize(new Dimension(310, 330));
					panelBottomEast.add(scroll);
					
					//add the top and bottom panels to the east panel
					panelEast.setLayout(new BoxLayout(panelEast, BoxLayout.Y_AXIS));
					panelEast.add(panelTopEast);
					panelEast.add(panelBottomEast);
				
					
				//West panel
					//tree
					//root
					DefaultMutableTreeNode simpleEmail = new DefaultMutableTreeNode("Simple Email");
					//children
					DefaultMutableTreeNode users = new DefaultMutableTreeNode("Users");
					DefaultMutableTreeNode defaultUser1 = new DefaultMutableTreeNode("Jen");
					DefaultMutableTreeNode defaultUser2 = new DefaultMutableTreeNode("John");
					DefaultMutableTreeNode localSite1 = new DefaultMutableTreeNode("Local Site");
					DefaultMutableTreeNode remoteSite1 = new DefaultMutableTreeNode("Remote Site");
					DefaultMutableTreeNode localSite2 = new DefaultMutableTreeNode("Local Site");
					DefaultMutableTreeNode remoteSite2 = new DefaultMutableTreeNode("Remote Site");
					DefaultMutableTreeNode account = new DefaultMutableTreeNode("Account");
					
					simpleEmail.add(users);
					users.add(defaultUser1);
					users.add(defaultUser2);
					defaultUser1.add(localSite1);
					defaultUser1.add(remoteSite1);
					defaultUser2.add(localSite2);
					defaultUser2.add(remoteSite2);
					
					
					JTree tree = new JTree(simpleEmail);
					
					//add to panel
					panelWest.add(tree);				
					
				
					
				//Add panels to frame
				frame.add(menuBar, BorderLayout.NORTH);
				frame.add(panelEast, BorderLayout.CENTER);
				frame.add(panelWest, BorderLayout.WEST);
				
				frame.setVisible(true);
				
			
				
			//pass list box model to controller
				m_controller.setListBoxModel(list.getModel());
				
			//Set up listeners 
				//list box listener
				ListSelectionModel model = list.getSelectionModel();
				model.addListSelectionListener(new ListSelectionListener() 
				{
					public void valueChanged(ListSelectionEvent e)
					{
						m_controller.setCurrentIndex(e.getFirstIndex());
					}
				});
				
				//compose button listener
				btnCompose.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						m_controller.composeMessage();
					}
				});
				
				//reply button listener
				btnReply.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						m_controller.replyMessage();
					}
				});
				
				//send button listener
				btnSend.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						m_controller.sendMessage();
					}
				});
				
				//remove button listener
				btnRemove.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						m_controller.removeMessage();
					}
				});
				
				//account combo box listener - this determines if to add or remove account
				accountCombo.addItemListener(new ItemListener()
				{
					public void itemStateChanged(ItemEvent e)
					{
						if (e.getItem().toString() == "Add Account")
							m_controller.addAccount();
						if (e.getItem().toString() == "Delete Account")
							m_controller.deleteAccount();
					}
				});
				
				//user combo box listener - this determines if to add or remove user
				userCombo.addItemListener(new ItemListener()
				{
					public void itemStateChanged(ItemEvent e)
					{
						if (e.getItem().toString() == "Add User")
							m_controller.addUser();
						if (e.getItem().toString() == "Delete User")
							m_controller.deleteUser();
					}
				});
	}

}

