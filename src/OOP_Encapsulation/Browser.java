package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching browser....");
		checkBrowserVersion();
		checkOSCompatibility();
		checkRAM();
		checkCPU();
		System.out.println("browser is launched....");

	}

	private void checkBrowserVersion() {
		System.out.println("check browser version....");
	}

	private void checkOSCompatibility() {
		System.out.println("checkOSCompatibility....");
	}

	private void checkRAM() {
		System.out.println("checkRAM");
	}

	private void checkCPU() {
		System.out.println("checkCPU....");
	}

}

