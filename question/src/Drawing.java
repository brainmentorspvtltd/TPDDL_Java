

import base.Shape;
import child.Rectangle;
import child.Square;

public class Drawing {
	void draw(Shape shape) {
		shape.area();
		if(shape instanceof Square) {
			((Square) shape).allSideEquals();
		}
		System.out.println("***********************");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawing drawing = new Drawing();
		drawing.draw(new Rectangle(3,4));
		drawing.draw(new Square(3,0));

	}

}
