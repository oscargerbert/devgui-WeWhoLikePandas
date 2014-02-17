package view;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

/**
 * @author fuxinchen
 *
 */
public class MainCalendarView extends JPanel {
	private static final long serialVersionUID = 3445392424930374006L;
	private JLabel[] lbls = new JLabel[7];
	private JToggleButton[] toggles = new JToggleButton[42];
	private int width = 25, height = 25;
	private int year;
	private int month;
	private int date;
	private String[] week = { "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" };

	public MainCalendarView()
	{
		year = Calendar.getInstance().get(Calendar.YEAR);
		month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		date = Calendar.getInstance().get(Calendar.DATE);
		initUI();
	}
	private void initUI()
	{
		this.setPreferredSize(new Dimension(width * 7,height * 7));
		this.setLayout(new GridLayout(7, 7));
		// Generate calendar label
		for (int i = 0; i < week.length; i++)
		{
			lbls[i] = new JLabel(week[i]);
			lbls[i].setHorizontalAlignment(SwingConstants.CENTER);
			lbls[i].setOpaque(true);
			lbls[i].setBackground(Color.WHITE);
			lbls[i].setPreferredSize(new Dimension(width, height));
			this.add(lbls[i]);
		}
		// Generate buttons
		ButtonGroup group = new ButtonGroup();
		for (int i = 0; i < 42; i++)
		{
			toggles[i] = new JToggleButton();
			toggles[i].setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
			toggles[i].setPreferredSize(new Dimension(width, height));
			toggles[i].addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					date = Integer.parseInt(((JToggleButton) e.getSource()).getText().toString());
					showDate();
				}
			});
			group.add(toggles[i]);
			this.add(toggles[i]);
		}
		updateComponent();		
	}

	private void updateComponent()
	{
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		// Determine the first day of a certain month
		int off = cal.get(Calendar.DAY_OF_WEEK) - 1;
		// Calculate days of certain months
		int end = 30;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			end = 31;
		if (month == 2)
		{
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
				end = 29;
			else
				end = 28;
		}
		for (int i = 0; i < 42; i++)
		{
			if (i >= off && i <= end + off - 1)
			{
				int day = i - off + 1;
				toggles[i].setText(day + "");
				toggles[i].setEnabled(true);
			} else
			{
				toggles[i].setText("");
				toggles[i].setEnabled(false);
			}
		}
		// Show the press down effect
		int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH) + off - 1;
		toggles[day].setSelected(true);
	}

	// Show the date when user click
	private void showDate()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(this.year + "-");
		builder.append(this.month + "-");
		builder.append(this.date + " ");
		Calendar cal = Calendar.getInstance();
		cal.set(this.year, this.month - 1, this.date);
		builder.append(week[cal.get(Calendar.DAY_OF_WEEK) - 1]);
		System.out.println(builder.toString());
	}
}