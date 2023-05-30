package OOP_Inheritance;

public class Car extends Vehicle{
	
	//final:
	//is used to prevent inheritance
	//is used to prevent method overridding
	//to use for constant values
	
	
	
	public final void service() {
		System.out.println("Car service");
	}

	public void start() {
		System.out.println("car -- start");		
	}

	public void stop() {
		System.out.println("car -- stop");
	}

	public void refuel() {
		System.out.println("car -- refuel");
	}
	
	@Override
	public void pertorlEngine() {
		System.out.println("Car -- pertrol engine");
	}
	
	
	public static void billing() {
		System.out.println("car - billing");
	}
	
	private void pickColor() {
		System.out.println("Car -- pick color");
	}
	
	
	
	public void test(int i, String j) {
		
	}

}
