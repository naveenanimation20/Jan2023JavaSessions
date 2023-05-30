package ExceptionHandling;

public class TryCatchBlock {

	int age;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		TryCatchBlock obj = new TryCatchBlock();
		obj = null;

		try {
			obj.age = 20;// NPE
		} catch (NullPointerException e) {
			System.out.println("NPE is coming....");
			e.printStackTrace();
		}

		try {
			int i = 9 / 0;
			System.out.println("hello");
			System.out.println("hello");
			System.out.println("hello");
		} catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			e.printStackTrace();
		}

		System.out.println("Bye");

	}

}
