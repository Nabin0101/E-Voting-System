package com.nextstep.votingsystem.voting;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginAs extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAs frame = new LoginAs();
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
	public LoginAs() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 455);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 412, 398);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel imageIconLabel = new JLabel("");
		imageIconLabel.setBounds(10, 10, 392, 378);
		panel.add(imageIconLabel);
		ImageIcon icon= new ImageIcon("C:\\Users\\navee\\Downloads\\loginas.png");
		Image image=icon.getImage().getScaledInstance(450, 450, Image.SCALE_SMOOTH);
		imageIconLabel.setIcon( new ImageIcon(image));
		
		JButton adminLoginButton = new JButton("Login as Admin");
		adminLoginButton.setBackground(new Color(128, 0, 128));
		adminLoginButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		adminLoginButton.setBounds(500, 97, 224, 43);
		contentPane.add(adminLoginButton);
		
		JButton votersLoginButton = new JButton("Login to Vote");
		votersLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login voters=new Login();
				voters.setVisible(true);
				dispose();
			}
		});
		votersLoginButton.setBackground(new Color(128, 0, 128));
		votersLoginButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		votersLoginButton.setBounds(500, 211, 224, 43);
		contentPane.add(votersLoginButton);
	}
}
