package icehs.science.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco= new Chocolate();
		choco.name = "아마도라";
		choco.type = "다크";
		choco.price = 2200;
		choco.printchocolateInfo();
		String chocoName = choco.getName();
		int totalPrice = choco.calculateTotalPrice(20);
		System.out.println( chocoName + "초콜렛 20개 :" +totalPrice);
		choco.changechocolateInfo( " 카페 키리쉬" , 2500 );

	}

}
