package javasessions;

public class MathematicalOperations {

	public static void main(String[] args) {

		System.out.println(4/2);
		System.out.println(4+2);
		System.out.println(4-2);
		System.out.println(4*2);
		
		System.out.println(9/3);
		System.out.println(9/2);//4
		System.out.println(9.0/2);//4.5
		System.out.println(9/2.0);
		System.out.println(9.0/2.0);
		
		System.out.println((float)9/2);
		
		System.out.println(0/9);
		//System.out.println(9/0);//ArithmeticException: / by zero
		
		//System.out.println(0/0);//ArithmeticException: / by zero
		
		System.out.println(9.0/0);//Infinity
		System.out.println(9/0.0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		
		System.out.println(0.0/2.0);//0.0
		
		System.out.println((float)9/0);//Infinity
		
		System.out.println(0.0/0);//NaN
		System.out.println(0/0.0);//NaN
		System.out.println(0.0/0.0);//NaN
		
		System.out.println(9/0.0);
		
		System.out.println('a'/2);
		
		System.out.println(9 % 3);
		
		System.out.println(9 % 2);//1
		
		System.out.println(100 % 5);
		
		System.out.println(8 % 2);//0
		
		
	}

}
