package test;
// Unit Test
import functionality.Student;
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student student;
		String n  = new String();
		String name = new String("Amit");
		System.out.println("Name is "+name.toString()+" "+name);
		//Student ram;
		//ram = new Student();
		Student ram = new Student(1001, "Ram", "Java", 12000);
		ram.setFees(ram.getFees() + 1000);
		//System.out.println("Ram is "+ram.toString()+" "+ram);
		//System.out.println(ram.hashCode());
		//ram.print();
//		System.out.println("Rollno "+ram.rollno);
//		System.out.println("Name "+ram.name);
//		System.out.println("Course "+ram.course);
//		System.out.println("Fees "+ram.fees);
//		ram.rollno = 1001;
//		ram.name="Ram";
//		ram.course = "Java";
//		ram.fees=10000;
		
		//ram.takeInput(1001, "Ram", "Java", 12000);
		//ram.rollno=ram.rollno* -1;
		//ram.fees = ram.fees * -1;
		System.out.println(ram);
		//System.out.println(ram.print("\n"));
		
		Student shyam = new Student(1002, "Shyam", "JavaScript", 15000);
		//shyam.takeInput(1002, "Shyam", "JavaScript", 15000);
		System.out.println(shyam);
		//System.out.println(shyam.print(""));
//		shyam.rollno = 1001;
//		shyam.name="Ram";
//		shyam.course = "Java";
//		shyam.fees=10000;
//		System.out.println("Rollno "+ram.rollno);
//		System.out.println("Name "+ram.name);
//		System.out.println("Course "+ram.course);
//		System.out.println("Fees "+ram.fees);
				
		int x;
	}

}
