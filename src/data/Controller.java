package data;
import javax.swing.*;
import java.awt.event.*;

import view.*;

import view.AddEventView;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Controller implements ActionListener {

	public Controller(){
		
	}
	public void actionPerformed(ActionEvent e) {
	System.out.println("im working");
	//Object w = e.getSource();
	//if(w == close){
	        //System.exit(0);
	}
	
    
public static JLabel CurrentDate(){
		Calendar cal = new GregorianCalendar();
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int second = cal.get(Calendar.SECOND);
		int minutes = cal.get(Calendar.MINUTE);
		int hour = cal.get(Calendar.HOUR);
		JLabel txt = new JLabel(("Date: "+ year +"/" + (month+1)+"/"+ day +"    Time:" + hour +":"+ minutes+":"+ second));
		updateClock(txt);
		return txt;
		/*JLabel clockLabel = new JLabel(
				new Date(System.currentTimeMillis()).toString());
				updateClock(clockLabel);
			*/	
		
	/*	Thread clock = new Thread(){
			public void run(){
				for(;;){
					Calendar cal = new GregorianCalendar();
					int month = cal.get(Calendar.MONTH);
					int year = cal.get(Calendar.YEAR);
					int day = cal.get(Calendar.DAY_OF_MONTH);
					int second = cal.get(Calendar.SECOND);
					int minutes = cal.get(Calendar.MINUTE);
					int hour = cal.get(Calendar.HOUR);
					JLabel txt = new JLabel(("Date: "+year +"/" + (month+1)+"/"+ day +"    Time:" + hour +":"+ minutes+":"+ second));
					try {
						sleep(1000);
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		clock.start();
		*/
		
	}
	
	
	

	private static void updateClock(JLabel l){
		//Start updater thread
		new ClockUpdater(l).start();
	}
	
	 
}
	
/*
	public class Action implements ActionListener{
		public void actionPerformed (ActionEvent e){
			updateClock(clockLabel);
			
		}
	}*/

