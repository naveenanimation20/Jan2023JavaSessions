package BuilderPattern;

public class AmazonShop {

	public static void main(String[] args) {

		Shopping shop = new Shopping();
		
		
		//sc1:
		shop.login("noman@gmail.com", "noman@123")
				.search("Tshirt")
					.addToCart("Tshirt")
						.doPayment("1212 1212 1212 1212", 123)
							.generateOrder()
								.logout();
		
		System.out.println("----");
		//sc2:
		shop.login("noman@gmail.com", "noman@123")
						.search("macbook")
							.addToCart("macbook")
								.logout();
		
		System.out.println("----");

		//sc3:
		shop.login("noman@gmail.com", "noman@123")
							.doPayment("1212 1212 1212 1212", 123)
										.generateOrder()
												.logout();
		
		System.out.println("----");

		//sc4:
		shop.login("noman@gmail.com", "noman@123").logout();
		
		System.out.println("----");

		
		//sc5:
		shop.login("noman@gmail.com", "noman@123")
					.logout()
							.login("noman@gmail.com", "noman@123");

		
	}

}
