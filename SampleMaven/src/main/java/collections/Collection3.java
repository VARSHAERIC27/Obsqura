package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList  <Integer> l3 = new ArrayList<Integer>();
		l3.add(12);
		l3.add(13);
		l3.add(14);
		System.out.println(l3);
		ArrayList  <Character> l4 = new ArrayList<Character>();
		l4.add('a');
		l4.add('b');
		l4.add('c');
		l4.add('a');
		System.out.println(l4);

		l4.add(null);
		l4.add(null);
		l4.add(null);
		l4.add(null);

		System.out.println(l4);
		
		ArrayList  <Float> l5 = new ArrayList<Float>();
		l5.add(12.12f);
		l5.add(13.13f);
		l5.add(14.78f);
		System.out.println(l5);
		
		
		
		
		System.out.println("list using for each loop");

		for(int i:l3 ) {
			System.out.println(i);

		}
		
		
		
		System.out.println("list using Iterator");
Iterator<Integer> it=l3.iterator();
while(it.hasNext()) {
	System.out.println(it.next());

}
it.remove();
System.out.println(l3);


//Collections.sort(l3);
//System.out.println(l3);
l3.add(24);
l3.add(76);
l3.add(17);

Collections.sort(l3);
System.out.println(l3);


		

		


		

	}

}
