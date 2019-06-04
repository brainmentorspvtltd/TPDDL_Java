package collections;

import java.util.HashMap;
import java.util.TreeSet;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,TreeSet<Integer>> phoneMap = new HashMap<>();
		TreeSet<Integer> l = new TreeSet<>();
		l.add(10000);
		l.add(20000);
		l.add(10000);
		phoneMap.put("amit",l);
//		phoneMap.put("ram",2111);
//		phoneMap.put("amit",3111);
		System.out.println(phoneMap);
		System.out.println(phoneMap.get("amit"));
		

	}

}
