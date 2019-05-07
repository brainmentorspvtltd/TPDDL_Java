package child;

import base.Shape;

public class Square extends Shape {
	public Square(int side, int b) {
		super(side,0);
	}
	@Override
	public void area() {
		System.out.println("Square Area Side * Side" + (length * length));
	}
	public void allSideEquals() {
		System.out.println("All Side Equals");
	}
}
