package exceptionhandlingdemo;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Demo1 {
	static Scanner scanner =new Scanner(System.in);
	static int firstNumber ;
	static int secondNumber ;
	static int result;
	static void takeFirstNumber() {
		try {
		System.out.println("Enter the First Number");
		 firstNumber = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Only Number Allowed U type something else");
			scanner.nextLine();
			takeFirstNumber();
		}
		
		
	}
	
	static void takeSecondNumber() {
		try {
		System.out.println("Enter the Second Number");
		 secondNumber = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Only Number Allowed U type something else");
			scanner.nextLine();
			takeSecondNumber();
		}
		
		
	}
	static void divide() {
		try {
		result = firstNumber / secondNumber; // throw new ArithmeticException()
		}
		catch(ArithmeticException e) {
			System.out.println("U Divide a Number with Zero ");
			takeSecondNumber();
			divide();
		}
	}
	static void print() {
		System.out.println("Result is "+result);
		scanner.close();
	}

	public static void main(String[] args) {
		
		takeFirstNumber();
		takeSecondNumber();
		divide();
		print();
		
		

	}

}
