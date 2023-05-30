package javasessions;

public class LoginTest {

	
	
	public static void main(String[] args) {

		
		if(LoginPage.forgotPwdLinkExist()) {
			System.out.println("change ur pwd");
		}
		
		
		LoginPage lp = new LoginPage();
		lp.doLogin("Naveen@gmail.com", "Naveen@123");
		
	}

}
