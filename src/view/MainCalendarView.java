package view;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.util.Calendar;

public class MainCalendarView extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1195228703688502250L;

	public MainCalendarView() {
		// Not much to see here
		setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setLayout(new BorderLayout());
		this.setBackground(Color.blue);
		this.add(new JLabel("" + Calendar.getInstance().getTimeInMillis()),
				BorderLayout.NORTH);
	}

}
