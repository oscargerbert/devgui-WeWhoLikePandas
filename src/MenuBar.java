import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class MenuBar extends JMenuBar{
	public MenuBar() {
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
