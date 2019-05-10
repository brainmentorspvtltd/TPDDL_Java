package exceptionhandlingdemo;

import java.util.Scanner;
// Checked
//class OutofStockException extends Exception{
class OutofStockException extends RuntimeException{
	int errorCode;
	String msg ;
	OutofStockException(){
		errorCode = 100;
		msg = "";
	}
	OutofStockException(String msg){
		this();
		this.msg = msg;
	}
	@Override
	public String toString() {
		return msg.trim().length()==0?"Out of Stock ER-"+errorCode:msg+" ER-"+errorCode;
	}
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qt = 50;
		System.out.println("Enter the Qt to Buy");
		int buy = new Scanner(System.in).nextInt();
		try {
		if(buy>qt) {
			// Failure
			throw new OutofStockException("Check Stock Not There"); // Explicit throw
		}
			// Success
			System.out.println("Ask for Payment");
			System.out.println("Ask for Address");
		}
		catch(OutofStockException e) {
			System.out.println(e);
		}
		

	}

}
