
public class CacheJob implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		RadioButtonCacheLoader.loadCache();
		
	}

}
