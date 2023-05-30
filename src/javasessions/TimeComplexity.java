package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {

		int i = 1;
		System.out.println(i);// 1

		// constant time : Big O(1)

		String name = "Tom";
		System.out.println(name);// O(1)

		int n = 10; // 5 mins --> 300 secs --> 0.1 sec
		for (int p = 1; p <= n; p++) {
			System.out.println(p);
			System.out.println(p + 10);
			System.out.println(p + 10);
			System.out.println(p + 10);
			System.out.println(p + 10);
		}
		// 1 + n + n + n ==> 3n+1 --> linear equation
		// 3n+1 --> 3n --> O(n)

		// 1 to 100
		int p = 1;
		int q = 0;
		while (p <= 10) {
			System.out.println("hi");
			System.out.println(p);
			System.out.println(q);
			p++;
			q++;
		}
		// 1 + 1+ n + n + n + n + n + n => 6n+2 => 2(3n+1) => 2(3n) => 6n ==> O(n)

		System.out.println("----------");
		// nested loop:
		// 00 01 02 03 04
		// 10 11 12 13 14
		// 20 21 22 23 24
		// 30 31 32 33 34

		// nested loop:
		// m*k
		for (int m = 0; m <= 9; m++) {

			for (int k = 0; k <= 9; k++) {

				System.out.print(m + "" + k + " ");// 00 01 02 03 04
													// 10 11 12 13 14
			}
			System.out.println();
		}

		// (1+n+n+n)(1+n+n+n)==> (1+3n)(1+3n)=> 1+3n+3n+9n^2 => 9n^2+6n+1 -- Quadratic
		// 9n^2+6n => 3(3n^2+2n) ==> n^2+n ==> n(n+1)==> n^2 ==> O(n^2)

		// 000 001 002 003
		for (int m = 0; m <= 9; m++) {

			for (int k = 0; k <= 9; k++) {

				for (int d = 0; d <= 9; d++) {
					System.out.print(m + "" + k + "" + d + " ");// 00 01 02 03 04
					// 10 11 12 13 14

				}

			}
			System.out.println();
		}
		// (1+n+n+n)(1+n+n+n)(1+n+n+n) --> n^3+n^2+n+1 --cubic eq --> O(n^3)

		// BS - Binary Search:
		// n/2 n/4 n/8 n/16
		// 32 ---> 16 --> 8 --> 4 --> 2 -- 1

		// O(log n)
		// k = n/2
		// log k = log(n/2)
		// log k = log n +/- log2
		// log k = log n
		// k = log(n)

		// -128 to 127
		byte b1 = 120;
		byte b2 = 90;

		int b3 = b1 + b2; // 100
		System.out.println(b3);

		byte b4 = (byte) (b1 + b2);
		System.out.println(b4);

		int x = 100;
		int y = 200;
		int z = x + y;

//		for (byte i1 = 1; i1 <= 127; i1++) {//-128
//			System.out.println(i1);
//		}
//
//		byte bbb = (byte)128;
//		System.out.println(bbb);//-128
		
		for(char ch = '0'; ch<='9'; ch++) {
			System.out.println(ch + " = " + (byte)ch);
		}
		
		System.out.println((byte)'a');
		
		
		//
		byte t1 = 077; //octal number --> 8 --> 0 to 7 for each digit
		System.out.println(t1);
		//octal to decimal: 
		//065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 0 + 48 + 5 = 53
		
		short t2 = 07766;//4086
		System.out.println(t2);
		//07766 = (0 × 8⁴) + (7 × 8³) + (7 × 8²) + (6 × 8¹) + (6 × 8⁰) = 4086
		
	}

}
