class X{
	int x;
	X(){
		x = 200;
	}
}
class Y extends X{
	int x;
	Y(){
		x = 100;
	}
}
class Z extends Y{
	int x;
	Z(int x){
		this.x = 300;
		int result = ((X)this).x + ((Y)this).x + this.x + x;
		System.out.println("X is "+result);
	}
}
public class ISADemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z z = new Z(1);

	}

}
