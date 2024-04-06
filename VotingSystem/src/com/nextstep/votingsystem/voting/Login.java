package com.nextstep.votingsystem.voting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField idTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\csit6th\\istockphoto-1258633187-612x612.jpg"));
		lblNewLabel.setBounds(10, 10, 557, 440);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login To Vote");
		lblNewLabel_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(652, 23, 224, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Voter_ID:");
		lblNewLabel_1_1.setForeground(new Color(64, 128, 128));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(652, 100, 224, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password:");
		lblNewLabel_1_1_1.setForeground(new Color(64, 128, 128));
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(652, 201, 224, 31);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(128, 0, 255));
		lblNewLabel_2.setIcon(null);
		lblNewLabel_2.setBounds(582, 10, 309, 440);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 255));
		panel.setBounds(573, 10, 349, 440);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(75, 329, 165, 40);
		panel.add(loginButton);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VotingSystem voters= new VotingSystem();
				voters.setVisible(true);
				dispose();
			}
		});
		loginButton.setForeground(Color.WHITE);
		loginButton.setBackground(Color.GREEN);
		loginButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		passwordField = new JPasswordField();
		passwordField.setBounds(41, 236, 224, 40);
		panel.add(passwordField);
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		idTextField = new JTextField();
		idTextField.setBounds(41, 128, 224, 40);
		panel.add(idTextField);
		idTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		idTextField.setColumns(10);
		
		JButton backtoLoginButton = new JButton("Back");
		backtoLoginButton.setBounds(160, 393, 118, 37);
		panel.add(backtoLoginButton);
		backtoLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginAs user= new LoginAs();
				user.setVisible(true);
				dispose();
			}
		});
		backtoLoginButton.setForeground(Color.WHITE);
		backtoLoginButton.setBackground(Color.RED);
		backtoLoginButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
	}
}
