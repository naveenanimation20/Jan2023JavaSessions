package ConstructorsConcept;

public class EmployeeTest {
	
	String name;
	int age;
	double salary;
	
	//hidden const/default const...
	
	public EmployeeTest(String name) {
		this.name = name;
	}
	
	public EmployeeTest(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public EmployeeTest(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	

	public static void main(String[] args) {

		
		EmployeeTest e1 = new EmployeeTest("Tom");
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		
		EmployeeTest e2 = new EmployeeTest("Abhi", 25);
		System.out.println(e2.name + " " + e2.age + " " + e2.salary);
		e2.salary = 25.55;
		System.out.println(e2.name + " " + e2.age + " " + e2.salary);
		

		EmployeeTest e3 = new EmployeeTest("Peter", 30, 10.22);
		System.out.println(e3.name + " " + e3.age + " " + e3.salary);
		
		
	}

}
