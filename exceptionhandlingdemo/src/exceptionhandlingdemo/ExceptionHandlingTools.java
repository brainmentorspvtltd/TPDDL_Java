package exceptionhandlingdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Logger;


class FlowWrapperException extends RuntimeException{
	String msg;
	RuntimeException e;
	public FlowWrapperException() {
		this.msg = "";
		// TODO Auto-generated constructor stub
	}
	public FlowWrapperException(RuntimeException e) {
		this.msg = "";
		this.e = e;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void printStackTrace() {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		this.e.printStackTrace(pw);
		this.msg = sw.toString();
	}
	@Override
	public String toString() {
		this.printStackTrace();
		return this.msg;
	}
}


class ChangeStream{
	static String printStackTrace(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		return sw.toString();
	}
}

class Flow{
	Logger logger = Logger.getLogger(Flow.class);
	void db2() throws FileNotFoundException  {
		FileInputStream fs = new FileInputStream("");
	}
	void db() throws NullPointerException{
		try {
			logger.debug("Connection Open ");
		System.out.println("Open DB Connection");
		String s = null;
		s.length();
		if(10>2) {
			System.out.println("I am Here %%%%%%%%%%%%%%%%%%%%%%%");
			//System.exit(0);
			return ;
		}
//		if(10>2) {
//		throw new NullPointerException();
//		}
		//s.length(); // throw new NullPointorException();
		//int y [] =new int[5];
		//y[100] = 100;
		//int x = 100/0;
		System.out.println("Query and Get Data");
		}
		finally {
		System.out.println("Close DB Connection");
		logger.debug("Connection Close ");
		}
		
	}
	void logic() throws NullPointerException, FileNotFoundException {
		logger.debug("Logic Start ");
		System.out.println("Rec View Input and Call DB");
		db();
		db2();
		System.out.println("Get DB Data and give to View");
		logger.debug("Logic End ");
	}
	void view() {
		logger.debug("View Open ");
		System.out.println("Load Screen");
		System.out.println("Input and Call Logic");
		try {
		logic();
		System.out.println("Get Logic data and print");
		}
		catch(FileNotFoundException e) {
			logger.error(e);
		}
		catch(NullPointerException e) {
			FlowWrapperException w = new FlowWrapperException(e);
			System.out.println("****************Something went wrong ");
			//System.out.println(e);
			//e.printStackTrace();
			logger.error(w); // e.toString()
			//String msg= ChangeStream.printStackTrace(e);
			//logger.error(msg);
			//e.printStackTrace();
		}
		logger.debug("View Close ");
	}
}
public class ExceptionHandlingTools {
public static void main(String[] args) {
		new Flow().view();

	}

}
