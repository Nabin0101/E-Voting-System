package com.nextstep.votingsystem.voting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class VotingSystem extends JFrame {

	private JPanel contentPane;
	private int president1Votes = 0;
	private int president2Votes = 0;
	private int vp1Votes = 0;
	private int vp2Votes = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VotingSystem frame = new VotingSystem();
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
	public VotingSystem() {
		setTitle("Voting System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 698, 722);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please vote Wisely .");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(54, 23, 524, 47);
		contentPane.add(lblNewLabel);
		
		JPanel presidentPanel = new JPanel();
		presidentPanel.setBackground(new Color(64, 128, 128));
		presidentPanel.setBounds(20, 98, 637, 212);
		contentPane.add(presidentPanel);
		presidentPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Vote For President");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(170, 10, 219, 26);
		presidentPanel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				president1Votes++;
				updateVoteCount();
			}
		});
		panel_1.setBackground(new Color(128, 128, 192));
		panel_1.setBounds(37, 138, 204, 53);
		presidentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Bishal Raut");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(107, 10, 87, 33);
		panel_1.add(lblNewLabel_2);
		
		JLabel president1IconLabel = new JLabel("");
		president1IconLabel.setBounds(22, 10, 45, 33);
		panel_1.add(president1IconLabel);
		ImageIcon icon2= new ImageIcon("C:\\Users\\navee\\Downloads\\doctor.png");
		Image image2=icon2.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		president1IconLabel.setIcon( new ImageIcon(image2));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				president2Votes++;
				updateVoteCount();
			}
		});
		panel_1_1.setBackground(new Color(128, 128, 192));
		panel_1_1.setBounds(357, 138, 204, 53);
		presidentPanel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("FulMaya Tamang");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(64, 10, 130, 33);
		panel_1_1.add(lblNewLabel_3);
		
		JLabel president2IconLabel = new JLabel("");
		president2IconLabel.setBounds(10, 10, 45, 33);
		panel_1_1.add(president2IconLabel);
		ImageIcon icon3= new ImageIcon("C:\\Users\\navee\\Downloads\\flower.png");
		Image image3=icon3.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		president2IconLabel.setIcon( new ImageIcon(image3));
		
		JPanel vicePresidentPanel = new JPanel();
		vicePresidentPanel.setLayout(null);
		vicePresidentPanel.setBackground(new Color(64, 128, 128));
		vicePresidentPanel.setBounds(20, 400, 637, 212);
		contentPane.add(vicePresidentPanel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Vote For Vice-President");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(170, 10, 252, 26);
		vicePresidentPanel.add(lblNewLabel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vp1Votes++;
				updateVoteCount();
			}
		});
		panel_1_2.setBackground(new Color(128, 128, 192));
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(37, 138, 204, 53);
		vicePresidentPanel.add(panel_1_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Jyoti Khadka");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(87, 10, 107, 33);
		panel_1_2.add(lblNewLabel_2_1);
		
		JLabel vPresident1IconLabel = new JLabel("");
		vPresident1IconLabel.setBounds(10, 10, 45, 33);
		panel_1_2.add(vPresident1IconLabel);
		ImageIcon icon1= new ImageIcon("C:\\Users\\navee\\Downloads\\bicycle.png");
		Image image1=icon1.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		vPresident1IconLabel.setIcon( new ImageIcon(image1));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vp2Votes++;
				updateVoteCount();
			}
		});
		panel_1_1_1.setBackground(new Color(128, 128, 192));
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBounds(357, 138, 204, 53);
		vicePresidentPanel.add(panel_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Ram Yadav");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(64, 10, 130, 33);
		panel_1_1_1.add(lblNewLabel_3_1);
		
		JLabel vPresidentIconLabel = new JLabel("");
		vPresidentIconLabel.setBounds(10, 10, 45, 33);
		panel_1_1_1.add(vPresidentIconLabel);
		ImageIcon icon= new ImageIcon("C:\\Users\\navee\\Downloads\\ferrari.png");
		Image image=icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		vPresidentIconLabel.setIcon( new ImageIcon(image));
	}
	private void updateVoteCount() {
	    ResultPanel result =new ResultPanel();
	    result.setResult(vp1Votes, vp2Votes, vp1Votes, vp2Votes);
	}


}
