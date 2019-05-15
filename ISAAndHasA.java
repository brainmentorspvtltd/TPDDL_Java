package filehandlingdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class T implements Serializable{
	int b = 10;
	int d= 20;
	@Override
	public String toString() {
		return "T [b=" + b + ", d=" + d + "]";
	}
	
}
class A implements Serializable{
//class A{
	int x, y;
	String c = "hello";
	T t = new T(); // Has - A
	A(){
		System.out.println("Default Cons of A Call");
	}
	A(int x, int y){
		this.x = x;
		this.y = y;
		System.out.println("Param Cons of A Call");
	}
	
}
class B extends A{
//class B extends A implements Serializable{
	int z;
	B(){
		System.out.println("Default cons of B Call");
	}
	B(int z){
		super(10,20);
		this.z = z + super.x + super.y;
		System.out.println("Param Cons of B Call "+this.z);
	}
	@Override
	public String toString() {
		return "B [z=" + z + ", x=" + x + ", y=" + y + " "+t+ "c "+c+"]";
	}
	
}
public class ISAAndHasA {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/testfile/isa.dat";
		B b = new B(1000);
		FileOutputStream fs = 
				new FileOutputStream(path);
		ObjectOutputStream os  = new ObjectOutputStream(fs);
		os.writeObject(b);
		os.close();
		fs.close();
		System.out.println("Data Write....");
		System.out.println("*************************************");
		FileInputStream fi = new FileInputStream(path);
		ObjectInputStream oi = new ObjectInputStream(fi);
		B b1 = (B)oi.readObject();
		System.out.println(b1);  // b1.toString()
		oi.close();
		fs.close();
	}

}
