package ExceptionHandling;

public class CrossBrowserTest {

	public static void main(String[] args) {

		String browser = "opera";
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		
		else if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		
		else if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		
		else {
			System.out.println("plz pass the right browser");
			throw new MyException("browsernotfoundexception");
		}
		
		
	}

}
