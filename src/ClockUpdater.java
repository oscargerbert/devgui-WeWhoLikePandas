package data;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class ClockUpdater  extends Thread{
	private JLabel clockLabel;
	
	public ClockUpdater(JLabel clockLabel){
		this.clockLabel = clockLabel;
	}
	public void run(){
		while(true){
			//invoke setTime insde the event dispatcher thread
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					setTime();
				}
			});
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}	
		}
	}
	private void setTime(){
		clockLabel.setText(new Date(System.currentTimeMillis()).toString());
	}

}