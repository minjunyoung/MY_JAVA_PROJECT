package icehs.science.chapter06;

public class CoffeTest {

	public static void main(String[] args) {
		Coffe ame = new Coffe(); 
		Coffe latte = new Coffe();
		Coffe maki = new Coffe();
		
		ame.name = "¾Æ¸Þ¸®Ä«³ë";
		ame.price = 3500;
		ame.printCoffeInfo();
		
		latte.name = "Ä«Æä¶ó¶¼";
		latte.price = 4000;
		latte.printCoffeInfo();
		
		maki.name = "Ä«¶ó¸á ¸¶³¢¾ß¶Ç";
		maki.price = 4500;
		maki.printCoffeInfo();
	
	
	
	}
}	