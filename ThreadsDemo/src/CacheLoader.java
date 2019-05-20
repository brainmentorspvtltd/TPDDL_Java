import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CacheLoader implements CacheConstants {
	
	private CacheLoader() {
		
	}
	
//	static {
//		loadCache();
//	}
	
	public static Map<String, ArrayList<CommonGenericParamsDTO>> cacheMap ;
	public  static void loadCache() {
		System.out.println("Cache Loading Start");
		cacheMap = new HashMap<>();
		CommonGenericParamsDAO dao = new CommonGenericParamsDAO();
		try {
			ArrayList<CommonGenericParamsDTO> countries = dao.getValues("country");
			ArrayList<CommonGenericParamsDTO> city = dao.getValues("city");
			cacheMap.put(COUNTRY_KEY, countries);
			cacheMap.put(CITY_KEY, city);
			System.out.println(countries);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static ArrayList<CommonGenericParamsDTO> getList(String key) {
		return cacheMap.get(key);
	}

}
