package loosleycoupledapp;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = s.nextInt();
		System.out.println("Enter the Name");
		s.nextLine();
		String name = s.nextLine();
		System.out.println("Id "+id+" name "+name);
		//s.close();
		s = new Scanner(System.in);
		System.out.println("Enter the VoteId");
		int vid = s.nextInt();
		System.out.println("VoteId "+vid);
		s.close();
		

	}

}
