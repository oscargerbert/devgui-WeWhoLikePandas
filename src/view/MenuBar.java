package view;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import data.Controller;
import Main.Main;
/**
 * @author Oscar
 *
 */
public class MenuBar extends JMenuBar {
	
	private static final long serialVersionUID = -2095136277753179215L;
	private ActionListener c;

	public MenuBar(ActionListener e) {
		c =e;
		// Create a menues and add stuff to them.
		ResourceBundle rb = 
		         ResourceBundle.getBundle("resource");
		//System.out.println(rb.getString("ETask"));
		
		JMenu file = new JMenu(rb.getString("File"));
		JMenu edit = new JMenu(rb.getString("Edit"));
		JMenu extra = new JMenu(rb.getString("Extra"));
		JMenuItem open = new JMenuItem(rb.getString("Open"));
		JMenuItem close = new JMenuItem(rb.getString("Close"));
		JMenuItem editTask = new JMenuItem(rb.getString("ETask"));
		JMenuItem addevent = new JMenuItem(rb.getString("Add")); 
		JMenuItem subMenuItem = new JMenuItem(rb.getString("Sub"));
		this.add(file);
		this.add(edit);
		file.add(open);
		file.add(extra);
		file.add(close);
		edit.add(addevent);
		edit.add(editTask);
		extra.add(subMenuItem);
		
		ImageIcon ficon = createImageIcon("images/JarAdd16.gif");
		ViewActions actfile= new ViewActions(rb.getString("File"),ficon,"File",7);
		file.setAction(actfile);
		ImageIcon edicon = createImageIcon("images/Edit24.gif");
		ViewActions acted= new ViewActions(rb.getString("Edit"),edicon,"Edit",8);
		edit.setAction(acted);
		close.setToolTipText("Exit Application");
		ImageIcon cicon = createImageIcon("images/Edit24.gif");
		ViewActions actclose = new ViewActions(rb.getString("Close"),cicon,"close",2);
		close.setAction(actclose);
		ImageIcon oicon = createImageIcon("images/Open24.gif");
		ViewActions actopen = new ViewActions(rb.getString("Open"),oicon,"Open",4);
		open.setAction(actopen);
		ImageIcon exicon = createImageIcon("images/Find24.gif");
		ViewActions actex = new ViewActions(rb.getString("Extra"),exicon,"Extra",5);
		extra.setAction(actex);
		ImageIcon ex2icon = createImageIcon("images/FindAgain16.gif");
		ViewActions actex2 = new ViewActions(rb.getString("Sub"),ex2icon,"ExtraAgain",6);
		subMenuItem.setAction(actex2);
		ImageIcon eicon = createImageIcon("images/Edit24.gif");
		ViewActions actedit = new ViewActions(rb.getString("ETask"),eicon,"Edit",3);
		editTask.setAction(actedit);
		
		//close.addActionListener(c);
		ImageIcon icon = createImageIcon("images/Add24.gif");
		//String txt = "Add event"
		ViewActions act = new ViewActions(rb.getString("Add"),icon,"Add event", 1);
		addevent.setAction(act);
		/*addevent.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				addEvent();
			}	
		});
	}*/
	}
	
	/*public static void addEvent() {
		@SuppressWarnings("unused")
		AddEventView ae = new AddEventView();
	}*/
	protected ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
		return new ImageIcon(imgURL);
		} else {
		System.err.println("Couldn't find file: " + path);
		return null;
		}
		}

};