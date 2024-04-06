package com.nextstep.votingsystem.voting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setTitle("Admin Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 371);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		usernameLabel.setBounds(44, 56, 137, 35);
		contentPane.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		passwordLabel.setBounds(44, 130, 137, 35);
		contentPane.add(passwordLabel);
		
		usernameTextField = new JTextField();
		usernameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		usernameTextField.setBounds(225, 56, 175, 35);
		contentPane.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		passwordField.setBounds(225, 130, 175, 35);
		contentPane.add(passwordField);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainMenu admin= new MainMenu();
				admin.setVisible(true);
				dispose();
			}
		});
		loginButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		loginButton.setForeground(new Color(255, 255, 255));
		loginButton.setBackground(new Color(0, 255, 0));
		loginButton.setBounds(280, 228, 120, 35);
		contentPane.add(loginButton);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginAs user = new LoginAs();
				user.setVisible(true);
				dispose();
			}
		});
		backButton.setForeground(new Color(255, 255, 255));
		backButton.setBackground(new Color(255, 0, 0));
		backButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		backButton.setBounds(25, 228, 120, 35);
		contentPane.add(backButton);
	}
}
