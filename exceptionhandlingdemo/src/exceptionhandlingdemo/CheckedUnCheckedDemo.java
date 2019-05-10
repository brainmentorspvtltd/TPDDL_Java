package exceptionhandlingdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
// FileNotFoundException
public class CheckedUnCheckedDemo {
	static void autoClose() throws FileNotFoundException, IOException {
		// try with resource
		try(FileInputStream fi2 = new FileInputStream("")){
			try(FileOutputStream fi3 = new FileOutputStream("")){
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		FileInputStream fi ;
//		try {
//			fi = new FileInputStream("");
//		}
//		finally {
//			if(fi!=null) {
//				fi.close();
//			}
//		}
		
		
		try {
			
		}
		catch(NullPointerException|InputMismatchException e) {
			System.out.println("U r Value is Null");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of range");
		}
		catch(ArithmeticException e) {
			System.out.println("U divide a no with zero");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		
		
		
		int e1 = 100/0;
		try {
			FileInputStream fi= new FileInputStream("c:\\xyz.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
