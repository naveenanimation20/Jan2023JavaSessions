package javasessions;

public class PolymorphismConcept {

	public void search() {

	}

	public void search(String productName) {
		System.out.println(productName);
	}

	public void search(String productName, int price) {
		System.out.println(productName + " " + price);
	}

	public static void main(String[] args) {

		// Poly(many) + morphism(forms)
		// Method Overloading : compile time (static binding) : compiler has already taken a decision that
		//which mehtod has to be called on the basis of given value.
		
		PolymorphismConcept obj = new PolymorphismConcept();
		obj.search("macbook");
		obj.search("imac", 1000);
				

		// Method Overriding: Run Time (Dynamic binding) 

	}

}
