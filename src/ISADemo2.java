class A{
	
	A(){
		System.out.println("A Cons Call");
	}
	A(int x){
		this();
		System.out.println("A Param Call");
	}
}
class B extends A{
	B(){
		super(20);
		System.out.println("B Cons Call");
	}
	B(int x){
		this();
		System.out.println("B Param Cons call");
	}
}
class C extends B{
	C(){
		super(10);
		System.out.println("C Cons Call");
	}
	C(int x){
		this();
		System.out.println("C Param Cons Call");
	}
}
/*class A{
	
	 //A(){}
	 
	A(int x){
		System.out.println("A Param cons");
	}
}
class B extends A{
	
//	 B(){
//	 super();
//	 }
	 
}*/
public class ISADemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// B b = new B();
		C obj = new C(100);
	}

}
