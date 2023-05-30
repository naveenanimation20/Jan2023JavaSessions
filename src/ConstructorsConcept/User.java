package ConstructorsConcept;

public class User {

	String firstName;
	String lastName;
	String emailId;
	String phone;
	String password;
	String city;

	// AC: PO
	// user can be created if you have :
	// FN, LN
	// FN, LN, emailId
	// FN
	// FN, LN, passowrd, phone
	// FN,LN,emailid, phone, passowrd, city

	// method: int taxCal(name) -- buss logic
	// const: no buss logic -- only for object creation - restriction of object
	// creation
	// - to initiliaze the class vars with the initial values
	

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public User(String firstName, String lastName, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public User(String firstName) {
		this.firstName = firstName;
	}

	public User(String firstName, String lastName, String password, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.phone = phone;
	}

	public User(String firstName, String lastName, String emailId, String phone, String password, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.password = password;
		this.city = city;
	}
	
	
	
	public void getInfo() {
		System.out.println("get info");
	}
	
	public void getInfo(int i) {
		System.out.println("get info" + i);
		
	}
	
	//static: class name
	//NS: object ref name
	//const: when we create the object
	
	
	

	public static void main(String[] args) {

		User u1 = new User("Ankit");
		System.out.println(u1.firstName + " " + u1.lastName);
		u1.lastName = "Agarwal";
		System.out.println(u1.firstName + " " + u1.lastName);

		User u2 = new User("Mahesh", "Kumar", "mahesh@gmail.com", "9898989898", "mahesh@123", "Bangalore");
		System.out.println(u2.firstName + " " + u2.lastName + " " + u2.emailId + " " + u2.phone + " " + u2.password
				+ " " + u2.city);

		System.out.println(u2.phone);
		u2.city = "Pune";
		u2.phone = "9876543456";
		u2.password = "mahesh@456";

		System.out.println(u2.firstName + " " + u2.lastName + " " + u2.emailId + " " + u2.phone + " " + u2.password
				+ " " + u2.city);

		
		
	}

}
