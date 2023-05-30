package javasessions;

import java.util.Arrays;

public class ArrayLiteralsConcept {

	public static void main(String[] args) {

		// 2. Array Literals

		int a[] = { 1, 3, 4, 55, 23, 12, 101 };// 7
		// int ar[] = new int[4];//4

		System.out.println(a.length);
		System.out.println(Arrays.toString(a));

		double d[] = { 1.1, 2.3, 4.5, 5.6 };
		char vowles[] = { 'a', 'e', 'i', 'o', 'u' };

		String browsers[] = { "chrome", "firefox", "IE", "Edge", "Safari" };
		for (int k = 0; k < browsers.length; k++) {
			System.out.println(browsers[k]);
//				if(browsers[k].equals("IE")) {
//					System.out.println("this is deprecated");
//				}

			switch (browsers[k]) {
			case "chrome":
				System.out.println("google");
				break;
			case "firefox":
				System.out.println("mozilla");
				break;

			default:
				break;
			}
		}

		//

		int ar[] = new int[4];
		ar[0] = 100;
		// ar[4] = 200;//ArrayIndexOutOfBoundsException
		System.out.println(ar[4]);

		// amazon -- sept 2023 -- [1000] -- 1 hr
		// oct -- 25, left=25
		// nov ---1000
		// dec -- 5000
		// 25th -- 100000
		// uber
		// 5 PM [100] --> [1000]

	}

}
