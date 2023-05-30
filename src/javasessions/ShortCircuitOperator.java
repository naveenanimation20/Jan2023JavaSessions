package javasessions;

public class ShortCircuitOperator {

	public static void main(String[] args) {

		
		int a = -100;
		int b = -600;
		int c = -1200;
		
		//&& short circuit operator
		
		if(a>b && a>c) { //false & false = false
			System.out.println("a is greatest");
		}
		else if(b>c) { //true
			System.out.println("b is greatest");
		}
		else {
			System.out.println("c is greatest");
		}
		
		
		
		
	}

}
