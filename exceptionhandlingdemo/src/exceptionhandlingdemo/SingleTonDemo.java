package exceptionhandlingdemo;

import org.apache.log4j.Logger;

class A2{
	void print() {
		System.out.println("I am Print");
	}
	void show() {
		System.out.println("I am Show");
	}
}

class Singleton{
	//private static Singleton obj;
	private static Singleton obj = new Singleton();  // During Class Load 
	// Eager Singleton
	private Singleton() {
		
	}
	public   static Singleton getInstance() {
		return obj;
	}
	// Lazy Singleton
	//public synchronized  static Singleton getInstance() {
//	public   static Singleton getInstance() {
//		synchronized(Singleton.class) {
//		if(obj==null) {
//			obj=  new Singleton();
//		}
//		}
//		return obj;
//	}
}

public class SingleTonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton s = new Singleton();
		//Runtime r  = Runtime.getRuntime(); // Eager Singleton
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s == s2);
		Logger l = Logger.getLogger(Singleton.class);
		A2 obj = new A2() {
			@Override
			void print() {
				super.print();
				System.out.println("I am Print2...");
				this.display();
			}
			void display() {
				System.out.println("Display Call");
			}
		};
		obj.print();
		obj.show();
		
//		A2 obj2 = new A2() {
//			@Override
//			void print() {
//				super.print();
//				System.out.println("I am Print2...");
//				this.display();
//			}
//			void display() {
//				System.out.println("Display Call");
//			}
//		};
//		obj2.print();
//		obj2.show();

	}

}
