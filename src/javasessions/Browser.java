package javasessions;

import java.util.ArrayList;

public class Browser {

	String name;
	String logo;
	double version;
	static final String lang = "JS";

	public static void main(String[] args) {

		Browser b1 = new Browser();
		b1.name = "chrome";
		b1.logo = "google";
		b1.version = 104.90;

		Browser b2 = new Browser();

		Browser b3 = new Browser();

		Browser b4 = new Browser();

		// How do we get the position of a particular element in an ArrayList?
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("apple");
		ar.add("banana");
		ar.add("orange");
		int i = ar.indexOf("banana");
		System.out.println(i);

		//
		ArrayList<String> studentNames1 = new ArrayList<String>();
		studentNames1.add(0, "fox");
		studentNames1.add(1, "Sheep");
		studentNames1.add(2, "Dog");
		studentNames1.add(3, "Aligator");
		System.out.println(studentNames1.size());
		// How to shrink the size of arrayList. I couldn't stink it

		studentNames1.remove(1);
		System.out.println(studentNames1.size());

		//

		ArrayList<String> namesList = new ArrayList<String>(20);//vc = 20
		namesList.add("naveen");
		namesList.add("ravi");
		namesList.add("peter");
		namesList.add("lisa");		
		
		//namesList.clear();
		namesList.remove(1);
		System.out.println(namesList);
		
		
		//1.0 2.0 3.0 .....10.0
		for(double d=1.0; d<=10.0; d++) {
			System.out.println(d);//1.0 
		}
		
//		9. Print the following series: 
//
//		1.0 2.0 3.0  ...... 10.0 
//
//		0 9 18 27 36 …99
//
//		Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
//
//		Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		
		
		for(int i1=0; i1<=99; i1=i1+9) {
			System.out.println(i1);
		}
		
		for(int k=1; k<=100; k++) {
			System.out.println(k);
				if(k % 7 == 0) {
					System.out.println("bye, see you tomorrow");
					//break;
				}
		}
		
		

	}

}
