package collections;

import java.util.ArrayList;
import java.util.Scanner;



class Customer{
	private int id;
	private String name;
	private double balance;
	@Override
	public boolean equals(Object object) {
		boolean isMatch = false;
		if(object instanceof Customer) {
			Customer customer = (Customer) object;
			if(this.id == customer.id) {
				return true;
			}
		}
		return isMatch;
	}
	public Customer() {}
	public Customer(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Id "+id+" Name "+name+" Balance "+balance+"\n";
	}
	
}
interface CustomerOperations{
	ArrayList<Customer> customerList = new ArrayList<>();
	public static void add(int id, String name, double balance) {
		Customer customer = new Customer(id , name, balance);
		customerList.add(customer);
		print();
	}
	public static void delete(int id) {
		int index = search2(id);
		if(index>=0) {
			customerList.remove(index);
			System.out.println("Record Deleted");
			print();
		}
		else {
			System.out.println("Record Not Found , Can't Delete");
		}
	}
	public static void print() {
		customerList.forEach(customer->System.out.println(customer));
	}
	public static String search(int id) {
		Customer customer= new Customer();
		customer.setId(id);
		return customerList.contains(customer)?"Record Found":"Not Found";
	}
	public static int search2(int id) {
		Customer customer= new Customer();
		customer.setId(id);
		return customerList.indexOf(customer);
	}
}
public class CRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("1. Add ");
			System.out.println("2. Delete");
			System.out.println("3. Search");
			System.out.println("4. Update");
			System.out.println("5. Sort By Name");
			System.out.println("6. Sort By Balance");
			System.out.println("7. Sum of All Balance > 9000");
			System.out.println("8. to Exit");
			System.out.println("Enter Choice");
			int choice = s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Id ");
				int id = s.nextInt();
				System.out.println("Enter the Name");
				String name  = s.next();
				System.out.println("Enter the Balance");
				double balance = s.nextDouble();
				CustomerOperations.add(id, name, balance);
				break;
			case 2:
				System.out.println("Enter the Id to Delete ");
				id = s.nextInt();
				CustomerOperations.delete(id);
				break;
			case 3:
				System.out.println("Enter the Id to Search ");
				 id = s.nextInt();
				 System.out.println(CustomerOperations.search(id));
				break;
			case 8:
				System.out.println("Exit....");
				return ;
			}
			
		}
	}

}
