package view;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * @author Oscar
 *
 */
public class MenuBar extends JMenuBar {
	
	private static final long serialVersionUID = -2095136277753179215L;

	public MenuBar() {
		// Create a menues and add stuff to them.
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenu extra = new JMenu("Extra");
		JMenuItem open = new JMenuItem("Open");
		JMenuItem close = new JMenuItem("Close");
		JMenuItem editTask = new JMenuItem("Edit Task");
		JMenuItem addevent = new JMenuItem("Add Event"); 
		JMenuItem subMenuItem = new JMenuItem("Sub-menu-item");
		this.add(file);
		this.add(edit);
		file.add(open);
		file.add(extra);
		file.add(close);
		edit.add(addevent);
		edit.add(editTask);
		extra.add(subMenuItem);
		
		close.setToolTipText("Exit Application");
		close.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent event) {
	            System.exit(0);
	        }
	    });
		
		addevent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addEvent();
			}
		});
	}
	public void addEvent() {
		@SuppressWarnings("unused")
		AddEventView ae = new AddEventView();
	}
	public void CurrentDate(){
		/*JLabel clockLabel = new JLabel(
				new Date(System.currentTimeMillis()).toString());
				updateClock(clockLabel);
			*/	
	}
}