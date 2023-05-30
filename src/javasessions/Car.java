package javasessions;

public class Car {
	
	//Employee class
	//10 vars
	//print default values
	//3 objects
	//2 vars -- static
	

	//class vars:
	String name;
	String color;
	int price;

	static final int wheels = 4;

	// static is the common prop for all the objects
	// but obj will not hold the static property
	// static var will be stored in CMA
	// and it will create only one copy for all the objects

	public static void main(String[] args) {
		
		final int i = 10; //local var

		Car c1 = new Car();
		c1.name = "BMW";
		c1.color = "White";
		c1.price = 80;

		// how to access static var:
		// using the class name:

		System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + Car.wheels);
		System.out.println(c1.wheels);// not a right way of calling static var using the ref name
		System.out.println(wheels);
		System.out.println(c1.name);

		Car c2 = new Car();
		c2.name = "Audi";
		c2.color = "Red";
		c2.price = 70;

		System.out.println(c2.name + " " + c2.color + " " + c2.price + " " + Car.wheels);

		Car c3 = new Car();
		c3.name = "Honda";
		c3.color = "Black";
		c3.price = 20;

		System.out.println(c3.name + " " + c3.color + " " + c3.price + " " + Car.wheels);

	}

}
