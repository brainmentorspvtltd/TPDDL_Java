package functionality;
import utils.Format;

public class Employee {
	private int id;
	private String name;
	private double salary;
	Format format;
	public Employee(int id , String name, double salary){
			this.id = id;
			this.name = name;
			this.salary = salary;
			//format = new Format();
	}
	
	
	public int getId() {
		return id;
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


	private double hra() {
		return this.salary * 0.30;
	}
	private double da() {
		return this.salary * 0.20;
	}
	private double ta() {
		return this.salary * 0.10;
	}
	private double pf() {
		return this.salary * 0.05;
	}
	private double gs() {
		return this.salary + hra() + da() + ta() -pf();
	}
	private double ns() {
		return this.gs() - (this.gs() * this.tax());
	}
	private double tax() {
		double gs = this.gs();
		if(gs>=300000 && gs<500000) {
			return 0.10;
		}
		else
		if(gs>=500000 && gs<800000) {
			return 0.20;
		}
		else
		if(gs>=800000 ) {
			return 0.30;
		}
		return 0.0;
	}
	
	
	@Override
	public String toString() {
		return "Id "+id+ " Name "+Format.titleCase(name) + "\n "+" Date "+Format.getDate()
		+"\n "+" HRA is "+Format.formatNumber(hra())+" DA "+da()+" TA "+ta()+"\n"
		+" GS "+gs()+" Tax "+tax() + " NS "+Format.formatNumber(ns());
	}

}
