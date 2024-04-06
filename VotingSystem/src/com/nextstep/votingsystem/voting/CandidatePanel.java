package com.nextstep.votingsystem.voting;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;

public class CandidatePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public CandidatePanel() {
		setBackground(new Color(0, 128, 192));
		setBounds(0, 0, 881, 473);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Candidate Lists");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblNewLabel.setBounds(25, 10, 536, 41);
		add(lblNewLabel);
		
		JPanel persidentPanel = new JPanel();
		persidentPanel.setForeground(new Color(0, 128, 255));
		persidentPanel.setBackground(new Color(128, 128, 255));
		persidentPanel.setBounds(25, 82, 560, 168);
		add(persidentPanel);
		persidentPanel.setLayout(null);
		
		JPanel candidate1Panel = new JPanel();
		candidate1Panel.setBackground(new Color(128, 0, 255));
		candidate1Panel.setBounds(10, 63, 258, 95);
		persidentPanel.add(candidate1Panel);
		candidate1Panel.setLayout(null);
		
		JLabel person1IconLabel = new JLabel("");
		person1IconLabel.setBounds(10, 10, 85, 64);
		candidate1Panel.add(person1IconLabel);
		ImageIcon icon1= new ImageIcon("C:\\Users\\navee\\Downloads\\person.png");
		Image image1=icon1.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		person1IconLabel.setIcon( new ImageIcon(image1));
		
		JLabel person1Label = new JLabel("Bishal Raut");
		person1Label.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		person1Label.setBounds(105, 10, 130, 64);
		candidate1Panel.add(person1Label);
		
		JPanel candidate2Panel = new JPanel();
		candidate2Panel.setBackground(new Color(128, 0, 255));
		candidate2Panel.setBounds(278, 63, 258, 95);
		persidentPanel.add(candidate2Panel);
		candidate2Panel.setLayout(null);
		
		JLabel person2IconLabel = new JLabel("");
		person2IconLabel.setBounds(10, 10, 85, 64);
		candidate2Panel.add(person2IconLabel);
		ImageIcon icon2= new ImageIcon("C:\\Users\\navee\\Downloads\\woman.png");
		Image image2=icon2.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		person2IconLabel.setIcon( new ImageIcon(image2));
		
		JLabel person2Label = new JLabel("FulMaya Tamang");
		person2Label.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		person2Label.setBounds(87, 10, 161, 64);
		candidate2Panel.add(person2Label);
		
		JLabel lblNewLabel_1 = new JLabel("President");
		lblNewLabel_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(105, 10, 277, 31);
		persidentPanel.add(lblNewLabel_1);
		
		JPanel vicePresidentPanel = new JPanel();
		vicePresidentPanel.setBackground(new Color(128, 128, 255));
		vicePresidentPanel.setBounds(25, 280, 560, 161);
		add(vicePresidentPanel);
		vicePresidentPanel.setLayout(null);
		
		JPanel candidate4Panel = new JPanel();
		candidate4Panel.setBackground(new Color(128, 0, 255));
		candidate4Panel.setBounds(292, 56, 258, 95);
		vicePresidentPanel.add(candidate4Panel);
		candidate4Panel.setLayout(null);
		
		JLabel person4IconLabel = new JLabel("");
		person4IconLabel.setBounds(10, 10, 85, 64);
		candidate4Panel.add(person4IconLabel);
		ImageIcon icon4= new ImageIcon("C:\\Users\\navee\\Downloads\\person.png");
		Image image4=icon4.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		person4IconLabel.setIcon( new ImageIcon(image4));
		
		JLabel person4Label = new JLabel("Ram Yadav");
		person4Label.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		person4Label.setBounds(118, 10, 130, 64);
		candidate4Panel.add(person4Label);
		
		JPanel candidate3Panel = new JPanel();
		candidate3Panel.setBackground(new Color(128, 0, 255));
		candidate3Panel.setBounds(10, 56, 258, 95);
		vicePresidentPanel.add(candidate3Panel);
		candidate3Panel.setLayout(null);
		
		JLabel person3IconLabel = new JLabel("");
		person3IconLabel.setBounds(10, 10, 85, 64);
		candidate3Panel.add(person3IconLabel);
		ImageIcon icon3= new ImageIcon("C:\\Users\\navee\\Downloads\\woman.png");
		Image image3=icon3.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		person3IconLabel.setIcon( new ImageIcon(image3));
		
		JLabel person3Label = new JLabel("Jyoti Khadka");
		person3Label.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		person3Label.setBounds(118, 21, 130, 64);
		candidate3Panel.add(person3Label);
		
		JLabel lblNewLabel_1_1 = new JLabel("Vice-President");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(109, 10, 277, 31);
		vicePresidentPanel.add(lblNewLabel_1_1);

	}

}
