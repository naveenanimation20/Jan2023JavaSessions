package WebDriver_Arch;

public class FirefoxDriver implements WebDriver{
	
	public FirefoxDriver() {
		System.out.println("launch firefox browser.....");
	}
	
	@Override
	public void get(String url) {
		System.out.println("entering url:" + url);
	}

	@Override
	public String getTitle() {
		return "amazon";
	}

	@Override
	public void click(String element) {
		System.out.println("click on :" + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering " + value + " into " + element);
	}

	@Override
	public void close() {
		System.out.println("close browser");
	}

	@Override
	public void findElement(String element) {
		System.out.println("finding element by using :" + element);
	}
	

}
