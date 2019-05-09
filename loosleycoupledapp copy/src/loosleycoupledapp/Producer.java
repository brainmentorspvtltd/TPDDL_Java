package loosleycoupledapp;

public class Producer implements IProducer {
	@Override
	public void showToAll() {
		System.out.println("Show to all");
	}
	public void notShowToAll() {
		System.out.println("Not Show to all");
	}

}
