package reflectiondemo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

interface P1{
	void show();
}
interface P2{
	void show();
}
class P{
	
}
class Q extends P implements P1, P2{
	int x ;
	static int y;
	private int z;
	protected String q;
	public int g;
	private int v;
	@Override
	public void show() {
		System.out.println("I am Show");
	}
}
public class Demo {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		Class cls = Q.class;  // Meta
		int privateCount = 0;
		System.out.println(cls.getSuperclass());
		System.out.println(cls.getInterfaces().length);
		System.out.println(cls.getConstructors().length);
		System.out.println("Fields are "+cls.getDeclaredFields().length);
		Field field1 = cls.getDeclaredField("q");
		System.out.println(field1.getName()+" "+field1.getType());
		for(Field field : cls.getDeclaredFields()) {
			if(Modifier.isPrivate(field.getModifiers())) {
				privateCount++;
				System.out.println(field.getName()+" "+field.getType());
			}
			//Modifier.isFinal(mod)
			//else
			//if(Modifier.isStatic(mod))	
		}
		System.out.println("Methods are "+cls.getDeclaredMethods().length);
	}

}
