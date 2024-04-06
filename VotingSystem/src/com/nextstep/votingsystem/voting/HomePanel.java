package com.nextstep.votingsystem.voting;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class HomePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomePanel() {
		setBackground(new Color(128, 0, 255));
		setBounds(0, 0, 881, 473);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\navee\\Downloads\\Online-Voting-Blog-Banner.png"));
		lblNewLabel.setBounds(12, 131, 601, 332);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome Online Voting  System");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1.setBounds(0, 10, 613, 41);
		add(lblNewLabel_1);
		setVisible(true);
	}
}
