class G{
	void show(byte x){
		System.out.println("Byte");
	}
	void show(short x){
		System.out.println("Short");
	}
//	void show(int x){
//		System.out.println("Int");
//	}
//	void show(long x){
//		System.out.println("Long");
//	}
//	void show(double x){
//		System.out.println("Double");
//	}
//	void show(Integer x){
//		System.out.println("Integer");
//	}
	void show(Long x){
		System.out.println("Long Wrapper");
	}
//	void show(int ...x){
//		System.out.println("Var Args of int");
//	}
}
public class OverloadingOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G obj = new G();
		//obj.show(1);

	}

}
