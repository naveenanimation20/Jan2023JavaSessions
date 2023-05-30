package javasessions;

public class Customer {

	String name;
	int age;
	double salary;
	char gender;
	boolean isActive;
	String dob;
	

	public static void main(String[] args) {

		Customer c1 = new Customer();
		System.out.println(c1.name);
		System.out.println(c1.age);
		System.out.println(c1.salary);
		System.out.println(c1.gender);// '\u0000' -unicode value
		System.out.println(c1.isActive);
		System.out.println(c1.dob);
		
		c1.name = "Tom";
		System.out.println(c1.name);
		
		Customer c2 = new Customer();

		Customer c3 = new Customer(); //object with ref
		
		new Customer().name = "Peter"; //no ref
		new Customer().age = 30;
		
		Customer c4;//just a ref without object
		
		Customer c5 = new Customer();
		c5 = null; //nul ref

		//call gc:
		//System.gc(); //is not recommended...not a good practice
		
		
		Customer c6 = new Customer();
		Customer c7 = new Customer();
		c6  = c7;
		
		Customer c8;
		c8 = new Customer();


	}

}
