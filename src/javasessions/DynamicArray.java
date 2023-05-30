package javasessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {

		//ArrayList -- default class
		//create the object of ArrayList
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size()); //pc=0, vc=10

		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());
		
		ar.add(300);//2
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());

		System.out.println(ar.get(0));
		System.out.println(ar.get(4));
		//System.out.println(ar.get(5));//IndexOutOfBoundsException
		//System.out.println(ar.get(-1));//IndexOutOfBoundsException
		
		ar.add(600);//5
		System.out.println(ar.get(5));
		
		ar.add(12.33);
		ar.add(true);
		ar.add('m');
		ar.add("testing");
		
		System.out.println(ar.size());
		
		
		//generics in arraylist:
		ArrayList<Integer> marksList = new ArrayList<Integer>();//vc=10,pc=0
		marksList.add(100);//0
		marksList.add(200);//1
		
		//System.out.println(marksList.get(5));//IOB

		System.out.println(marksList.size());
		
		ArrayList<Double> bmiList = new ArrayList<Double>();//vc=10,pc=0
		bmiList.add(12.33);
		bmiList.add(100.00);
		
		ArrayList<String> browserList = new ArrayList<String>();//vc=10,pc=0
		browserList.add("chrome");//0
		browserList.add("firefox");//1
		browserList.add("safari");//2
		browserList.add("opera");//3
		
		System.out.println(browserList.size());//4
		
		System.out.println(browserList.get(1));
		
		System.out.println(browserList);

		//to print all the values from arraylist: for loop:
		
		for(int i=0; i<browserList.size(); i++) {
			System.out.println(browserList.get(i));
				if(browserList.get(i).equals("firefox")) {
					System.out.println("mozilla");
					break;
				}
		}
		System.out.println("------");
		//for each:
		for(String e : browserList) {
			System.out.println(e);
		}
		
		System.out.println("------");
		//emp info: name, age, salary, string, string, char, true
		ArrayList<Object> empInfoList = new ArrayList<Object>();//vc=10, pc=0
		empInfoList.add("Riya");
		empInfoList.add("Sinha");
		empInfoList.add(30);
		empInfoList.add(45.55);
		empInfoList.add("Bangalore");
		empInfoList.add('f');
		empInfoList.add(true);
		
		System.out.println(empInfoList.size());
		
		for(Object e : empInfoList) {
			System.out.println(e);
		}

		System.out.println("----");
		System.out.println(empInfoList);
		
		//
		ArrayList<Integer> numbers = new ArrayList<Integer>();//vc=10,pc=0
		numbers.add(100);//0
		numbers.add(200);//1
		numbers.add(3000);//2
		numbers.add(100);//3
		
		System.out.println(numbers);
		
		for(Integer e : numbers) {
			System.out.println(e);
				
		}
		
		//LF - load factor--> pc/2 --> size()/2
		//vc = 10, pc = 0
		//pc = 10, vc = 0, lastindex=0-9
		//LF = pc/2 --> 10/2 = 5
		//pc=15,vc=0, 0-14
		//LF=pc/2 --> 15/2 --> 7
		
		//use cases:
		//uber: carsList
		//amazon: productsList
		//usersList
		//total links --> linksList
		//total images --> imagesList
				
		
		
	}

}
