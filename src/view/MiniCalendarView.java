package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Bastawi
 *
 */
public class MiniCalendarView extends JPanel {
	private static final long serialVersionUID = 8729309294825980111L;
	private ActionListener c;

	public MiniCalendarView(ActionListener e) {
		//this.setPreferredSize(new Dimension(400, 50));
		c = e;
		this.setBackground(Color.GREEN);
		
		//this.add(new MainCalendarView(), BorderLayout.CENTER);
	}
}