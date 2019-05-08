class A1 extends Object{
	int x;
	static A1 a;
	A1(){
		x= 200;
		System.out.println("A1 Cons Call");
	}
	@Override
	protected void finalize() {
		a = this;
		System.out.println("Good Bye...");
	}
}
public class GCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj = new A1();
		obj.x++;
		System.out.println(obj.x);
		obj = null;
		System.gc();
		for(int i = 1; i<=10; i++) {
			System.out.println("I is "+i);
		}
		if(A1.a!=null) {
			System.out.println(A1.a.x);
		}
		

	}

}
