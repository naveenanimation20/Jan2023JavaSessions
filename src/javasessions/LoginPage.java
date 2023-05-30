package javasessions;

public class LoginPage {

	public static boolean forgotPwdLinkExist() {
		System.out.println("checking forgot pwd link on the page");
		return true;		
	}

	public void doLogin(String un, String pwd) {
		System.out.println("login with: " + un + "  : " + pwd);
		System.out.println("logged in");
	}

	
	
}


