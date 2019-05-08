package loosleycoupledapp;

import java.util.ResourceBundle;

public class Factory {
	private Factory() {}
	public static IProducer getObject() { 
		//WWW w = new WWW();
		ResourceBundle r= ResourceBundle.getBundle("config");
		String className = r.getString("classname");
		try {
			return (IProducer)Class.forName(className).newInstance();
		} catch(Exception e) {
			System.out.println("Class Not Found "+e);
		}
		return null;
		//return new FasterProducer();
	}

}
