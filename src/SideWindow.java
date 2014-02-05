import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class SideWindow extends JPanel{
	public SideWindow() {
		this.setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setLayout(new BorderLayout());
		//this.setSize(new Dimension(200, 1920));
		this.add(new JButton("sido-funktionerna här!"), BorderLayout.CENTER);
	}
}
