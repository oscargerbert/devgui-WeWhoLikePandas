package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//our sidepanel view
/**
 * @author Bastawi
 *
 */
public class SideView extends JPanel {
	
	private static final long serialVersionUID = 7087326982021201980L;

	public SideView(ActionListener e) {
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		// Add the minicalendar and upcomming events window

		
	}

	/**
	 * 
	 */
	/*public void addEvent() {
		@SuppressWarnings("unused")
		AddEventView ae = new AddEventView();
	}*/
}