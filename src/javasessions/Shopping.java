package javasessions;

public class Shopping {

	// Method Overloading:
	// within the same class, if you have number of methods:
	// 1. with the same name
	// 2. with the different parameters
	// 3. with the different number of parameters
	// 4. with the different order of the parameters
	// 5. return type doesn't matter

	public void test() {
		System.out.println("test method");
	}

	public int test(double d) {
		System.out.println("test method");
		return 100;
	}

	public void test(int i) {
		System.out.println(i);
	}

	public void test(int i, int j) {
		System.out.println(i + j);
	}

	public void test(String p) {
		System.out.println(p);
	}

	public void test(String p, int q) {
		System.out.println(p + q);
	}

	public void test(int p, String q) {
		System.out.println(p + q);
	}

	// use cases real time:

	public void login() {

	}

	public void login(String un, String pwd) {

	}

	public void login(String un, String pwd, String role) {

	}

	//
	public void search() {

	}

	public void search(String productName) {

	}

	public void search(String productName, int price) {

	}

	public void search(String productName, int price, String color) {

	}

	// payment: feature using upi, cc, dc, paypal, stripe.
	//--> method --> 
	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv) {

	}
	
	public void doPayment(int cvv, String dc) {

	}
	

	public void doPayment(String paypal, String pwd, int otp) {

	}
	
	public void doPayment(String stripeId, int otp, String key) {
		
	}

	// uber: booking:
	public void booking(String carType, String fromLocation, String tolocation) {

	}

	public void booking(String carType, String fromLocation, String tolocation, int pssngers) {

	}

	public void booking(String carType, String fromLocation, String tolocation, int pssngers, String paymentOption) {

	}

	public static void main(String[] args) {
		
		Shopping shop = new Shopping();
		shop.login("naveen", "naveen123");
				
	}

}
