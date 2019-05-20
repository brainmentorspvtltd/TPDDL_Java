import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Logic{
	String path = "/Users/amit/Downloads/fullstack.pptx";
	String writePath ;
	Logic(String writePath){
		this.writePath = writePath;
	}
	void myLogic() {
		System.out.println("Data Copy Start "+Thread.currentThread().getName());
		File file = new File(path);
		if(file.exists()) {
			FileInputStream fs;
			BufferedInputStream bs;
			
			try {
				fs = new FileInputStream(file);
				bs = new BufferedInputStream(fs);
				//bs.skipNBytes(20);
				int singleByte = bs.read();
				FileOutputStream fo = new FileOutputStream(writePath);
				BufferedOutputStream bo = new BufferedOutputStream(fo);
				while(singleByte!=-1) {
					bo.write(singleByte);
					singleByte = bs.read();
				}
				bs.close();
				fs.close();
				bo.close();
				fo.close();
				System.out.println("Data Copy Done "+Thread.currentThread().getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else {
			System.out.println(file.getAbsolutePath()+" Path Not Exist "+Thread.currentThread().getName());
		}
		/*for(int i = 1; i<=5; i++) {
			System.out.println("I is "+i+" "+Thread.currentThread().getName());
		}*/
	}
}
class Job implements Runnable {
	Logic logic ;
	Job(String path){
		logic = new Logic(path);
	}
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		logic.myLogic();
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken by "+Thread.currentThread().getName()+" "+(endTime-startTime));
		// TODO Auto-generated method stub
		
	}
	
}
public class Demo {

	public static void main(String[] args) {
		System.out.println("Inside Main.....");
		/*Job job = new Job("/Users/amit/Documents/testfile/fullstackcopy11.pptx");
		Job job2 = new Job("/Users/amit/Documents/testfile/fullstackcopy22.pptx");
		Thread worker = new Thread(job,"ram");
		Thread worker2 = new Thread(job2,"shyam");
		worker.start();
		worker2.start();*/
		long startTime = System.currentTimeMillis();
		System.out.println("Logic 1 Start");
		Logic logic  = new Logic("/Users/amit/Documents/testfile/fullstackcopy11.pptx");
		logic.myLogic();
		System.out.println("Logic 1 Ends");
		System.out.println("Logic 2 Start");
		Logic logic2  = new Logic("/Users/amit/Documents/testfile/fullstackcopy22.pptx");
		logic2.myLogic();
		System.out.println("Logic 2 Ends");
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime-startTime));
		// TODO Auto-generated method stub

	}

}
