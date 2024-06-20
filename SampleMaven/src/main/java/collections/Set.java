package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet  <String> ab = new HashSet<String>();// generic
		ab.add("blue");
		ab.add("white");
		ab.add("green");
		ab.add("black");
		System.out.println(ab);
		
		HashSet  ba = new HashSet(); //non generic
		ba.add("pink");
		ba.add("red");
		ba.add("gray");
		System.out.println(ba);
		ab.remove("blue");
		ba.remove("red");
		System.out.println(ab);
		System.out.println(ba);
		ab.add("white");
		ab.add(null);
		ab.add(null);
		System.out.println(ab);
		ab.addAll(ba);
		System.out.println(ab);
		ab.removeAll(ba);
		System.out.println(ab);
		for(String i:ab ) {
			System.out.println(i);

		}
		for(String i:ab ) {
			System.out.println(i);

		}
		Iterator<String> it=ab.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());

		}
		it.remove();
		System.out.println(ab);
		//ab.size();
		System.out.println(ab.size());




		

	}

}
