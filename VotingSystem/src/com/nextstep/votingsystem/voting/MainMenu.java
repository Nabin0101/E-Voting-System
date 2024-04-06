package com.nextstep.votingsystem.voting;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainMenu extends JFrame {

	private JPanel contentPane, logoutPane,homePane;
	private JLabel homeLabel,logoLabel;
	private HomePanel homePanel;
	private CandidatePanel candidatePanel;
	private ResultPanel resultPanel;
	private VotersPanel votersPanel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		homePanel=new HomePanel();
		resultPanel=new ResultPanel();
		candidatePanel=new CandidatePanel();
		votersPanel=new VotersPanel();
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 255));
		panel.setBounds(10, 10, 891, 483);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel mainMenuPanel = new JPanel();
		mainMenuPanel.setBackground(new Color(128, 0, 255));
		mainMenuPanel.setBounds(10, 10, 238, 463);
		panel.add(mainMenuPanel);
		mainMenuPanel.setLayout(null);
		
		JPanel adminPane = new JPanel();
		adminPane.setBackground(new Color(128, 0, 255));
		adminPane.setBounds(10, 10, 218, 117);
		mainMenuPanel.add(adminPane);
		adminPane.setLayout(null);
		
		JLabel adminlogoIconLabel = new JLabel("");
		adminlogoIconLabel.setBounds(68, 10, 59, 44);
		adminPane.add(adminlogoIconLabel);
		ImageIcon icon5= new ImageIcon("C:\\Users\\navee\\Downloads\\admin.jpg");
		Image image5=icon5.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
		adminlogoIconLabel.setIcon( new ImageIcon(image5));
	
		JLabel adminNameLabel = new JLabel("Welcome, Admin");
		adminNameLabel.setForeground(new Color(255, 255, 255));
		adminNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		adminNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		adminNameLabel.setBounds(10, 77, 198, 30);
		adminPane.add(adminNameLabel);
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 135, 218, 2);
		mainMenuPanel.add(separator);
		
		JPanel homePane = new JPanel();
		homePane.addMouseListener(new  PanelButtonMouseAdapter(homePane){
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(homePanel);
			}
		});
		homePane.setBorder(new LineBorder(new Color(0, 0, 0)));
		homePane.setBackground(new Color(128, 0, 255));
		homePane.setBounds(20, 158, 187, 53);
		mainMenuPanel.add(homePane);
		homePane.setLayout(null);
		
		 homeLabel = new JLabel("Home");
		homeLabel.setForeground(new Color(255, 255, 255));
		homeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		homeLabel.setBounds(75, 0, 102, 53);
		homePane.add(homeLabel);
		
		JLabel homeIconLabel = new JLabel("");
		homeIconLabel.setBounds(10, 0, 37, 53);
		homePane.add(homeIconLabel);
		ImageIcon icon = new ImageIcon("C:\\Users\\navee\\Downloads\\house.png");
		Image image=icon.getImage().getScaledInstance(40, 50, Image.SCALE_SMOOTH);
		homeIconLabel.setIcon(new ImageIcon(image));
		
		
		logoutPane = new JPanel();
		logoutPane.addMouseListener(new  PanelButtonMouseAdapter(logoutPane) {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to signout?")==0)
				{
					LoginAs user=new LoginAs();
					user.setVisible(true);
					dispose();
				}
				
			}
		});
		logoutPane.setBackground(new Color(255, 0, 0));
		logoutPane.setBounds(10, 414, 187, 39);
		mainMenuPanel.add(logoutPane);
		logoutPane.setLayout(null);
		
		JLabel logoutLabel = new JLabel("Logout");
		logoutLabel.setForeground(Color.WHITE);
		logoutLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		logoutLabel.setBounds(76, 0, 111, 39);
		logoutPane.add(logoutLabel);
		
		JLabel logoutIconLabel = new JLabel("");
		logoutIconLabel.setBounds(10, 10, 66, 23);
		logoutPane.add(logoutIconLabel);
		ImageIcon icon4 = new ImageIcon("C:\\Users\\navee\\Downloads\\logout.png");
		Image image4=icon4.getImage().getScaledInstance(40, 50, Image.SCALE_SMOOTH);
		logoutIconLabel.setIcon(new ImageIcon(image4));
		
		
		JPanel resultPane = new JPanel();
		resultPane.addMouseListener(new  PanelButtonMouseAdapter(resultPane) {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(resultPanel);
			}
		});
		resultPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		resultPane.setLayout(null);
		resultPane.setBackground(new Color(128, 0, 255));
		resultPane.setBounds(20, 213, 187, 53);
		mainMenuPanel.add(resultPane);
		
		JLabel resultLabel = new JLabel("Result");
		resultLabel.setForeground(Color.WHITE);
		resultLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		resultLabel.setBounds(76, 10, 101, 20);
		resultPane.add(resultLabel);
		
		JLabel resultIconLabel = new JLabel("");
		resultIconLabel.setBounds(10, 0, 37, 53);
		resultPane.add(resultIconLabel);
		ImageIcon icon1 = new ImageIcon("C:\\Users\\navee\\Downloads\\mission.png");
		Image image1=icon1.getImage().getScaledInstance(40, 50, Image.SCALE_SMOOTH);
		resultIconLabel.setIcon(new ImageIcon(image1));
		
		JPanel votersPane = new JPanel();
		votersPane.addMouseListener(new  PanelButtonMouseAdapter(votersPane) {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(votersPanel);
			}
		});
		votersPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		votersPane.setLayout(null);
		votersPane.setBackground(new Color(128, 0, 255));
		votersPane.setBounds(20, 268, 187, 53);
		mainMenuPanel.add(votersPane);
		
		JLabel voterLabel = new JLabel("Voter'sList");
		voterLabel.setForeground(Color.WHITE);
		voterLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		voterLabel.setBounds(76, 10, 101, 20);
		votersPane.add(voterLabel);
		
		JLabel votersIconLabel = new JLabel("");
		votersIconLabel.setBounds(10, 10, 66, 33);
		votersPane.add(votersIconLabel);
		ImageIcon icon2= new ImageIcon("C:\\Users\\navee\\Downloads\\vote.png");
		Image image2=icon2.getImage().getScaledInstance(40, 50, Image.SCALE_SMOOTH);
		votersIconLabel.setIcon(new ImageIcon(image2));
		
		JPanel candidatePane = new JPanel();
		candidatePane.addMouseListener(new  PanelButtonMouseAdapter(candidatePane) {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				menuClicked(candidatePanel);
			}
		});
		candidatePane.setBorder(new LineBorder(new Color(0, 0, 0)));
		candidatePane.setLayout(null);
		candidatePane.setBackground(new Color(128, 0, 255));
		candidatePane.setBounds(20, 322, 187, 53);
		mainMenuPanel.add(candidatePane);
		
		JLabel candidateLabel = new JLabel("CandidateList");
		candidateLabel.setForeground(Color.WHITE);
		candidateLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		candidateLabel.setBounds(53, 10, 124, 33);
		candidatePane.add(candidateLabel);
		
		JLabel candidateIconLabel = new JLabel("");
		candidateIconLabel.setBounds(10, 10, 66, 33);
		candidatePane.add(candidateIconLabel);
		ImageIcon icon3= new ImageIcon("C:\\Users\\navee\\Downloads\\politics.png");
		Image image3=icon3.getImage().getScaledInstance(40, 50, Image.SCALE_SMOOTH);
		candidateIconLabel.setIcon( new ImageIcon(image3));
		
		
		
		
		JPanel displayPane = new JPanel();
		displayPane.setBounds(258, 10, 623, 463);
		panel.add(displayPane);
		displayPane.setLayout(null);
		
		
		
		displayPane.add(homePanel);
		displayPane.add(resultPanel);
		displayPane.add(votersPanel);
		displayPane.add(candidatePanel);
		
		
		
		
		
	}
	private class PanelButtonMouseAdapter extends MouseAdapter
	{
		JPanel  panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel =panel;
		}
		@Override
		public void mouseEntered(MouseEvent e)
		{
			panel.setBackground(new Color(112, 128, 144));
			logoutPane.setBackground(new Color(255, 0, 0));
		}

		@Override
		public void mouseExited(MouseEvent e)
		{
					panel.setBackground(new Color(128, 0, 255));
					logoutPane.setBackground(new Color(255, 0, 0));
		}
		@Override
		public void mousePressed(MouseEvent e)
		{
			panel.setBackground(new Color(60, 179, 113));
		}
		@Override
		public void mouseReleased(MouseEvent e)
		{
			panel.setBackground(new Color(128, 0, 255));
			logoutPane.setBackground(new Color(255, 0, 0));
		}
	}
	 public void menuClicked(JPanel panel)
	 { 
		 
		homePanel.setVisible(false);
		resultPanel.setVisible(false);
		votersPanel.setVisible(false);
		candidatePanel.setVisible(false);
		
		panel.setVisible(true);
	 }
}
