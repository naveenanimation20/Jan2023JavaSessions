package javasessions;

import java.util.ArrayList;


public class Concept {

	// WAF:
	// supply a browser name : String: chrome/ff/safari/IE
	// buss logic: launch the browser
	// return true

	public boolean launchBrowser(String browserName) {
		System.out.println("browser name : " + browserName);
		boolean flag = true;

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch ff");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("plz pass the right browser...." + browserName);
			flag = false;
			break;
		}

		return flag;

	}

	public void testing() {
		System.out.println("testing method");
		return;
	}

	// WAF:
	// supply input param: Company Name (String): IBM, MS, Google
	// return : the list of employee of the comp: ArrayList<String>
	public ArrayList<String> getEmpList(String compName) {
		System.out.println("company name is : " + compName);

		ArrayList<String> empList = new ArrayList<String>();// pc=0

		if (compName.equalsIgnoreCase("IBM")) {
			empList.add("Rakesh");
			empList.add("Ravi");
			empList.add("Geeta");
		} else if (compName.equalsIgnoreCase("MS")) {
			empList.add("Abhi");
			empList.add("Naveen");
			empList.add("Heena");
			empList.add("Azam");
		} else if (compName.equalsIgnoreCase("Google")) {
			empList.add("Fawad");
			empList.add("Dhurv");
		} else {
			System.out.println("comp name is not found...plz pass the right comp name...");
		}

		return empList;
	}

	public static void main(String[] args) {

		Concept c = new Concept();
		ArrayList<String> ibmList = c.getEmpList("IBM");
		System.out.println(ibmList);
		
		ArrayList<String> googleList = c.getEmpList("Google");
		System.out.println(googleList);
		
		ArrayList<String> ctsList = c.getEmpList("CTS");
		System.out.println(ctsList);
		System.out.println(ctsList.size());
		
		ArrayList<String> msList = c.getEmpList("MS");
		System.out.println(msList);
		System.out.println(msList.size());
		
		

		boolean isLaunched = c.launchBrowser("opera");
		if (isLaunched) {
			System.out.println("enter the url....");
		} else {
			System.out.println("dont enter the url");
		}

	}

}
