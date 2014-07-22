/*******************************************************/
/****				Name - Kevin Harris			    ****/
/****				SID	 - C09515259			    ****/
/****	Summary - holds all the variables, JPanels, ****/
/****			  JLables, JCheckBoxes that are		****/
/****			  used	throughout the project		****/
/****			  also takes care of the setting of	****/
/****			  the JLables to the current positi	****/
/*******************************************************/
package com.assignment;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AllInformation extends JFrame {

	// random generating number
	Random ran = new Random();

	//used to make sure all five check boxes aren't in use
	int allused;
	//main panel
	JPanel Main;
	
	//buttons for setting and resetting info
	JButton reset;
	JButton choose;

	JLabel Count;
	// lables for what the option is
	JLabel Food1 = new JLabel("Drink");
	JLabel Food2 = new JLabel("Bread");
	JLabel Food3 = new JLabel("Filling");
	JLabel Food4 = new JLabel("Fruit");
	JLabel Food5 = new JLabel("Snack");

	// for the lunch options
	JLabel Option1 = new JLabel();
	JLabel Option2 = new JLabel();
	JLabel Option3 = new JLabel();
	JLabel Option4 = new JLabel();
	JLabel Option5 = new JLabel();

	// for images
	JLabel IconOption1 = new JLabel();
	JLabel IconOption2 = new JLabel();
	JLabel IconOption3 = new JLabel();
	JLabel IconOption4 = new JLabel();
	JLabel IconOption5 = new JLabel();

	// for calorie information
	static JLabel CalCount1 = new JLabel();
	static JLabel CalCount2 = new JLabel();
	static JLabel CalCount3 = new JLabel();
	static JLabel CalCount4 = new JLabel();
	static JLabel CalCount5 = new JLabel();

	// check box information
	JCheckBox DrinkCheck;
	JCheckBox BreadCheck;
	JCheckBox FillingCheck;
	JCheckBox FruitCheck;
	JCheckBox SnackCheck;

	String drink[] = { "7up", "coke", "pepsi", "water", "fanta", "snapple" };
	String drinkcals[] = { "102", "97", "210", "0", "75", "85" };
	String drinkicon[] = { "res/7up.jpg", "res/coke.jpg", "res/pepsi.jpg",
			"res/water.jpg", "res/fanta.jpg", "res/snapple.jpg" };

	String bread[] = { "White", "Brown", "Roll", "Brown Roll", "Half/Half",
			"pitta" };
	String breadcals[] = { "125", "134", "216", "220", "152", "124" };
	String breadicon[] = { "res/white.jpg", "res/brown.jpg", "res/roll.jpg",
			"res/brownroll.jpg", "res/halfhalf.jpg", "res/pitta.jpg" };

	String filling[] = { "Ham", "Cheese", "Egg", "Chicken", "Jam", "Cucumber" };
	String fillingcals[] = { "60", "450", "650", "100", "500", "60" };
	String fillingicon[] = { "res/ham.jpg", "res/cheese.jpg", "res/egg.jpg",
			"res/chicken.jpg", "res/jam.jpg", "res/cucumber.jpg" };

	String fruit[] = { "Orange", "Apple", "banana", "Pear", "kiwi", "Mango" };
	String fruitcals[] = { "300", "150", "250", "50", "150", "50" };
	String fruiticon[] = { "res/orange.jpg", "res/apple.jpg", "res/banana.jpg",
			"res/pear.jpg", "res/kiwi.jpg", "res/mango.jpg" };

	String snack[] = { "Snack", "Kitkat", "Tayto", "Chomp", "Crunchy",
			"Lolipop" };
	String snackcals[] = { "400", "600", "540", "600", "1000", "600" };
	String snackicon[] = { "res/snack.jpg", "res/kitkat.jpg", "res/tayto.jpg",
			"res/chomp.jpg", "res/crunchy.jpg", "res/lolipop.jpg" };

	int count, drinkcount, breadcount, fillingcount, fruitcount, snackcount;
	int drinkcheck = 0, breadcheck = 0, fillingcheck = 0, fruitcheck = 0,
			snackcheck = 0;

	int olddrinkpos, oldbreadpos, oldfillingpos, oldfruitpos, oldsnackpos;
	ImageIcon drinks, breads, fillings, fruits, snacks;

	JLabel Calories;

	// for use int the countCal class
	int drint, brint, fiint, frint, snint;
	
	int total = 0;

	String content;

	int countdrint = 0, countbrint = 0, countfiint = 0, countfrint = 0,
			countsnint = 0;
	int olddrint = 0, oldbrint = 0, oldfiint = 0, oldfrint = 0, oldsnint = 0;

	protected void setvalues(int count) {

		countCals o = new countCals();

		String g = o.countCals(count, drinkcheck, breadcheck, fillingcheck,
				fruitcheck, snackcheck, olddrinkpos, oldbreadpos,
				oldfillingpos, oldfruitpos, oldsnackpos);
		
		drinks = new ImageIcon(drinkicon[count]);
		breads = new ImageIcon(breadicon[count]);
		fillings = new ImageIcon(fillingicon[count]);
		fruits = new ImageIcon(fruiticon[count]);
		snacks = new ImageIcon(snackicon[count]);
		
		Count.setText(g);
		
		if (drinkcheck == 0) {
			Option1.setText(drink[count]);
			IconOption1.setIcon(drinks);
			CalCount1.setText(drinkcals[count]);

		}
		if (breadcheck == 0) {
			Option2.setText(bread[count]);
			IconOption2.setIcon(breads);
			CalCount2.setText(breadcals[count]);
		}

		if (fillingcheck == 0) {
			Option3.setText(filling[count]);
			IconOption3.setIcon(fillings);
			CalCount3.setText(fillingcals[count]);

		}
		if (fruitcheck == 0) {
			Option4.setText(fruit[count]);
			IconOption4.setIcon(fruits);
			CalCount4.setText(fruitcals[count]);
		}
		if (snackcheck == 0) {
			Option5.setText(snack[count]);
			IconOption5.setIcon(snacks);
			CalCount5.setText(snackcals[count]);
		}
	}
}