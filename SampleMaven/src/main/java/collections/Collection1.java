package collections;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l1 = new ArrayList();
l1.add("apple");
l1.add("orange");
l1.add("grapes");
System.out.println(l1);
System.out.println(l1.size());
System.out.println(l1.isEmpty());
l1.remove(2);
System.out.println(l1);
l1.remove("apple");
System.out.println(l1);



//non generic  collection
ArrayList l2 = new ArrayList();
l2.add("red");
l2.add("orange");
l2.add("green");
l2.add(13);
l2.add('a');
System.out.println(l2);



	}

}
