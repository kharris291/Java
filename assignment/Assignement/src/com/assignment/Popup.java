/************************************************************/
/****				Name - Kevin Harris			    	*****/
/****				SID	 - C09515259			 		*****/
/****	Summary - makes the popup menu for the 			*****/
/****		  	  some implementaion					*****/
/****		   											*****/
/************************************************************/
package com.assignment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Popup extends LunchBox {
	JPopupMenu Pmenu;
	JMenuItem menuItem, menuItem2, menuItem3;

	public static void main(String[] args) {
		Popup p = new Popup();
	}

	public Popup() {

		Pmenu = new JPopupMenu();
		menuItem = new JMenuItem("Help");
		Pmenu.add(menuItem);
		menuItem2 = new JMenuItem("Total calories");
		Pmenu.add(menuItem2);
		menuItem3 = new JMenuItem("exit");
		Pmenu.add(menuItem3);

		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == menuItem) {
					Count.setText("Click the check button to keep items");

				}
			}
		});

		menuItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == menuItem2) {
					countCals oo = new countCals();
					String val = oo.countCals(count, drinkcheck, breadcheck,
							fillingcheck, fruitcheck, snackcheck, olddrinkpos,
							oldbreadpos, oldfillingpos, oldfruitpos,
							oldsnackpos);
					String tot = String.valueOf(oo);
					JOptionPane.showMessageDialog(null, "total calories are "
							+ val);

				}
			}
		});

		menuItem3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == menuItem3) {
					System.exit(1);

				}
			}
		});
		Main.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent Me) {
				if (Me.isPopupTrigger()) {
					Pmenu.show(Me.getComponent(), Me.getX(), Me.getY());
				}
			}
		});
	}

}