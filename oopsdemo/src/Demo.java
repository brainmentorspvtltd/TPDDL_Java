import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.println("Read Line Type quit to exit");
		String line = s.nextLine();
		System.out.println("Line is "+line);
		if(line.equalsIgnoreCase("quit")) {
			break;
		}
		}
		s.close();

	}

}
