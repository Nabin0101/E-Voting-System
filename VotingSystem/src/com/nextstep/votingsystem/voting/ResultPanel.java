package com.nextstep.votingsystem.voting;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;

public class ResultPanel extends JPanel {
	private JTextField pCandidate1ResultField;
	private JTextField vpCandidate1ResultField;
	private JTextField pCandidate2ResultField;
	private JTextField vpCandidate2ResultField;

	/**
	 * Create the panel.
	 */
	public ResultPanel() {
		setBackground(new Color(0, 128, 128));
		setBounds(0, 0, 881, 473);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Result");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel.setBounds(88, 33, 438, 40);
		add(lblNewLabel);
		
		JLabel pCandidate1 = new JLabel("Bishal Raut");
		pCandidate1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		pCandidate1.setBounds(44, 131, 112, 33);
		add(pCandidate1);
		
		JLabel vpCandidate1 = new JLabel("Jyoti Khadka");
		vpCandidate1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		vpCandidate1.setBounds(44, 272, 112, 33);
		add(vpCandidate1);
		
		JLabel pCandidate2 = new JLabel("FulMaya Tamang");
		pCandidate2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		pCandidate2.setBounds(348, 131, 160, 33);
		add(pCandidate2);
		
		JLabel vpCandaidate2 = new JLabel("Ram Yadav");
		vpCandaidate2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		vpCandaidate2.setBounds(348, 272, 112, 33);
		add(vpCandaidate2);
		
		pCandidate1ResultField = new JTextField();
		pCandidate1ResultField.setBounds(180, 141, 96, 23);
		add(pCandidate1ResultField);
		pCandidate1ResultField.setColumns(10);
		
		vpCandidate1ResultField = new JTextField();
		vpCandidate1ResultField.setColumns(10);
		vpCandidate1ResultField.setBounds(180, 282, 96, 23);
		add(vpCandidate1ResultField);
		
		pCandidate2ResultField = new JTextField();
		pCandidate2ResultField.setColumns(10);
		pCandidate2ResultField.setBounds(518, 141, 96, 23);
		add(pCandidate2ResultField);
		
		vpCandidate2ResultField = new JTextField();
		vpCandidate2ResultField.setColumns(10);
		vpCandidate2ResultField.setBounds(492, 282, 96, 23);
		add(vpCandidate2ResultField);

	}
	    public void setResult(int pCandidate1Votes, int pCandidate2Votes, int vpCandidate1Votes, int vpCandidate2Votes) {
	        pCandidate1ResultField.setText(Integer.toString(pCandidate1Votes));
	        pCandidate2ResultField.setText(Integer.toString(pCandidate2Votes));
	        vpCandidate1ResultField.setText(Integer.toString(vpCandidate1Votes));
	        vpCandidate2ResultField.setText(Integer.toString(vpCandidate2Votes));
	    }
	}
