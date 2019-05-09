package loosleycoupledapp;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.charAt(0));
		System.out.println(a.concat("Xy"));
		System.out.println(a.compareTo("Hello")); // 0 , -1 , 1
		System.out.println(a.equals("Xyz"));
		System.out.println(a.equalsIgnoreCase("Hello"));
		System.out.println(a.contains("Xy"));
		System.out.println(a.startsWith("He"));
		System.out.println(a.endsWith("Xy"));
		System.out.println(a.replace('l', 'w'));
		System.out.println(a.split(" "));
		String address = "A-19, Roop Nagar, Delhi-7";
		String arr[] = address.split(",");
		// StringBuffer
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("hgfdjkgjdhfgdjfhgkjdfhgkhdfkjgkjdf");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.insert(0, "hfkdj");
		sb.delete(2, 5);
		sb.deleteCharAt(0);
		sb.reverse();
		sb.capacity();
		sb.length();
		// new capacity = old size * 2 + 2 
		// 16 Default capacity
		sb.ensureCapacity(100);
		System.out.println("Enter the Name");
		String name  = new Scanner(System.in).next();
		StringBuilder sb2 = new StringBuilder(name);
		sb2.reverse();
		System.out.println(sb2+ " "+name);
		System.out.println(sb2.length()+" "+name.length());
		if(sb2.toString().equals(name)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Same");
		}
	
	}

}
