package OOP_Encapsulation;

public class LoginPage {

	private String userName;
	private String password;

	public LoginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("enter username: " + un);
		System.out.println("enter password: " + pwd);
		System.out.println("click on login button");
		
		if(isUserActive(un)) {
			System.out.println("user is logged in....");
		}
		else {
			System.out.println("user is inactive...account is blocked....");
		}
		
	}
	
	private boolean isUserActive(String un) {
		System.out.println("checking user status: " + un);
		return true;
	}
	

}
