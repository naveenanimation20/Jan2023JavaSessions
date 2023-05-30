package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "   CHROME ";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "ie":
			System.out.println("launch ie");
			break;
		case "opera":
			System.out.println("launch opera");
			break;

		default:
			System.out.println("please pass the right browser.....");
			break;
		}

		// QA, stage, UAT, DEV, PROD
		String envName = "qa"; //qa

		switch (envName.toLowerCase().trim()) {
		case "qa":
			System.out.println("run tests on QA");
			break;
			
		case "stage":
			System.out.println("run tests on stage");
			break;
			
		case "dev":
			System.out.println("run tests on dev");
			break;
			
		case "uat":
			System.out.println("run tests on uat");
			break;
			
		case "prod":
			System.out.println("run tests on prod");
			break;

		default:
			System.out.println("please pass the the right environment : " + envName);
			break;
		}

		// WAP to check given alphabet character is Vowel or Consonant using Switch -
		// Case
		// a e i o u

		char ch = 'a';
		switch (ch) {
		case 'a':
			System.out.println(ch + " : is a Vowel");
			break;
		case 'e':
			System.out.println(ch + " : is a Vowel");
			break;
		case 'i':
			System.out.println(ch + " : is a Vowel");
			break;
		case 'o':
			System.out.println(ch + " : is a Vowel");
			break;
		case 'u':
			System.out.println(ch + " : is a Vowel");
			break;

		default:
			System.out.println(ch + " : is a Consonant");
			break;
		}

	}

}
