
/* created by Menocal, Alejandro */
//Login User UI, can read a text file and match if the username and password is correct.
//Only one username and password (made it work with more than one username and password but it was glitchy)

public class Main {

	public static void main(String[] args) {
		
		LoginView theView = new LoginView();
		LoginModel theModel = new LoginModel();
		LoginController theController = new LoginController(theView, theModel);
		theView.setVisible(true);
	}

}
