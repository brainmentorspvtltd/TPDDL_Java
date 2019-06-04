package collections;

import java.util.HashSet;

// HashTree
class Employee {
	private int id;
	private String name;
	private double salary;
	
	@Override
	public boolean equals(Object object) {
		if(this==object) {
			return true;
		}
		if(object instanceof Employee) {
			Employee emp = (Employee) object;
			if(this.id==emp.id && this.name.equals(emp.name) 
					&& this.salary==emp.salary) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return name.length() ;
	}
	
	public Employee() {
		
	}
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class SetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeSet<Employee> empSet = new TreeSet<>();
//		TreeSet<Employee> empSet = new TreeSet<>((first,second)->first.getName()
//				.compareToIgnoreCase(second.getName()));
		HashSet<Employee> empSet = new HashSet<>();
		Employee ram = new Employee(1001,"Ram",9999);
		empSet.add(ram);
		System.out.println(ram.hashCode());
		Employee shyam = new Employee(1002,"Shyam",9999);
		empSet.add(shyam);
		System.out.println(shyam.hashCode());
		 ram = new Employee(1001,"Ram",9999);
		 System.out.println(ram.hashCode());
		empSet.add(ram);
		 shyam = new Employee(1002,"Shyam",9999);
		 System.out.println(shyam.hashCode());
		empSet.add(shyam);
		
		 shyam = new Employee(1002,"Shyam",9999);
		 System.out.println(shyam.hashCode());
		empSet.add(shyam);
		System.out.println(empSet);

	}

}
