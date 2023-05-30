package ConstCalling;

public class Employee {

	String name;
	int age;
	String city;

	public Employee() {
		this("Ravi", 20);
		System.out.println("Hi Emp");

	}

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Employee(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Employee(String name) {
		// this("Naveen", 50, "LA");
		this();
		this.name = name;
		this.age = 60;
		this.city = "Bangalore";

	}

}
