package ch06.test;

public class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {};
	
	public static ShopService getInstance() {
		if (singleton == null) singleton = new ShopService();
		return singleton;
	}
	

}
