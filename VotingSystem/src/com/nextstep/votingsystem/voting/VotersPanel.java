package com.nextstep.votingsystem.voting;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VotersPanel extends JPanel {
	private JTextField searchTextField;

	/**
	 * Create the panel.
	 */
	public VotersPanel() {
		setBackground(new Color(64, 128, 128));
		setBounds(0, 0, 881, 473);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Voters List");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel.setBounds(85, 10, 456, 40);
		add(lblNewLabel);
		
		searchTextField = new JTextField();
		searchTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		searchTextField.setBounds(62, 102, 186, 29);
		add(searchTextField);
		searchTextField.setColumns(10);
		
		JButton searchButton = new JButton("Search");
		searchButton.setBackground(new Color(128, 128, 192));
		searchButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		searchButton.setBounds(273, 102, 168, 29);
		add(searchButton);
		

	}
}
