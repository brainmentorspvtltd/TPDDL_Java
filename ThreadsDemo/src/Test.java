
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Main Start");
//		System.out.println(CacheLoader.getList(CacheConstants.COUNTRY_KEY));
//		System.out.println(CacheLoader.getList(CacheConstants.CITY_KEY));
//		System.out.println("***************************************");
//		System.out.println(CacheLoader.getList(CacheConstants.COUNTRY_KEY));
//		System.out.println(CacheLoader.getList(CacheConstants.CITY_KEY));
		CacheJob job = new CacheJob();
		Thread worker =  new Thread(job);
		DropDownCacheJob job2 = new DropDownCacheJob();
		Thread worker2 =  new Thread(job2);
		worker.start();
		worker2.start();
		

	}

}
