package filehandlingdemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPasteDemo {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("/Users/amit/Downloads/fullstack.pptx");
		final int EOF = -1;
		long startTime = System.currentTimeMillis();
		if(file.exists()) {
			
			FileInputStream fs = new FileInputStream(file);
			BufferedInputStream bs = new BufferedInputStream(fs);
			FileOutputStream fo = new FileOutputStream("/Users/amit/Documents/testfile/fullstackcopy.pptx");
			BufferedOutputStream bo= new BufferedOutputStream(fo);
			System.out.println("File Copy Start");
			//int singleByte = fs.read();
			int singleByte = bs.read();
			while(singleByte!=EOF) {
				//fo.write(singleByte);
				bo.write(singleByte);
				//System.out.print((char)singleByte);
				//singleByte = fs.read();
				singleByte = bs.read();
			}
			/*byte b[] = fs.readAllBytes();  // Java 9 > 
			String str = new String(b);
			System.out.println(str);*/
			bo.close();
			bs.close();
			fo.close();
			fs.close();
			long endTime = System.currentTimeMillis();
			System.out.println("Total Time Taken "+(endTime-startTime)+"ms");
			System.out.println("File Copy Ends");
			
			
		}
		else {
			System.out.println("Invalid Path");
		}


	}

}
