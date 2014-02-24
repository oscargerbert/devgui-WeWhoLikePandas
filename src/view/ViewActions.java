package view;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

public class ViewActions extends AbstractAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6032407153659492212L;
	public ViewActions(String text, ImageIcon icon, String desc, Integer mnemonic){
		/*ImageIcon icon = createImageIcon("images/Add24.gif");
	String text = "Add event";*/
		super(text,icon);
		putValue(SHORT_DESCRIPTION, desc);
		putValue(MNEMONIC_KEY, mnemonic);

	}
	public ViewActions(String name, Integer mnemonic){
		super(name);
		putValue(MNEMONIC_KEY, mnemonic);
	}
	/*public ViewActions(String text,ImageIcon icon){
	super(text,icon);
}*/


	public void actionPerformed(ActionEvent arg0) {
		Object object = getValue(MNEMONIC_KEY);
		Object i = 1;
		Object y = 2;
		Object z = 3;
		Object h = 4;
		Object u = 5;
		Object j = 6;
		Object s = 7;
		Object a = 8;
		if (object == i){
			addEvent();
		}
		if(object == y){
			System.exit(0);
		}
		if(object == z){ System.out.println("Cant make me!");}
		if(object == h){System.out.println("Cant haz!");}
		if(object == u){System.out.println("Mehe");}
		if(object == j){System.out.println("Le noooo!");}
		if(object == s){System.out.println("nana Batman!");}
		if(object == a){System.out.println("nana Batman!");}
	}
	public static void addEvent() {
		@SuppressWarnings("unused")
		AddEventView ae = new AddEventView();
	}
}
