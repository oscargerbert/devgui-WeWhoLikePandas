package view;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

/**
 * @author Bastawi
 *
 */
public class AddEventView extends JFrame {

	private static final long serialVersionUID = 9136822901942764461L;
	//private ActionListener c;
	public AddEventView() {
		//c = e;
		// Ready the borders for use
		Border loweredetched, loweredbevel;
		loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
		loweredbevel = BorderFactory.createLoweredBevelBorder();

		JPanel layout = new JPanel();
		GridLayout gl = new GridLayout(0, 2);
		// make some space
		gl.setHgap(20);
		gl.setVgap(10);
		layout.setLayout(gl);

		// create labels and textfields
		JLabel lblEvent = new JLabel("Event:");
		lblEvent.setBorder(loweredetched);
		layout.add(lblEvent);

		JTextArea txtEvent = new JTextArea();
		txtEvent.setBorder(loweredbevel);
		layout.add(txtEvent);

		JLabel lblTime = new JLabel("Date/Time:");
		lblTime.setBorder(loweredetched);
		layout.add(lblTime);

		JTextArea txtTime = new JTextArea();
		txtTime.setBorder(loweredbevel);
		layout.add(txtTime);

		JLabel lblPlace = new JLabel("Place:");
		lblPlace.setBorder(loweredetched);
		layout.add(lblPlace);

		JTextArea txtPlace = new JTextArea();
		txtPlace.setBorder(loweredbevel);
		layout.add(txtPlace);

		JButton add = new JButton("Add");
		layout.add(add);

		this.setContentPane(layout);
		this.pack();
		this.setVisible(true);

	}

	public void AddTextBoxes() {

	}
}