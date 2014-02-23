package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//our sidepanel view
/**
 * @author Bastawi
 *
 */
public class SideView extends JPanel {
	
	private static final long serialVersionUID = 7087326982021201980L;
	private ActionListener c;

	public SideView(ActionListener e) {
		c = e;
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		// Add the minicalendar and upcomming events window
		this.add(new MainCalendarView(c));
		UpcommingEventView.MakeEventPanel(this);

		// Button for adding events
		/*JButton addEventButton = new JButton("Add Event");
		this.add(addEventButton);

		// keep watch when user presses Add Event button
		addEventButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addEvent();
			}
		});
*/
	}

	/**
	 * 
	 */
	/*public void addEvent() {
		@SuppressWarnings("unused")
		AddEventView ae = new AddEventView();
	}*/
}