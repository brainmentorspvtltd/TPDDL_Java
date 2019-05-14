package filehandlingdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo3 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		File file = new File("/Users/amit/Documents/testfile/emp.dat");
		if(file.exists()) {
			FileInputStream fs = new FileInputStream(file);
			ObjectInputStream os = new ObjectInputStream(fs);
			Employee emp = (Employee)os.readObject();
			System.out.println(emp);  // emp.toString()
			os.close();
			fs.close();
			
		}
		else {
			System.out.println("Invalid Path");
		}
		
		

	}

}
