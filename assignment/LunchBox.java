package com.assignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class LunchBox extends JFrame implements ActionListener {

	JButton reset;

	LunchBox() {
		super("Lunch Menu");

		setSize(400, 250);
		setLocation(100, 100);

		setContentPane(createContent());
		setVisible(true);
	}

	private JPanel createContent() {
		// TODO Auto-generated method stub
		JPanel Main = new JPanel(new BorderLayout());

		Main.setBackground(Color.WHITE);

		// for the titles
		JPanel Type = new JPanel(new GridLayout(1, 4));
		Type.setBackground(Color.WHITE);
		JLabel Food = new JLabel("Type");
		JLabel Options = new JLabel("Options");
		JLabel Calorinfo = new JLabel("Calories");
		JLabel Keepcheck = new JLabel("Keep");

		Type.add(Food);
		Type.add(Options);
		Type.add(Calorinfo);
		Type.add(Keepcheck);
		// panel for the center information
		JPanel pane = new JPanel(new GridLayout(1, 4));
		pane.setBackground(Color.white);

		// for the titles
		JPanel Text = new JPanel(new GridLayout(5, 1));
		Text.setBackground(Color.white);
		JLabel Food1 = new JLabel("Drink");
		JLabel Food2 = new JLabel("Bread");
		JLabel Food3 = new JLabel("Filling");
		JLabel Food4 = new JLabel("Fruit");
		JLabel Food5 = new JLabel("Snack");

		Text.add(Food1);
		Text.add(Food2);
		Text.add(Food3);
		Text.add(Food4);
		Text.add(Food5);
		pane.add(Text, BorderLayout.NORTH);
		// for the lunch options
		JPanel LunchInfo = new JPanel(new GridLayout(5, 1));

		LunchInfo.setBackground(Color.white);
		JLabel Option1 = new JLabel();
		JLabel Option2 = new JLabel();
		JLabel Option3 = new JLabel();
		JLabel Option4 = new JLabel();
		JLabel Option5 = new JLabel();

		LunchInfo.add(Option1);
		LunchInfo.add(Option2);
		LunchInfo.add(Option3);
		LunchInfo.add(Option4);
		LunchInfo.add(Option5);

		pane.add(LunchInfo, BorderLayout.CENTER);
		// for calorie information
		JPanel CalInfo = new JPanel(new GridLayout(5, 1));
		CalInfo.setBackground(Color.white);
		JLabel CalCount1 = new JLabel();
		JLabel CalCount2 = new JLabel();
		JLabel CalCount3 = new JLabel();
		JLabel CalCount4 = new JLabel();
		JLabel CalCount5 = new JLabel();

		CalInfo.add(CalCount1);
		CalInfo.add(CalCount2);
		CalInfo.add(CalCount3);
		CalInfo.add(CalCount4);
		CalInfo.add(CalCount5);

		pane.add(CalInfo);

		JPanel Kept = new JPanel(new GridLayout(5, 1));
		Kept.setBackground(Color.white);
		JCheckBox DrinkCheck = new JCheckBox();
		DrinkCheck.setBackground(Color.white);
		JCheckBox BreadCheck = new JCheckBox();
		BreadCheck.setBackground(Color.white);
		JCheckBox FillingCheck = new JCheckBox();
		FillingCheck.setBackground(Color.white);
		JCheckBox FruitCheck = new JCheckBox();
		FruitCheck.setBackground(Color.white);
		JCheckBox SnackCheck = new JCheckBox();
		SnackCheck.setBackground(Color.white);

		Kept.add(DrinkCheck);
		Kept.add(BreadCheck);
		Kept.add(FillingCheck);
		Kept.add(FruitCheck);
		Kept.add(SnackCheck);

		pane.add(Kept);
		// for final information
		JPanel Information = new JPanel(new GridLayout(1, 3));
		Information.setBackground(Color.white);

		JLabel Calories = new JLabel("Calories");
		JLabel Count = new JLabel();
		reset = new JButton("Choose order");

		reset.addActionListener(this);

		Information.add(Calories);
		Information.add(Count);
		Information.add(reset);

		Main.add(Type, BorderLayout.NORTH);
		Main.add(pane, BorderLayout.CENTER);
		Main.add(Information, BorderLayout.SOUTH);
		return Main;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == reset) {
			String content;
			ReadFileIn fileRead = new ReadFileIn();
		}

	}

	

}
