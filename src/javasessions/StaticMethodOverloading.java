package javasessions;

public class StaticMethodOverloading {

	public static void login() {
		
		int []i;

	}

	public static void login(int i) {

	}

	public static void login(int i, int j) {

	}

	public static void main(String naveen[]) {
		System.out.println("main method");
		
		StaticMethodOverloading.main(10);
		StaticMethodOverloading.main(20, 30);
		
		StaticMethodOverloading obj = new StaticMethodOverloading();
		obj.main(10, 12.33);
		
		//src code (.java) -compiler Time -> .class (decision of method calling) ---> JVM --> Run it --> machine code (OS) 
		
	}

	public void main(int a, double b) {
		System.out.println("main method" + a+b);
	}
	
	public static void main(int a) {
		System.out.println("main method" + a);

	}
	
	public static void main(int a[]) {
		System.out.println("main method" + a);

	}
	
	public static void main(String a[], int b) {
		System.out.println("main method" + a);

	}
	
	public static void main() {
		System.out.println("main method without any value");

	}
	
	public static void main(int a, int b) {
		System.out.println("main method" + a + b);

	}
	
	

}
