package com.nextstep.votingsystem.example;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class StudentForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentForm frame = new StudentForm();
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
	public StudentForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel fullNameLabel = new JLabel("FullName");
		fullNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		fullNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		fullNameLabel.setBounds(29, 28, 99, 30);
		contentPane.add(fullNameLabel);
		
		JLabel passwordLabel_1 = new JLabel("Password");
		passwordLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		passwordLabel_1.setBounds(29, 78, 99, 30);
		contentPane.add(passwordLabel_1);
		
		JLabel checkBoxLabel = new JLabel("Student");
		checkBoxLabel.setHorizontalAlignment(SwingConstants.CENTER);
		checkBoxLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		checkBoxLabel.setBounds(29, 155, 99, 30);
		contentPane.add(checkBoxLabel);
		
		JLabel radioButtonLabel = new JLabel("Gender");
		radioButtonLabel.setHorizontalAlignment(SwingConstants.CENTER);
		radioButtonLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		radioButtonLabel.setBounds(29, 206, 99, 30);
		contentPane.add(radioButtonLabel);
		
		JLabel comboBoxLabel = new JLabel("Level");
		comboBoxLabel.setHorizontalAlignment(SwingConstants.CENTER);
		comboBoxLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBoxLabel.setBounds(29, 258, 99, 30);
		contentPane.add(comboBoxLabel);
		
		JTextField nameTextField = new JTextField();
		nameTextField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		nameTextField.setColumns(10);
		nameTextField.setBounds(203, 35, 179, 30);
		contentPane.add(nameTextField);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		passwordField.setBounds(203, 94, 179, 30);
		contentPane.add(passwordField);
		
		JCheckBox checkBox = new JCheckBox("Check Me");
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		checkBox.setBounds(213, 161, 153, 30);
		contentPane.add(checkBox);
		
		JRadioButton othersRadioButton = new JRadioButton("Others");
		buttonGroup.add(othersRadioButton);
		othersRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		othersRadioButton.setBounds(367, 212, 83, 21);
		contentPane.add(othersRadioButton);
		
		JRadioButton maleRadioButton = new JRadioButton("Male");
		buttonGroup.add(maleRadioButton);
		maleRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		maleRadioButton.setBounds(203, 212, 62, 21);
		contentPane.add(maleRadioButton);
		
		JRadioButton femaleRadioButton = new JRadioButton("female");
		buttonGroup.add(femaleRadioButton);
		femaleRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		femaleRadioButton.setBounds(282, 212, 83, 21);
		contentPane.add(femaleRadioButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Level", "+2", "Bachelor", "Master", "PHD"}));
		comboBox.setBounds(203, 264, 163, 21);
		contentPane.add(comboBox);
		
		JButton submitButton = new JButton("Submit");
		submitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 String fullName = nameTextField.getText();
	                String password = new String(passwordField.getPassword());
	                boolean isChecked = checkBox.isSelected();
	                String gender = "";
	                if (maleRadioButton.isSelected()) {
	                    gender = "Male";
	                } else if (femaleRadioButton.isSelected()) {
	                    gender = "Female";
	                } else if (othersRadioButton.isSelected()) {
	                    gender = "Others";
	                }
	                String level = comboBox.getSelectedItem().toString();

	                // Display data
	                System.out.println("Full Name: " + fullName);
	                System.out.println("Password: " + password);
	                System.out.println("Is Checked: " + isChecked);
	                System.out.println("Gender: " + gender);
	                System.out.println("Level: " + level);
	            }
		});
		submitButton.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		submitButton.setBounds(436, 335, 153, 47);
		contentPane.add(submitButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(567, 78, 212, 158);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
