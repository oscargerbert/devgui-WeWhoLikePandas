import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Main m = new Main();				
			}
		});
	
	
	}
	public Main() {
		JFrame mainWindow = new JFrame();
		mainWindow.setBounds(100, 100, 1200, 800);
		JPanel mainPanel = new JPanel();
		JPanel layout = new JPanel();
		JPanel test = new SideWindow();
		test.setSize(1200, 800);
		mainPanel.add(test);
		mainPanel.add(new Calendar());
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		layout.setLayout(new BorderLayout());
		layout.add(mainPanel, BorderLayout.CENTER);
		layout.add(new JTextArea("Hej"),BorderLayout.NORTH);
		mainWindow.setJMenuBar(new MenuBar());
		
		mainWindow.setContentPane(layout);
		mainWindow.pack();
		mainWindow.setVisible(true);
		
	}
}
