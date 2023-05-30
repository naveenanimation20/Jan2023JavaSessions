package javasessions;

public class Assignment {

	public static void main(String[] args) {
		

		//
		int a =1;
		int b = a++ + ++a * --a - a--; // a = 1 , b
			//  1	+ 3   * 2   - 2 => 1+6-2 = 5
		System.out.println(b);
		
		
		
		
		//
		int m = 0, n = 0;
		int p = --m * --n * n-- * m--; //m = -2, n =-2, p =?
			//  -1  * -1  * -1  * -1 ==> 1
				
		System.out.println(p);
		System.out.println(m);
		System.out.println(n);
		
		
		
		
		//
		int i=19, j=29;
		int k =  i-- - i++ + --j - ++j + --i - j-- + ++i - j++; //i=19 , j=29, k=?
		      // 19  - 18  + 28  - 29  + 18  - 29  + 19  - 28 = -20
		
		System.out.println("i="+i);//19
		System.out.println("j="+j);//29
		System.out.println("k="+k);//-20
		
		
		char t = 'A';//65
		System.out.println((int)++t);//t = 66 - B
		
		
		
		int num = 0;
		if(num>=0) {
			System.out.println("+ve");
		}
		else {
			System.out.println("-ve");
		}
		
		int test = 0;
		if(test % 2 == 0 ) {
			System.out.println(test + " : even number");
		}
		else {
			System.out.println(test + " : odd number");
		}
		
		
	}

}
