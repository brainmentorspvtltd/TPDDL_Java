package test;
import java.util.Scanner;

import functionality.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Id ");
		int id = scanner.nextInt();
		System.out.println("Enter the Name");
		String name = scanner.next();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		Employee ram = new Employee(id, name, salary);
		System.out.println(ram);
		scanner.close();
	}

}
