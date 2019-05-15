package reflectiondemo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class Calc {
	private int x, y;

	Calc(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int add() {
		return x + y;
	}

	public int sub() {
		return x - y;
	}

	public int mul() {
		return x * y;
	}

	public int div() {
		return x / y;
	}
}
public class CalcDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Class Name");
		String className = scanner.next();
		System.out.println("Enter the Method Name");
		String methodName = scanner.next();
		Object object = Class.forName(className)
				.getDeclaredConstructor(int.class, int.class)
				.newInstance(10,20);
		Method method = object.getClass().getDeclaredMethod(methodName, null);
		Object result = method.invoke(object, null);
		System.out.println("Result is "+result);
	}

}
