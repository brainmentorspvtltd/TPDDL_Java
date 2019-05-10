class M{
	int x, y;
}
class N extends M{
	int z;
}
class NN {
	
}
class Y1{
	int x= 100;
	 protected M show() {
		System.out.println("Y1 Show");
		return new M();
	}
	static void print() {
		System.out.println("Y1 Print");
	}
}
class Y2 extends Y1{
	int x = 200;
	@Override
	public N show() {
		System.out.println("Y2 Show");
		return new N();
	}
	//@Override
	static void print() {
		System.out.println("Y2 Print");
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y1 obj = new Y2();
		obj.show();
		System.out.println(obj.x);
		obj.print();

	}

}
