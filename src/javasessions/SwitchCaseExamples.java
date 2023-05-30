package javasessions;

public class SwitchCaseExamples {

	public static void main(String[] args) {

		// byte, short, int, char, String -- valid

		// not valid -- long, float, double, boolean

		int num = 10;

		switch (num) {
		case 10:
			System.out.println("10");
			break;

		default:
			break;
		}

		//0 to 100
		String stName = "Mahesh";
		int marks = 0;

		switch (stName) {
		case "Tom":
			System.out.println("tom passed");
			marks = 100 - 20;
			break;
		case "Peter":
			System.out.println("peter passed");
			marks = 100;
			break;
		case "Naveen":
			System.out.println("naveen passed");
			marks = 100;
			break;

		default:
			System.out.println("student is not found: " + stName);
			marks = -1;
			break;
		}
		
		System.out.println(marks);
		if(marks >=0) {
			System.out.println("print the mark sheet");
		}
		else {
			System.out.println("no need to print");
		}

	}

}
