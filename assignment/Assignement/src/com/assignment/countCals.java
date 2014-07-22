/************************************************************/
/****				Name - Kevin Harris			    	*****/
/****				SID	 - C09515259			 		*****/
/****		Summary - calculates the total calorie 		*****/
/****		   		  count and returns a value			*****/
/****		   											*****/
/************************************************************/

package com.assignment;

import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class countCals extends AllInformation {

	public String countCals(int count, int drcheck, int brcheck, int ficheck,
			int frcheck, int sncheck, int olddrinkpos, int oldbreadpos, int oldfillingpos, int oldfruitpos, int oldsnackpos) {
		// TODO Auto-generated constructor stub
		
		if (drcheck == 1) {
			drint = Integer.parseInt(drinkcals[olddrinkpos]);
			olddrint = drint;
			total += olddrint;
		} else if (drcheck == 0) {

			drint = Integer.parseInt(drinkcals[count]);
			
			total += drint;
		}
		if (brcheck == 1) {
			brint = Integer.parseInt(breadcals[oldbreadpos]);
			oldbrint = brint;
			total += oldbrint;
		} else if (brcheck == 0) {
			brint = Integer.parseInt(breadcals[count]);
			
			total += brint;
		}

		if (ficheck == 1) {
			fiint = Integer.parseInt(fillingcals[oldfillingpos]);
			oldfiint = fiint;
			total += oldfiint;
		} else if (ficheck == 0) {
			fiint = Integer.parseInt(fillingcals[count]);
			
			total += fiint;
		}

		if (frcheck == 1) {
			frint = Integer.parseInt(fruitcals[oldfruitpos]);
			oldfrint = frint;
			total += oldfrint;
		} else if (frcheck == 0) {
			frint = Integer.parseInt(fruitcals[count]);
			
			total += frint;
		}

		if (sncheck == 1) {
			snint = Integer.parseInt(snackcals[oldsnackpos]);
			oldsnint = snint;
			total += oldsnint;
		} else if (sncheck == 0) {

			snint = Integer.parseInt(snackcals[count]);
			
			total += snint;
		}
		return content = String.format("%d", total);

	}
}
