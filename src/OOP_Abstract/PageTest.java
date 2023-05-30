package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.pageTimeLoadTimeOut();
		lp.forgotPwd();
		lp.displayLogo();
		Page.footer();
		LoginPage.footer();
		
		//child class object can be referred by parent abstract class ref variable
		//top casting
		Page p = new LoginPage();
		p.title();
		p.url();
		p.pageTimeLoadTimeOut();
		p.displayLogo();
		
		//LoginPage lp1 = new Page();//NA
	}

}
