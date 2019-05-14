package filehandlingdemo;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




/*class MyFilter implements FilenameFilter{

	@Override
	public boolean accept(File dirPath, String fileName) {
		// TODO Auto-generated method stub
		return fileName.endsWith(".txt");
	}
	
}*/

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 
		
		//List l = new ArrayList();
		//String path = "⁨c:\\abcd\\xyz\\sample.txt";
		String path = "/Users/⁨amit⁩/Documents⁩/testfile/a/b/c/d";
		
		File file = new File(path);
		file.mkdirs();
		System.out.println("Exist "+file.exists());
		System.out.println(file.getAbsolutePath());
		if(10>2) {
		return ;
		}
		//file.mkdir();
		//file.mkdirs(); // nested dir
		File files [] = file.listFiles();
		//File files [] = file.listFiles(new MyFilter());
		//File files[] = file.listFiles((dirPath, fileName)->fileName.endsWith(".txt"));
		int dirCount = 0;
		int fileCount = 0;
		for(File f: files) {
			if(f.isDirectory()) {
				dirCount++;
				System.out.println("<DIR> "+f.getName());
				
			}
			else if(f.isFile()) {
				fileCount++;
				System.out.println("<FILE> "+f.getName());
				if(f.isHidden()) {
					System.out.println("Hidden Files are "+f.getName());
				}
				if(!f.canWrite()) {
					System.out.println("Read Only "+f.getName());
				}
				//f.delete();
			}
		}
		System.out.println("Files are "+fileCount+" Dirs are "+dirCount);
//		System.out.println(file.exists());
//		System.out.println(file.getAbsolutePath());
//		//System.out.println(file.getCanonicalPath());
//		
//		if(file.exists()) {
//			file.delete();
//			System.out.println("File Deleted");
//		}
//		else {
//			file.createNewFile();
//			System.out.println("File Created");
//		}

	}

}
