/*
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * 
 * @author ninaknez
 */
public class OngoingEventView{
	@SuppressWarnings("unused")
	private ActionListener c;
	public OngoingEventView(ActionListener e){c = e;}

	public static void MakeEventPanel(JPanel upcomingeventPanel) {

		JPanel titlePanel = new JPanel();
		JPanel contentPanel = new JPanel();


		titlePanel.add(new JLabel(/*Main.Main.rb.getString("Ongoing Tasks")*/"Ongoing Tasks"));
		contentPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5, true));
		
		// Setting the size and place of the two Panels title & content
		titlePanel.setPreferredSize(new Dimension(400, 50));
		contentPanel.setBackground(Color.RED);
		contentPanel.add(titlePanel, BorderLayout.NORTH);
		upcomingeventPanel.add(contentPanel);

	}

}