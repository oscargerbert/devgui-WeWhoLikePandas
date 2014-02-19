package view;
import java.awt.BorderLayout;

import java.awt.Dimension;
//import java.util.Calendar;
//import java.util.GregorianCalendar;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;
import data.Controller;


/**
 * * @author Oscar
 * 
 */
public class MainView {
	private ActionListener c;
	
	public MainView(ActionListener e) {
		c = e;
		// create all the panels to be used in our program
		JFrame mainWindow = new JFrame();
		JPanel mainPanel = new JPanel();
		JPanel layout = new JPanel();
		JPanel sideWindow = new SideView(c);
		

		// set max size of sideWindow
		//sideWindow.setMaximumSize(new Dimension(400, 1200));
		mainPanel.add(sideWindow);
		mainPanel.add(new MiniCalendarView(c));
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

		// Wrap main panel in scrollable panel so hidden content can be accessed
		JScrollPane scroller = new JScrollPane(layout);

		layout.setLayout(new BorderLayout());
		layout.add(mainPanel, BorderLayout.CENTER);
		//JLabel text = new JLabel("plats för datum,tid och knappar osv");
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		layout.add(panel, BorderLayout.NORTH);
		JLabel clock = Controller.CurrentDate();		
		panel.add(clock);
		
		mainWindow.setJMenuBar(new MenuBar(c));

		// Choose what panel to use and do show it
		mainWindow.setContentPane(scroller);
		mainWindow.pack();
		mainWindow.setVisible(true);
		mainWindow.setBounds(100, 100, 1200, 800);
	}
	
	
}