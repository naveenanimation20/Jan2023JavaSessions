package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {

		//String literals:
		String s = "Hello";
		String s1 = "Hello";
		String s2 = "hello";
		
		System.out.println(s==s1);//true
		System.out.println(s1==s2);

		//String Objects with new Keyword:
		String st = new String("Java");
		String st1 = new String("Hello");

		System.out.println(s == st1);//false
		System.out.println(s.equals(st1));//true
		
		String st2 = new String("Hello");

		String test = new String("Selenium");//1 --- > HEAP
		test.intern();//1 ---> SCP
		String t1 = "Selenium";//0
		
		//total objs = 2
		
		String st4 = new String();
		System.out.println(st4.length());
		
		
		int i = 10;
		int j = 10;
		int k = 10;
		
	

		
	}

}
