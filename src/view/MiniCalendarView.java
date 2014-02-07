package view;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiniCalendarView extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8729309294825980111L;

	public MiniCalendarView() {
		this.setPreferredSize(new Dimension(400, 50));
		this.setBackground(Color.GREEN);
		this.add(new JLabel("MiniCalendar"));
	}

}
