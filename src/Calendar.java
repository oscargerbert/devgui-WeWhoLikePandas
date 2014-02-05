import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Calendar extends JPanel {

	
	public Calendar() {		
		setBorder(new EmptyBorder(10, 10, 10, 10));
		this.setLayout(new BorderLayout());
		this.add(new JButton("Huvudkalendern här!"), BorderLayout.CENTER);
	}

}
