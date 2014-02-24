package Main;

import java.util.ResourceBundle;

import javax.swing.SwingUtilities;

import view.MainView;
import data.Controller;

public class Main {
	//public static ResourceBundle rb;
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				@SuppressWarnings("unused")
				Controller c = new Controller();
				MainView m = new MainView(c);
				//rb = ResourceBundle.getBundle("resource");
			}
		});
	}
}
