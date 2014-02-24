package mains;

import javax.swing.SwingUtilities;

import view.MainView;
import data.Controller;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			@SuppressWarnings("unused")
			public void run() {				
				Controller c = new Controller();
				MainView m = new MainView(c);
			}
		});
	}
}
