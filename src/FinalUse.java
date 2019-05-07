//final class P{
class P{
	
	private final void print() {
		System.out.println("I am P Print");
	}
}
class Ch extends P{
	final int MAX ;
	int x=100;
	int y= 200;
	Ch(){
		MAX = 100;
	}
	//@Override
	void print() {
		System.out.println("Ch Print");
	}
//	void show() {
//		MAX =200;
//	}
}
/*
class AmitString extends String{
	
}
class MyOutput extends System{
	
}*/
public class FinalUse {
int m = 2000; // Instance Var
	public static void main(String[] args) {
		int m = 1000; // Local Var
		// TODO Auto-generated method stub
		final int MAX = 100;
		//new Ch().print();
		final Ch ch = new Ch();
		ch.x++;
		ch.y++;
		System.out.println(ch.x+" "+ch.y);
		//ch = new Ch();
		//MAX++;

	}

}
