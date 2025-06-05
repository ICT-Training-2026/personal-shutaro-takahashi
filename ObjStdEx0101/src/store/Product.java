package store;

//商品クラス
public class Product {
	private static final String STORE_NAME = "速水PC販売店";
	private static final int DEFAULT_CHANGE_AMT = 1000;
//	static int instanceCnt = 0;
	
	private String name;
	private int price;
	
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
//		instanceCnt++;
	}
	
	public Product(String name) {
		this(name, 0);
//		instanceCnt++;
	}
	
	public static void displayStoreName() {
		System.out.println("■店舗名：" + STORE_NAME);
	}

	public int up(int upcost) {
		return price +=upcost;
	}
	
	public int up() {
		return this.up(DEFAULT_CHANGE_AMT);
	}
	
	public int down(int downcost) {
		return price -= downcost;
	}
	
	public int down() {
		return this.down(DEFAULT_CHANGE_AMT);
	}
	
	public void display() {
		System.out.println(name + ":" + price + "円");
	}
}
