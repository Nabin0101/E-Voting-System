package com.nextstep.votingsystem.voting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.LineBorder;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register extends JFrame {

	private static final Color Color = null;
	private JPanel contentPane;
	private JTextField firstnameTextField;
	private JTextField lastnameTextField;
	private JTextField paddressTextField;
	private JTextField taddressTextField;
	private JTextField contactNumberTextField;
	private JTextField fathernameTextField;
	private JTextField motherNameTextField;
	private JTextField citizenNumberTextField;
	private JPasswordField passwordField;
	private JTextField voterIdTextField;
    private JLabel motherNameValidationLabel,voterIdValidationLabel;
    private JPasswordField confirmPasswordField;
    private JComboBox genderComboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setResizable(false);
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setForeground(new Color(64, 0, 64));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel.setBounds(27, 32, 132, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblLastName.setBounds(27, 83, 132, 29);
		contentPane.add(lblLastName);
		
		JLabel lblPermanentAddress = new JLabel("Permanent Address");
		lblPermanentAddress.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPermanentAddress.setBounds(27, 138, 169, 29);
		contentPane.add(lblPermanentAddress);
		
		JLabel lblLastName_1_1 = new JLabel("Contact Number");
		lblLastName_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblLastName_1_1.setBounds(27, 252, 155, 29);
		contentPane.add(lblLastName_1_1);
		
		JLabel lblTemporaryAddress = new JLabel("Temporary Address");
		lblTemporaryAddress.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTemporaryAddress.setBounds(27, 194, 169, 29);
		contentPane.add(lblTemporaryAddress);
		
		JLabel lblFatherssName = new JLabel("Fathers's Name");
		lblFatherssName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblFatherssName.setBounds(27, 311, 132, 29);
		contentPane.add(lblFatherssName);
		
		JLabel lblMothersName = new JLabel("Mother's Name");
		lblMothersName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblMothersName.setBounds(27, 364, 132, 29);
		contentPane.add(lblMothersName);
		
		JLabel lblCitizenshipNumber = new JLabel("Citizenship Number");
		lblCitizenshipNumber.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblCitizenshipNumber.setBounds(27, 418, 169, 29);
		contentPane.add(lblCitizenshipNumber);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblGender.setBounds(27, 466, 169, 29);
		contentPane.add(lblGender);
		
		firstnameTextField = new JTextField();
		firstnameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		firstnameTextField.setBounds(218, 32, 226, 29);
		contentPane.add(firstnameTextField);
		firstnameTextField.setColumns(10);
		
		lastnameTextField = new JTextField();
		lastnameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lastnameTextField.setColumns(10);
		lastnameTextField.setBounds(218, 83, 226, 29);
		contentPane.add(lastnameTextField);
		
		paddressTextField = new JTextField();
		paddressTextField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		paddressTextField.setColumns(10);
		paddressTextField.setBounds(218, 138, 226, 29);
		contentPane.add(paddressTextField);
		
		taddressTextField = new JTextField();
		taddressTextField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		taddressTextField.setColumns(10);
		taddressTextField.setBounds(218, 194, 226, 29);
		contentPane.add(taddressTextField);
		
		contactNumberTextField = new JTextField();
		contactNumberTextField.setColumns(10);
		contactNumberTextField.setBounds(218, 252, 226, 29);
		contentPane.add(contactNumberTextField);
		
		fathernameTextField = new JTextField();
		fathernameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		fathernameTextField.setColumns(10);
		fathernameTextField.setBounds(218, 311, 226, 29);
		contentPane.add(fathernameTextField);
		
		motherNameTextField = new JTextField();
		motherNameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		motherNameTextField.setColumns(10);
		motherNameTextField.setBounds(218, 364, 226, 29);
		contentPane.add(motherNameTextField);
		
		citizenNumberTextField = new JTextField();
		citizenNumberTextField.setColumns(10);
		citizenNumberTextField.setBounds(218, 418, 226, 29);
		contentPane.add(citizenNumberTextField);
		
		 genderComboBox = new JComboBox();
		genderComboBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Gender", "Male", "Female", "Others"}));
		genderComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		genderComboBox.setBounds(218, 466, 224, 29);
		contentPane.add(genderComboBox);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPassword.setBounds(27, 550, 169, 29);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		passwordField.setBounds(218, 550, 226, 26);
		contentPane.add(passwordField);
		
		JButton registerButton = new JButton("Register");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validateField(firstnameTextField);
			}
		});
		registerButton.setForeground(new Color(255, 0, 0));
		registerButton.setBackground(new Color(0, 255, 0));
		registerButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		registerButton.setBounds(55, 680, 155, 41);
		contentPane.add(registerButton);
		
		JLabel lblVotersId = new JLabel("Voters Id");
		lblVotersId.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblVotersId.setBounds(27, 505, 169, 29);
		contentPane.add(lblVotersId);
		
		voterIdTextField = new JTextField();
		voterIdTextField.setColumns(10);
		voterIdTextField.setBounds(218, 505, 226, 29);
		contentPane.add(voterIdTextField);
		
		motherNameValidationLabel = new JLabel("");
		motherNameValidationLabel.setBounds(218, 395, 226, 13);
		contentPane.add(motherNameValidationLabel);
		
		 voterIdValidationLabel = new JLabel("");
		voterIdValidationLabel.setBounds(218, 639, 226, 13);
		contentPane.add(voterIdValidationLabel);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setForeground(new Color(0, 0, 0));
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCancel.setBackground(new Color(255, 0, 0));
		btnCancel.setBounds(306, 680, 155, 41);
		contentPane.add(btnCancel);
		
		JLabel lblConfirmPassworf = new JLabel("Confirm Password");
		lblConfirmPassworf.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblConfirmPassworf.setBounds(27, 603, 169, 29);
		contentPane.add(lblConfirmPassworf);
		
		confirmPasswordField = new JPasswordField();
		confirmPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		confirmPasswordField.setBounds(218, 603, 226, 26);
		contentPane.add(confirmPasswordField);
	}
	
	public void  validateField(JTextField field)
	{
		String regexp ="^[0-9]d{2}-[0-9]d{2}-[0-9]d{2}-[0-9]d{2}-[0-9]d{5}$";
		Pattern pattern =Pattern.compile(regexp);
		if(firstnameTextField.getText().isEmpty())
		{
			JOptionPane.showConfirmDialog(Register.this,"First Name cannot be empty","Error", JOptionPane.OK_CANCEL_OPTION );
	}
		else if(lastnameTextField.getText().isEmpty())
		{
			JOptionPane.showConfirmDialog(Register.this,"Last Name cannot be empty","Error", JOptionPane.OK_CANCEL_OPTION );
		}
		else if(paddressTextField.getText().isEmpty())
		{
			JOptionPane.showConfirmDialog(Register.this,"Permanent Address cannot be empty","Error", JOptionPane.OK_CANCEL_OPTION );
		}
		else if(taddressTextField.getText().isEmpty())
		{
			taddressTextField.setText(paddressTextField.getText());
		
		}
		else if(contactNumberTextField.getText().isEmpty())
		{
			JOptionPane.showConfirmDialog(Register.this,"Contact Number cannot be empty","Error", JOptionPane.OK_CANCEL_OPTION );
		}
		else if(fathernameTextField.getText().isEmpty())
		{
			JOptionPane.showConfirmDialog(Register.this," Father Name cannot be empty","Error", JOptionPane.OK_CANCEL_OPTION );
		}
		else if(motherNameTextField.getText().isEmpty())
		{
			JOptionPane.showConfirmDialog(Register.this,"Mother Name cannot be empty","Error", JOptionPane.OK_CANCEL_OPTION );
		}
		else if(genderComboBox.getSelectedItem().equals("Choose Gender"))
		{
			JOptionPane.showConfirmDialog(Register.this,"Please Choose your gender","Error", JOptionPane.OK_CANCEL_OPTION );
		}
		else if(citizenNumberTextField.getText().isEmpty())
		{
			JOptionPane.showConfirmDialog(Register.this,"Please Enter your citizenship Number","Error", JOptionPane.OK_CANCEL_OPTION );
		}
		else if(voterIdTextField.getText().isEmpty())
		{
			JOptionPane.showConfirmDialog(Register.this,"Please Enter your VoterID","Error", JOptionPane.OK_CANCEL_OPTION );
		}
		else if(passwordField.getText().isEmpty())
		{
			JOptionPane.showConfirmDialog(Register.this,"Password cannot be empty","Error", JOptionPane.OK_CANCEL_OPTION );
		}
		else if(passwordField.getText().length()<8)
		{
			JOptionPane.showConfirmDialog(Register.this,"Password should be greater than 8","Error", JOptionPane.OK_CANCEL_OPTION );
		}
		else if(confirmPasswordField.getText().isEmpty())
		{
			JOptionPane.showConfirmDialog(Register.this,"ReEnter the above password","Error", JOptionPane.OK_CANCEL_OPTION );
		}
		else if(confirmPasswordField.getText().equals(passwordField.getText()))
		{
			JOptionPane.showConfirmDialog(Register.this,"Password should be same","Error", JOptionPane.OK_CANCEL_OPTION );
		}
}	
}
