import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class LoginView extends JFrame {

	JButton login = new JButton("Login");
	JTextField username = new JTextField(15);
	JPasswordField password = new JPasswordField(15);
	JButton welcome = new JButton("Welcome");
	
	public LoginView(){
		
		JPanel panel = new JPanel();
		setSize(500,500);
		setLocation(500,280);
		panel.setLayout (null); 
		
		welcome.setBounds(150,0,160,60);
		username.setBounds(140,100,150,20);
		password.setBounds(140,130,150,20);
		login.setBounds(140,170,80,20);
		
		panel.add(welcome);
		panel.add(login);
		panel.add(username);
		panel.add(password);
		
		this.add(panel);
		
		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public String getUsername(){
		return username.getText();
	}
	
	public String getPassword(){
		return password.getText();
	}
	
	
		
	void addLoginListener(ActionListener LoginListenerButton){
		login.addActionListener(LoginListenerButton);
	}
	
	void ErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
	
	
	
	


	
