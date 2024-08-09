package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l1= new ArrayList();
l1.add(12);
l1.add(14);
l1.add(15);
l1.add(17);
System.out.println(l1);
System.out.println(l1.size());
Iterator<Integer>it=l1.iterator();
while(it.hasNext()) {
	System.out.println(it.next());

}

	}

}
