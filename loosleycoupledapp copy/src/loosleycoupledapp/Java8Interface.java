package loosleycoupledapp;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
interface Q1{
	default void print() {
		System.out.println("Print2");
	}
}
interface Q{
	void show();
	default void print() {
		System.out.println("Print");
	}
}
class X2 implements Q, Q1{
	@Override
	public void print() {
		Q.super.print();
		Q1.super.print();
	}
@Override
	public void show() {
		System.out.println();
	}
	
}
class X1 extends WindowAdapter{
	
}
public class Java8Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
