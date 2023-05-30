package WebDriver_Arch;

public class AmazonTest {

	public static void main(String[] args) {

		// chrome:
		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();
		// SafariDriver driver = new SafariDriver();

		String browser = "firefox";
		WebDriver driver = null;

		//cross browser logic:
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("plzzz pass the right browser...");
		}

		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("page title:" + title);
		driver.findElement("emailId");
		driver.sendKeys("emailId", "naveen@gmail.com");
		driver.findElement("password");
		driver.sendKeys("password", "naveen@123");
		driver.findElement("loginButton");
		driver.click("loginButton");
		driver.close();

	}

}
