import java.awt.event.*;
import java.io.*;

import javax.swing.JOptionPane;



public class LoginController {

	private LoginModel theModel;
	private LoginView theView;
	
	public LoginController(LoginView theView, LoginModel theModel){
		this.theView = theView;
		this.theModel = theModel;
		this.theView.addLoginListener(new LoginListener());
	}		
	
	class LoginListener implements ActionListener{
		
		
		public void actionPerformed(ActionEvent e){
			
			String username = theView.getUsername();
			String password = theView.getPassword();
			
			
			theModel.setUsername(username);
			theModel.setPassword(password);
			
			String TxtFile = "Username.txt";
			BufferedReader br = null;
			String line = "";
			String space = " ";
		 
			try {
		 
				br = new BufferedReader(new FileReader(TxtFile));
				while ((line = br.readLine()) != null) {
		 
					String[] parse = line.split(space);
					//System.out.println("Username " + parse[0] + " Password " + parse[1] + "Length " + parse.length);
					
					if (!(username.equals(parse[0]) && password.equals(parse[1]))){
						JOptionPane.showMessageDialog(null,"Wrong Password / Username");
					
					}
					else if (username.equals(parse[0]) && password.equals(parse[1])){
							JOptionPane.showMessageDialog(null,	 "Success");
						}
				}
			} catch (FileNotFoundException fe) {
				fe.printStackTrace();
			} catch (IOException fe) {
				fe.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException fe) {
						fe.printStackTrace();
					}
				}
			}
		
			
			
			/*if(username.equals("amenocal") && password.equals("12345")) {
				JOptionPane.showMessageDialog(null,	 "Success");
			} 
			else {
			JOptionPane.showMessageDialog(null,"Wrong Password / Username");
				}*/
		}

		
	}
	
	
}
