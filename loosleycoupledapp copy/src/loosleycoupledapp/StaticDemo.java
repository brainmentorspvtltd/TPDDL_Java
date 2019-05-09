package loosleycoupledapp;
import static java.lang.System.out;
import static java.lang.System.exit;
class User{
	static int counter;
	int counter2;
	 String userid;
	 String password;
	 static {
		 System.out.println("I will run when class is loaded");
		 counter = 1000;
	 }
	User(){
		counter++;
		counter2++;
		System.out.println("Counter "+counter
				+" Counter2 "+counter2);
	}
}
// Utility Interface
interface IMathClass{
	static int MAX= 100000;
	static void power(int x , int p) {
		int result=0;
		if(result<MAX) {
			
		}
	}
	static void cube(int x) {
		
	}
	static void sqrt(int x) {
		
	}
}
// Utility Class
final class MathClass{
	static int MAX= 100000;
	private MathClass() {}
	static void power(int x , int p) {
		int result=0;
		if(result<MAX) {
			
		}
	}
	static void cube(int x) {
		
	}
	static void sqrt(int x) {
		
	}
}
public class StaticDemo {
	static {
		out.println("Run with out main");
		exit(0);
	}
	//java StaticDemo
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MathClass m = new MathClass();
		//m.cube(3);
		MathClass.cube(2);
		User user = new User();
		User user2 = new User();
		User user3 = new User();

	}
	
	void print() {
		int x;
		//x++;
	}

}
