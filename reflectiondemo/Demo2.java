package reflectiondemo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;



class M{
	private int x;
	private int y=888;
	M(){
		x = 100;
		System.out.println("Default Cons Call");
	}
	M(int x){
		System.out.println("One Param Cons Call");
		this.x  = x;
	}
	void show() {
		System.out.println("M Show Call");
	}
}
class M2{
	private int x;
	private int z = 900;
	M2(){
		x = 100;
		System.out.println(" M2 Default Cons Call");
	}
	M2(int x){
		System.out.println("M2 One Param Cons Call");
		this.x  = x;
	}
	void show() {
		System.out.println("M2 Show Call");
	}
}
public class Demo2 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Class name to run");
		String className  = scanner.next();
		//Object object = Class.forName(className).newInstance();
		Object object = Class.forName(className).
				getDeclaredConstructor(int.class).newInstance(20);
		System.out.println("Enter the Field Name ");
		String fieldName = scanner.next();
		Field field= object.getClass().getDeclaredField(fieldName);
		
		System.out.println(object);
		System.out.println("Field is "+field.getName()+" Type "+field.getType());
		field.setAccessible(true);
		System.out.println("Field Value "+field.get(object));
		System.out.println("Enter the New Value to Update");
		int newValue = scanner.nextInt();
		field.setInt(object, newValue);
		System.out.println("Now New Value is "+field.get(object));
		
		Field fields [] = object.getClass().getDeclaredFields();
		for(Field fld : fields) {
//			if(fld.getName().equals("x")) {
//				System.out.println("X is "+fld.get(object));
//			}
			fld.setAccessible(true);
			System.out.println(fld.getName()+" "+fld.get(object));
		}

	}

}
