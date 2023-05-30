package ConstructorsConcept;

public class Employee {

	String name;
	int age;
	double salary;
	
	//Constructor...
	//name is as same as the class name
	//can not have any return value/void
	//no return type
	//const.. will be called when you create the object
	//const.. will be overloaded
	public Employee() { //0 param
		System.out.println("default const...");
		
	}
	
	public Employee(int i) { //1 param
		System.out.println("1 param const..." + i);
	}
	
	public Employee(int i, String p) { //2 params
		System.out.println("2 params const..." + i + p);
	}
	
	public void test() {
		return;
	}
	
	public int testing(int a , int b) {
		System.out.println("bye");
		int z = 90;
		int t = 80;
		return z+t+a;
	}
	

	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		Employee obj = new Employee();
		obj.name = "tom";
		obj.age = 20;
		obj.salary = 12.33;
		
		Employee obj1 = new Employee(10);
		Employee obj2 = new Employee(20, "Testing");


		
		
		
		

	}

}
