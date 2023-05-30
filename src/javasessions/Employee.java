package javasessions;

public class Employee {
	
	//class variables -- class data member
	String name;
	int age;
	String city;

	public static void main(String[] args) {

		//String name = "Naveen"; //local variable
		
		//class -- template/blueprint of the object/category of the object
		//Object -- is a physical entity
		
		//object of the class: new keyword
		Employee obj = new Employee();
		obj.name = "Tom";
		obj.age = 20;
		obj.city = "LA";
		System.out.println(obj.name + " " + obj.age + " " + obj.city);
		
		//
		Employee obj1 = new Employee();
		
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.city);
		
		obj1.name = "Naveen";
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.city);


		//No reference objects -- not recommended
		new Employee().name = "Peter";
		new Employee().age = 30;
		new Employee().city = "Pune";


		
		
		
		
		
	}

}
