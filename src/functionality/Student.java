package functionality;

// Functionality
public class Student extends java.lang.Object {
	
	private int rollno; // Instance Variable
	private String name;
	private String course;
	private double fees;
	
//	// Default Constructor
//	public Student() {
//		
//	}
	//Constructor Overloading
	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	public Student(int rollno, String name, String course, double fees) {
		if(rollno<=0 || fees<=0) {
			System.out.println("Invalid Data");
			return ;
		}
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.fees= fees;
	}
	
//	public void setFees(double fees) {
//		this.fees = fees;
//	}
//	public double getFees() {
//		return fees;
//	}
	
	// start with small Letter (camelCase)
//	public void takeInput(int rollno, String name, String course, double fees) {
//		if(rollno<=0 || fees<=0) {
//			System.out.println("Invalid Data");
//			return ;
//		}
//		this.rollno = rollno;
//		this.name = name;
//		this.course = course;
//		this.fees= fees;
//	}
	
	
//	@Override
//	public String toString() {
//		return "Rollno "+rollno+" Name "+
//				name+" Course "+course +" Fees "+fees;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	public int getRollno() {
		return rollno;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", course=" + course + ", fees=" + fees + "]";
	}


	public String print(String deli) {
		return "Rollno "+rollno+deli+" Name "+
				name+deli+" Course "+course +deli+" Fees "+fees;
//		System.out.println("Rollno "+this.rollno);
//		System.out.println("Name "+name);
//		System.out.println("Course "+course);
//		System.out.println("Fees "+fees);
//		System.out.println("********************************");
	}
}
