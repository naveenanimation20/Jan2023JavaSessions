package ExceptionHandling;

public class Student {

	public static int getMarks(String name) {

		System.out.println("getting marks for : " + name);

		if (name.equals("suchi")) {
			try {
				int i = 9 / 0;
				return 90;
			} catch (ArithmeticException e) {
				System.out.println("AE is coming");
				//System.exit(1);
				return 80;
			}
			finally {
				System.out.println("final marks");
				return 50;
			}
		} 
		
		else if (name.equals("Abhi")) {
			return 90;
		} else if (name.equals("riya")) {
			return 80;
		} else {
			System.out.println("student not found..");
			throw new MyException("studentnotfoundexception");
		}

	}

	public static void main(String[] args) {
		int m = getMarks("suchi");
		System.out.println(m);
		
		
	}

}
