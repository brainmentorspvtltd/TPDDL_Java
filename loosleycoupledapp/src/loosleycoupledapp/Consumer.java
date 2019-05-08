package loosleycoupledapp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Consumer {
	public void print(List l ) {
		
	}
	
	public static void main(String[] args) {
		//IProducer p = new FasterProducer();
		IProducer p  = Factory.getObject();
		p.showToAll();
		
//		List l = new ArrayList();
//		l = new LinkedList();
//		l = new Vector();
		
	}
		
}
