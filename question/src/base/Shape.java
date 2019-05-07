package base;

public class Shape {
	protected int length;
	protected int breath;
	public Shape(int l , int b){
		this.length = l;
		this.breath = b;
	}
	public void area() {
		System.out.println("Shape Area");
	}

}
