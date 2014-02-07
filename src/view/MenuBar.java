package view;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2095136277753179215L;

	public MenuBar() {
		// Create a menues and add stuff to them.
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu extra = new JMenu("Extra");
		JMenuItem open = new JMenuItem("Open");
		JMenuItem close = new JMenuItem("Close");
		JMenuItem subMenuItem = new JMenuItem("Sub-menu-item");
		this.add(file);
		this.add(edit);
		file.add(open);
		file.add(extra);
		file.add(close);
		extra.add(subMenuItem);
	}
}
