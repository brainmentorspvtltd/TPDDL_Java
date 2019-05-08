import java.util.ArrayList;

class Person{
	long id ;
	String name;
	Person(long id , String name){
		this.id = id;
		this.name = name;
	}
}
public class HeapEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		long id=0;
		ArrayList<Person> persons = new ArrayList<>();
		System.out.println("Program Start");
		while(true) {
			Person person = new Person(id++,"Ram"+id);
			persons.add(person);
			Thread.sleep(50);
		}
		

	}

}
