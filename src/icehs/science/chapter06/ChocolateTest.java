package icehs.science.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		Chocolate choco= new Chocolate();
		choco.name = "�Ƹ�����";
		choco.type = "��ũ";
		choco.price = 2200;
		choco.printchocolateInfo();
		String chocoName = choco.getName();
		int totalPrice = choco.calculateTotalPrice(20);
		System.out.println( chocoName + "���ݷ� 20�� :" +totalPrice);
		choco.changechocolateInfo( " ī�� Ű����" , 2500 );

	}

}
