
public class DropDownCacheJob implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		CacheLoader.loadCache();
		
	}

}
