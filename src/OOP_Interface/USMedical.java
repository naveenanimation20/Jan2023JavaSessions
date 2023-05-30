package OOP_Interface;

public interface USMedical extends WHO {
	
	//static and final in nature(by default)
	int min_fee = 10;
	boolean isApproved = true;

	// abstract method:
	// no method body
	// only method declaration/method prototype/no buss logic
	// can not create the object of interface
	// can not create the const... of the interface

	// abstract methods: 100% abstraction -- OOP
	public void physioService();

	public void cardioService();

	public void dentalService();

	public void emergencyService();
	
	

	// after jdk 1.8:
	// 1. we can have static method with method body:
	public static void billing() {
		System.out.println("US Medical -- billing");
	}
	
	//2. default method with method body:
	default void medicalTest() {
		System.out.println("US medical test");
	}
	
	default void medicalReport() {
		System.out.println("US medical report");
	}
	
	

}
