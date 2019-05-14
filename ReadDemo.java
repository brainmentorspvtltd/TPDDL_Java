package filehandlingdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// String path = "c:\\workspace\\TPDDL-Java\\src\\A.java"
		String path = "/Users/amit/Documents/TPDDL-Java/filehandlingdemo/src/filehandlingdemo/ReadDemo.java";
		File file = new File(path);
		final int EOF = -1;
		if(file.exists()) {
			FileInputStream fs = new FileInputStream(file);
			int singleByte = fs.read();
			while(singleByte!=EOF) {
				System.out.print((char)singleByte);
				singleByte = fs.read();
			}
			/*byte b[] = fs.readAllBytes();  // Java 9 > 
			String str = new String(b);
			System.out.println(str);*/
			fs.close();
			
			
		}
		else {
			System.out.println("Invalid Path");
		}

	}

}
