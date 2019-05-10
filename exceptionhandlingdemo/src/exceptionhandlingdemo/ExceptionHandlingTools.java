package exceptionhandlingdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Flow{
	void db2() throws FileNotFoundException  {
		FileInputStream fs = new FileInputStream("");
	}
	void db() throws NullPointerException{
		try {
		System.out.println("Open DB Connection");
		String s = null;
		s.length();
		if(10>2) {
			System.out.println("I am Here %%%%%%%%%%%%%%%%%%%%%%%");
			//System.exit(0);
			return ;
		}
//		if(10>2) {
//		throw new NullPointerException();
//		}
		//s.length(); // throw new NullPointorException();
		//int y [] =new int[5];
		//y[100] = 100;
		//int x = 100/0;
		System.out.println("Query and Get Data");
		}
		finally {
		System.out.println("Close DB Connection");
		}
		
	}
	void logic() throws NullPointerException, FileNotFoundException {
		System.out.println("Rec View Input and Call DB");
		db();
		db2();
		System.out.println("Get DB Data and give to View");
	}
	void view() {
		System.out.println("Load Screen");
		System.out.println("Input and Call Logic");
		try {
		logic();
		System.out.println("Get Logic data and print");
		}
		catch(FileNotFoundException e) {
			
		}
		catch(NullPointerException e) {
			System.out.println("****************Something went wrong ");
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
public class ExceptionHandlingTools {
public static void main(String[] args) {
		new Flow().view();

	}

}
