package child;

import base.Shape;

public class Rectangle extends Shape {
	public Rectangle(int l, int b) {
		super(l,b);
	}
	@Override
	public void area() {
		System.out.println("Rect Area L*B" + (super.length * super.breath));
	}
}
