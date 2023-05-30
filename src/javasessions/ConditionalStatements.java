package javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {

		
		int a = 5;
		int b = 5;
		
		System.out.println(a==b);
		
		if(a==b) {
			System.out.println("hi");
		}
		else {
			System.out.println("hello");
		}
		
		int c = 1;
		if(c > a) {
			System.out.println("bye");
		}
		
		
		if(true) {//dead code
			System.out.println("hi selenium");
		}
		else {//dead code
			System.out.println("bye selenium");
		}
		
		boolean flag = true;
		if(flag) {
			System.out.println("hi testing");
		}
		else {
			System.out.println("bye testing");
		}
		
		//
		boolean test = true;
		if(!test) {
			System.out.println("testing is done");
		}
		else {
			System.out.println("testing is pending");
		}
		
		//nested if
		int number = 85;
		
		if(number <= 100) {
			System.out.println("calculating your grade");
				if(number >= 90) {
					System.out.println("GRADE A");
					if(number == 100) {
						System.out.println("you got 100% scholarship");
					}
					else {
						System.out.println("you are not eligible for 100% scholarship");
					}
				}
				else {
					if(number >=80) {
						System.out.println("GRADE B");
					}
				}
		}
		else {
			System.out.println("plz pass the right marks...");
		}
		
		//if if if - else
		String browser = "ie";
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		
		if(browser.equals("firefox")) {
			System.out.println("launch firefox");
		}
		
		if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		
		if(browser.equals("ie")) {
			System.out.println("launch ie");
		}
		
		else {
			System.out.println("please pass the right browser....");
		}
		
		
		
		//if-else if:
//		String browser = "safari";
//		
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		
//		else if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		
//		else if(browser.equals("safari")) {
//			System.out.println("launch safari");
//		}
//		
//		else if(browser.equals("ie")) {
//			System.out.println("launch ie");
//		}
//		
//		else {
//			System.out.println("plz pass the right browser....");
//		}
		
		
		
		
		
		
	}

}
