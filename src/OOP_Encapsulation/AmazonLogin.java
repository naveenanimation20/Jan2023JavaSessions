package OOP_Encapsulation;

public class AmazonLogin {

	public static void main(String[] args) {

		//registration:
		LoginPage lp = new LoginPage("pooja@gmail.com", "pooja@123");
		
		//login:
		lp.doLogin(lp.getUserName(), lp.getPassword());
		
		//reset pwd:
		lp.setPassword("pooja@456");
		lp.doLogin(lp.getUserName(), lp.getPassword());

		//abhishek - seller:
		LoginPage lp1 = new LoginPage("abhiseller@gmail.com", "seller@123");

		//login:
		lp1.doLogin(lp1.getUserName(), lp1.getPassword());
		
		
		
	}

}
