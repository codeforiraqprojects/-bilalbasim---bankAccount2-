package com.bilalbasim;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class BankAccount {

    private JFrame frame;
    private JTextField userTF;
    JPanel panel_main;
    JPanel panel_operation;
    JPanel panel_error;
    JPanel panel_Withdraw;
    JPanel panel_Deposit;
    
    private JTextField passwordTF;
    Account a1 = new Account();
    
    double amount= 9000;
    private JTextField withdrawtf;
    private JTextField addmonyTF;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
	    public void run() {
		try {
		    BankAccount window = new BankAccount();
		    window.frame.setVisible(true);
		} catch (Exception e) {
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public BankAccount() {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
	frame = new JFrame();
	frame.setBounds(100, 100, 569, 373);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(new CardLayout(0, 0));

	panel_main = new JPanel();
	frame.getContentPane().add(panel_main, "name_1142205651798839");
	panel_main.setLayout(null);

	JLabel usernameTF = new JLabel("User Name:");
	usernameTF.setBounds(83, 134, 115, 16);
	panel_main.add(usernameTF);

	JLabel lblPassword = new JLabel("Password: ");
	lblPassword.setBounds(83, 172, 104, 16);
	panel_main.add(lblPassword);

	userTF = new JTextField();
	userTF.setBounds(210, 134, 116, 22);
	panel_main.add(userTF);
	userTF.setColumns(10);

	JButton btnLogin = new JButton("Login");
	btnLogin.setBounds(382, 246, 97, 25);
	btnLogin.addActionListener(new ActionListener() {

	    public void actionPerformed(ActionEvent arg0) {
		// String a=textField.getText();
		// String b=textField_1.getText();
		if (userTF.getText().equals("belal") && passwordTF.getText().equals("basim")) {
		    panel_main.setVisible(false);
		    panel_operation.setVisible(true);

		} else {
		    panel_main.setVisible(false);
		    panel_error.setVisible(true);

		}
		// JOptionPane.showMessageDialog(null,"good work");

	    }
	});
	panel_main.add(btnLogin);

	passwordTF = new JTextField();
	passwordTF.setBounds(210, 167, 116, 21);
	panel_main.add(passwordTF);
	passwordTF.setColumns(10);

	JLabel lblBankProject = new JLabel("Bank Project");
	lblBankProject.setFont(new Font("Arial", Font.BOLD, 18));
	lblBankProject.setBounds(160, 30, 123, 25);
	panel_main.add(lblBankProject);
	
	JButton btnExit = new JButton("exit");
	btnExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    System.exit(0);
		}
	});
	btnExit.setBounds(103, 244, 115, 29);
	panel_main.add(btnExit);

	panel_operation = new JPanel();
	frame.getContentPane().add(panel_operation, "name_1142205656847368");
	panel_operation.setLayout(null);

	JLabel lblNewLabel = new JLabel("Account No.");
	lblNewLabel.setBounds(15, 69, 108, 16);
	panel_operation.add(lblNewLabel);

	JButton btnSum = new JButton("Deposit");
	btnSum.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		panel_operation.setVisible(false);
		panel_Deposit.setVisible(true);

	    }
	});
	btnSum.setBounds(78, 182, 113, 29);
	panel_operation.add(btnSum);

	JButton btnBack_1 = new JButton("back");
	btnBack_1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		panel_operation.setVisible(false);
		panel_main.setVisible(true);
	    }
	});
	btnBack_1.setBounds(201, 245, 137, 42);
	panel_operation.add(btnBack_1);

	JLabel lblHiMr = new JLabel("Hi Mr.");
	lblHiMr.setBounds(45, 33, 43, 20);
	panel_operation.add(lblHiMr);

	JLabel lblNewLabel_3 = new JLabel(" ");
	lblNewLabel_3.setBounds(136, 82, 81, 20);
	panel_operation.add(lblNewLabel_3);

	JButton btnWithdraw = new JButton("Withdraw");
	btnWithdraw.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		panel_Withdraw.setVisible(true);
		panel_operation.setVisible(false);

	    }

	});
	btnWithdraw.setBounds(206, 180, 132, 31);
	panel_operation.add(btnWithdraw);

	JButton btnCheckbalance = new JButton("CheckBalance");
	btnCheckbalance.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		
//		panel_Withdraw.setVisible(true);
//		panel_operation.setVisible(false);
		JOptionPane.showMessageDialog(null, "your balance is : " + amount);
	    }
	});
	btnCheckbalance.setBounds(353, 181, 132, 31);
	panel_operation.add(btnCheckbalance);

	JLabel lblNewLabel_1 = new JLabel("1984");
	lblNewLabel_1.setBounds(124, 67, 146, 20);
	panel_operation.add(lblNewLabel_1);

	JLabel lblNewLabel_2 = new JLabel("bilal");
	lblNewLabel_2.setBounds(123, 33, 69, 20);
	panel_operation.add(lblNewLabel_2);

	panel_error = new JPanel();
	frame.getContentPane().add(panel_error, "name_1142205661667611");
	panel_error.setLayout(null);

	JLabel lblErrorInUser = new JLabel("Error in user name or password ... Please back to main menu");
	lblErrorInUser.setBounds(39, 91, 444, 32);
	panel_error.add(lblErrorInUser);

	JButton btnBack = new JButton("Back");
	btnBack.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		panel_error.setVisible(false);
		panel_main.setVisible(true);
	    }
	});
	btnBack.setBounds(241, 231, 97, 25);
	panel_error.add(btnBack);

	panel_Withdraw = new JPanel();
	frame.getContentPane().add(panel_Withdraw, "name_99976445612470");
	panel_Withdraw.setLayout(null);

	JButton btnBack_2 = new JButton("Back");
	btnBack_2.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		panel_Withdraw.setVisible(false);
		panel_operation.setVisible(true);
	    }
	});
	btnBack_2.setBounds(109, 256, 115, 29);
	panel_Withdraw.add(btnBack_2);

	JLabel lblNewLabel_4 = new JLabel("Withdraw No :");
	lblNewLabel_4.setBounds(102, 113, 115, 20);
	panel_Withdraw.add(lblNewLabel_4);

	withdrawtf = new JTextField();
	withdrawtf.setBounds(289, 113, 106, 26);
	panel_Withdraw.add(withdrawtf);
	withdrawtf.setColumns(10);

	JButton btnWithdraw_1 = new JButton("Withdraw");
	btnWithdraw_1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		double amt=Double.parseDouble(withdrawtf.getText());

			if (amount < amt) {
			    JOptionPane.showMessageDialog(null, "Insufficient Balance");
			} else {
			    amount = amount - amt;
			    JOptionPane.showMessageDialog(null, " amount "+amount);
			}
		

	    }
	});
	btnWithdraw_1.setBounds(303, 256, 115, 29);
	panel_Withdraw.add(btnWithdraw_1);
	
	JLabel lblNewLabel_5 = new JLabel("");
	lblNewLabel_5.setBounds(219, 51, 69, 20);
	panel_Withdraw.add(lblNewLabel_5);
	
	panel_Deposit = new JPanel();
	frame.getContentPane().add(panel_Deposit, "name_103255132594382");
	panel_Deposit.setLayout(null);
	
	JButton btnNewButton = new JButton("Back");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    panel_Deposit.setVisible(false);
			panel_operation.setVisible(true);
		
	
		}	
	});
	btnNewButton.setBounds(70, 253, 115, 29);
	panel_Deposit.add(btnNewButton);
	
	JLabel lblTotalAccount = new JLabel("Mony to Add");
	lblTotalAccount.setBounds(70, 139, 115, 20);
	panel_Deposit.add(lblTotalAccount);
	
	addmonyTF = new JTextField();
	addmonyTF.setBounds(250, 136, 146, 26);
	panel_Deposit.add(addmonyTF);
	addmonyTF.setColumns(10);
	
	JButton btnTotalAcount = new JButton("Total Account");
	btnTotalAcount.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		double amt=Double.parseDouble(addmonyTF.getText());

		    amount = amount + amt;
		    JOptionPane.showMessageDialog(null, " amount "+amount);
	}
		
	});
	btnTotalAcount.setBounds(289, 253, 158, 29);
	panel_Deposit.add(btnTotalAcount);




    }
}
