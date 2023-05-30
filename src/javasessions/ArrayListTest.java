package javasessions;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);
		ar.add("testing");
		ar.add('h');
		ar.add(true);
		
		for(Object e : ar) {
			System.out.println(e);
		}
		
	}

}
