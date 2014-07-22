/************************************************************/
/****					Name - Kevin Harris			    *****/
/****			SID	 - C09515259			 			*****/
/****Summary - makes the gui of the program	and extends	*****/
/****		   AllInformation so that it can make use	*****/
/****		   of the variables and such contained		*****/
/***		   within									*****/
/************************************************************/
package com.assignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

import sun.audio.*; //import the sun.audio package
import java.io.*;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

public class LunchBox extends AllInformation implements ActionListener,
		ItemListener {

	AllInformation all = new AllInformation();

	LunchBox() {
		super();

		setSize(450, 500);
		setLocation(100, 100);
		setContent();
		setContentPane(getContentPane());
		setVisible(true);
	}

	private void setContent() {
		// TODO Auto-generated method stub
		Main = new JPanel(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main.setBackground(Color.WHITE);

		// for the titles
		JPanel Type = new JPanel(new GridLayout(1, 4));
		
		Type.setBackground(Color.WHITE);
		JLabel Food = new JLabel("Type");
		JLabel Options = new JLabel("Options");
		JLabel pictures = new JLabel("");
		JLabel Calorinfo = new JLabel("Calories");
		JLabel Keepcheck = new JLabel("Keep");

		Type.add(Food);
		Type.add(Options);
		Type.add(pictures);
		Type.add(Calorinfo);
		Type.add(Keepcheck);
		
		// panel for the center information
		JPanel pane = new JPanel(new GridLayout(1, 5));
		pane.setBackground(Color.white);

		// for the food type titles
		JPanel Text = new JPanel(new GridLayout(5, 1));
		Text.setBackground(Color.white);

		Text.add(Food1);
		Text.add(Food2);
		Text.add(Food3);
		Text.add(Food4);
		Text.add(Food5);
		pane.add(Text);
		
		// for the lunch options
		JPanel LunchInfo = new JPanel(new GridLayout(5, 1));

		LunchInfo.setBackground(Color.white);

		LunchInfo.add(Option1);
		LunchInfo.add(Option2);
		LunchInfo.add(Option3);
		LunchInfo.add(Option4);
		LunchInfo.add(Option5);

		pane.add(LunchInfo);

		//for pictures
		JPanel IconList = new JPanel(new GridLayout(5, 1));
		
		IconList.setBackground(Color.WHITE);
		IconList.add(IconOption1);
		IconList.add(IconOption2);
		IconList.add(IconOption3);
		IconList.add(IconOption4);
		IconList.add(IconOption5);

		pane.add(IconList);

		// for calorie information
		JPanel CalInfo = new JPanel(new GridLayout(5, 1));
		CalInfo.setBackground(Color.white);

		CalInfo.add(CalCount1);
		CalInfo.add(CalCount2);
		CalInfo.add(CalCount3);
		CalInfo.add(CalCount4);
		CalInfo.add(CalCount5);

		pane.add(CalInfo);
		
		//checkbox panel
		JPanel Kept = new JPanel(new GridLayout(5, 1));
		Kept.setBackground(Color.white);

		DrinkCheck = new JCheckBox();
		DrinkCheck.setBackground(Color.white);

		BreadCheck = new JCheckBox();
		BreadCheck.setBackground(Color.white);

		FillingCheck = new JCheckBox();
		FillingCheck.setBackground(Color.white);

		FruitCheck = new JCheckBox();
		FruitCheck.setBackground(Color.white);

		SnackCheck = new JCheckBox();
		SnackCheck.setBackground(Color.white);

		
		DrinkCheck.addItemListener(this);
		BreadCheck.addItemListener(this);
		FillingCheck.addItemListener(this);
		FruitCheck.addItemListener(this);
		SnackCheck.addItemListener(this);

		
		Kept.add(DrinkCheck);
		Kept.add(BreadCheck);
		Kept.add(FillingCheck);
		Kept.add(FruitCheck);
		Kept.add(SnackCheck);
		
		pane.add(Kept);
		
		// for final information such as calories and the buttons
		JPanel Information = new JPanel(new GridLayout(2, 2));
		Information.setBackground(Color.white);

		Calories = new JLabel("Total Calories");
		Count = new JLabel();
		Information.add(Calories);
		Information.add(Count);

		choose = new JButton("Choose order");
		reset = new JButton("select a different set");

		reset.setEnabled(false);
		choose.addActionListener(this);
		reset.addActionListener(this);

		Information.add(choose);
		Information.add(reset);

		Main.add(Type, BorderLayout.NORTH);
		Main.add(pane, BorderLayout.CENTER);
		Main.add(Information, BorderLayout.SOUTH);

	}

	public JPanel getContentPane() {

		return Main;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == DrinkCheck) {

			if (DrinkCheck.isSelected()) {
				drinkcheck = 1;
				olddrinkpos = count;
			} else {
				drinkcheck = 0;
			}

		} else if (e.getSource() == BreadCheck) {
			if (BreadCheck.isSelected()) {
				breadcheck = 1;
				oldbreadpos = count;
			}

			else {
				breadcheck = 0;
			}
		} else if (e.getSource() == FillingCheck) {

			if (FillingCheck.isSelected()) {
				fillingcheck = 1;
				oldfillingpos = count;
			} else {
				fillingcheck = 0;
			}

		} else if (e.getSource() == FruitCheck) {

			if (FruitCheck.isSelected()) {
				fruitcheck = 1;
				oldfruitpos = count;
			} else {
				fruitcheck = 0;
			}
		} else if (e.getSource() == SnackCheck) {

			if (SnackCheck.isSelected()) {
				snackcheck = 1;
				oldsnackpos = count;
			} else {
				snackcheck = 0;
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		final Song songs = new Song();
		
		if (e.getSource() == choose) {
			Thread time = new Thread() {
				public void run() {
					try {

						songs.Song();
						sleep(1500);

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						// System.out.print(count);
						count = ran.nextInt(6);
						setvalues(count);

						choose.setEnabled(false);
						choose.setBackground(Color.white);
						reset.setEnabled(true);
					}
				}
			};
			time.start();

		}
		
		if (e.getSource() == reset) {
			if ((drinkcheck == 1) & (breadcheck == 1) & (fillingcheck == 1)
					& (fruitcheck == 1) & (snackcheck == 1)) {
				reset.setEnabled(false);
			} else {
				Thread ti = new Thread() {
					public void run() {
						try {

							reset.setEnabled(false);
							songs.Song();
							sleep(1500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} finally {
							count = ran.nextInt(6);
							setvalues(count);
							reset.setEnabled(true);
						}
					}
				};
				// Count.setText(g);
				ti.start();
			}
		}

	}

}