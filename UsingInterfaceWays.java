// SAM Interface
@FunctionalInterface
interface Calc{
	 int calculate(int x, int y);
	 //int calculate2(int x, int y);
}
// Create class implement Interface
class Adder implements Calc{
	@Override
	public int calculate(int x, int y) {
		return x + y;
	}

//	@Override
//	public int calculate2(int x, int y) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	
}
public class UsingInterfaceWays {

	public static void main(String[] args) {
		//Comparable<T>
		//Runnable
		// TODO Auto-generated method stub
		
//		Adder adder = new Adder();
//		int result = adder.calculate(100, 200);
//		System.out.println(result);
		int round2 = 2;
		if(round2==2) {
			//Calc d = (x,y)->x+y; // Lambda Expression Java 8
			Calc d1 = (a,b)->{
				System.out.println("A "+a+" B "+b);
				return a + b;
			};
			int result = d1.calculate(10, 20);
			System.out.println(result);
			// Anonymous Class
//		Calc calc = new Calc() {
//			@Override
//			public int calculate(int x, int y) {
//				return x * y;
//			}
//
////			@Override
////			public int calculate2(int x, int y) {
////				// TODO Auto-generated method stub
////				return 0;
////			}
//		};
		//int result = calc.calculate(10, 20);
		//System.out.println(result);
		}
	}

}
