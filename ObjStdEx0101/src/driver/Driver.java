package driver;

import store.Product;

public class Driver {
	public static void main(String[] args) {
		Product.displayStoreName();
		
		Product keyboard = new Product("キーボード",4500);
		Product mouth = new Product("マウス",2000);
		
//		Product[] hairetu = {
//				new Product("マウス", 2000),
//				new Product("キーボード", 3600),
//				new Product("Webカメラ", 3900),
//				new Product("マイク", 2800),
//				new Product("ディスプレイ",15000),
//				new Product("LED照明", 4200)
//		};
//		
//		for (int i=0; i<hairetu.length; i++) {
//			hairetu[i].display();
//		}
		
//		keyboard.display();
//		mouth.display();
		
		keyboard.down();
		mouth.up(500);
		
		keyboard.display();
		mouth.display();
		
//		System.out.println("\n---一斉値下げ後---\n");		
//		for (int i=0; i<hairetu.length; i++) {
//			hairetu[i].down();
//			hairetu[i].display();
//		}
	}
}