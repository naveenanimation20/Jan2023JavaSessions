package javasessions;

public class Order {
	
	

	public int getOrder(String customerName, int price, int tax) {
		// buss logic:
		System.out.println(customerName);
		int k = price + tax;
		return k;

	}

	public int getOrder(String customerName, int price) {
		// buss logic:
		System.out.println(customerName);
		int k = price;
		return k;

	}

	public static void main(String[] args) {

		Order obj = new Order();
		int p = obj.getOrder("Deepa", 1000, 30);
		System.out.println(p);
		
		int f = obj.getOrder("Naveen", 4000);
		System.out.println(f);

	}

}
