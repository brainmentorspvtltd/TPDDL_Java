package collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		Object x = 100;
		x= true;
		x = "Hello";
		x = 90.10;
//		ArrayList p = new ArrayList();
//		p.add(x);
//		p.add("abcd");
//		double ww= (Double)p.get(0);
//		String b = (String)p.get(1);
		
		// CRUD
		Vector<Integer> i = new Vector<>(100);
		//ArrayList<Integer> i = new ArrayList<>(100);
		i.add(1000);
		i.add(10); // last
		i.add(20);
		i.add(30);
		i.add(5000);
		i.add(10);
		i.add(2000);
		i.add(0, 99); // index wise
		System.out.println("After Add "+i);
		i.remove(0);
		System.out.println("After Remove "+i);
		System.out.println(i.contains(10)?"Found":"Not Found");
		System.out.println(i.indexOf(10));
		System.out.println(i.lastIndexOf(10));
		System.out.println(i.lastIndexOf(10000));
		Collections.sort(i);
		System.out.println("After Sort");
		System.out.println(i);
		// Traverse 
		for(int j = 0; j<i.size(); j++) {
			System.out.println(i.get(j));
		}
		Enumeration<Integer> ee = i.elements();
		while(ee.hasMoreElements()) {
			System.out.println(ee.nextElement());
		}
		Iterator<Integer> k = i.iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
			//k.remove();
		}
		ListIterator<Integer> k1 = i.listIterator();
		while(k1.hasNext()) {
			System.out.println(k1.next());
		}
		while(k1.hasPrevious()) {
			System.out.println(k1.previous());
		}
		// 1.5
		for(Integer y : i) {
			System.out.println(y);
		}
		// 1.8
		i.forEach(e->System.out.println(e));
		
		

	}

}
