interface IPlayer{  // abstract interface IPlayer
	int MAX_POWER = 100; // public static final int MAX_POWER = 100
	void jump(); // public abstract void jump();
	void attack();
}
interface IStarPlayer{
	int MAX_POWER = 200;
	void extraPowers();
}
interface MixPlayer extends IPlayer, IStarPlayer{
	void commonPowers();
}
class Honda implements IPlayer, IStarPlayer{

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extraPowers() {
		// TODO Auto-generated method stub
		
	}
	
}
class Ken implements MixPlayer{

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Ken Jump "+IPlayer.MAX_POWER+" "+IStarPlayer.MAX_POWER);
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("ken Attack");
		
	}

	@Override
	public void extraPowers() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commonPowers() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(10>2) {
		Ken ken = new Ken();
		}
		//ken = null;  // GC
		System.gc();
		Ken k = new Ken();
		Ken g = new Ken();
		k = g;
		//ken.jump();
		//new Ken().jump();

	}

}
