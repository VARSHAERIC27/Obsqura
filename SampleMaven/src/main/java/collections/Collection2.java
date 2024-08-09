package collections;

import java.util.ArrayList;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" generic collection");
		ArrayList  <String> l2 = new ArrayList<String>();
		l2.add("green");
		l2.add("red");
		l2.add("black");
		System.out.println(l2);
		System.out.println(l2.contains("red"));
		l2.add(1, "white");
		System.out.println(l2);
		ArrayList  <String> l3 = new ArrayList<String>();
		l3.add("pink");
		l3.add("gray");
		l3.add("blue");
		l3.add("green");
		
		l2.addAll(l3);
		
		System.out.println(l2);
		l2.removeAll(l3);
		System.out.println(l2);
		
		
		
		
System.out.println(l2.get(1));
l2.set(0, "blue");
System.out.println(l2);
for(int i=0;i<l2.size();i++) {
	System.out.println(l2.get(i));

}



	}

}
