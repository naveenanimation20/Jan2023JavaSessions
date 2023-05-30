package OOP_Abstract;

public class LoginPage extends Page{
	
	//hidden default const...
	
	//own default const...
//	public LoginPage() {
//		System.out.println("Lp -- const...");
//	}
	
//	public LoginPage(int i) {
//		System.out.println("Lp -- const..." + i);
//	}

	@Override
	public void title() {
		System.out.println("login title");
	}

	@Override
	public void url() {
		System.out.println("https://www.abc.com/login.html");	
	}
	
	@Override
	public void pageTimeLoadTimeOut() {
		System.out.println("page time out -- 5 secs");
	}

	public void forgotPwd() {
		System.out.println("forgotPwd");
	}
	
	
}
