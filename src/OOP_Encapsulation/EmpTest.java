package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {

		
		//POST - Create
		Employee e1 = new Employee("Aarush", 25, 12.33, "Pune", "India");
		
		//GET - Retrieve
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getCity());
		System.out.println(e1.getCountry());
		System.out.println(e1.getSalary());
		
		System.out.println("----------");
		//PUT - Update
		e1.setAge(26);
		e1.setSalary(20.22);
		
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getCity());
		System.out.println(e1.getCountry());
		System.out.println(e1.getSalary());
		
		
//		e1.setName("Aarush");
//		e1.setAge(25);
//		e1.setCity("Pune");
//		e1.setCountry("India");
//		e1.setSalary(12.33);
//
//		System.out.println(e1.getName());
//		System.out.println(e1.getAge());
//		System.out.println(e1.getCity());
//		System.out.println(e1.getCountry());
//		System.out.println(e1.getSalary());

	}

}
