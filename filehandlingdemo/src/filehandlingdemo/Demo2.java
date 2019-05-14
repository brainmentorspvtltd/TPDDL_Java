package filehandlingdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id ;
	private String name;
	private double salary;
	private double bonus;
	private transient double hra;
	public Employee() {
		bonus = 900;
		hra = 100;
	}
	public Employee(int id , String name) {
		this.id = id;
		this.name = name;
	}
	public Employee(int id , String name,double salary) {
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Id "+id+" Name "+name+" salary is "+salary+" Bonus "+bonus + "HRA "+hra ;
	}
}
public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee ram = new Employee(1001, "Ram",9000);
		FileOutputStream fo = 
				new FileOutputStream("/Users/amit/Documents/testfile/emp.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(ram);
		os.close();
		fo.close();
		System.out.println("Object Store in a file...");

	}

}
