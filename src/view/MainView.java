package view;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;

import data.Controller;



/**
 * * @author Oscar
 * 
 */
public class MainView {
	String path = System.getProperty("user.home");
	File f = new File(path+System.getProperty("file.separator")+"properties");
	
	private ActionListener c;
	JFrame mainWindow;
	private int height = 800;
	private int width = 1200;
	private int x = 100;
	private int y = 100;
	public MainView(ActionListener e) {
		c = e;
		loadBounds();			
		// create all the panels to be used in our program
		mainWindow = new JFrame();
		mainWindow.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                // This is called when the user releases the mouse button.
                setBounds();
            }
        });
		mainWindow.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				saveBounds();
				System.exit(0);
			}
		});
			
		JPanel mainPanel = new JPanel();
		JPanel layout = new JPanel();
		JPanel sideWindow = new SideView(c);
		JPanel leftSide = new JPanel();
		leftSide.setLayout(new BoxLayout(leftSide,BoxLayout.Y_AXIS));
		leftSide.add(new CalendarView(e));
		OngoingEventView.MakeEventPanel(leftSide);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		mainPanel.add(leftSide);
		mainPanel.add(sideWindow);
		

		// Wrap main panel in scrollable panel so hidden content can be accessed
		JScrollPane scroller = new JScrollPane(layout);

		layout.setLayout(new BorderLayout());
		layout.add(mainPanel, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		layout.add(panel, BorderLayout.NORTH);
		JLabel clock = Controller.CurrentDate();		
		panel.add(clock);
		
		mainWindow.setJMenuBar(new MenuBar(c));

		// Choose what panel to use and show it
		mainWindow.setContentPane(scroller);
		mainWindow.pack();
		mainWindow.setVisible(true);
		mainWindow.setBounds(x, y, width, height);
	}
	public void setBounds() {
		height = mainWindow.getHeight();
		width = mainWindow.getWidth();
		x = mainWindow.getX();
		y = mainWindow.getY();
	}
	public void loadBounds() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			height = ois.readInt();
			width = ois.readInt();
			x = ois.readInt();
			y = ois.readInt();
			fis.close();
			ois.close();
		} catch (IOException e) {
		}
	}
	public void saveBounds() {
		//Controller.saveData();
		FileOutputStream fos = null;

		try {			
			fos = new FileOutputStream(f);		
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			try {
				oos.writeInt(height);
				oos.writeInt(width);
				oos.writeInt(x);
				oos.writeInt(y);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.print("Fail at writing!;");
			}
			oos.flush();
			fos.close();
			oos.close();
		} catch (IOException e) {
			System.out.print("File not found!");
		}		
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}