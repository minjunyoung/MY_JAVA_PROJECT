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
		totalPrice = choco.calculateTotalPrice(20);
		
		System.out.println(chocoName +" ���ݷ� 20�� : " + totalPrice);
		choco.changeChocolateInfo("ī�� Ű����",2500);
		totalPrice = choco.calculateTotalPrice(15, 10);
		System.out.println(chocoName + " ���ݷ� 15�� (10%����) : " + totalPrice);

	}

}
int calculateTotalPrice(int count) {
	return count * price * (100-discount)/100;
	
}
void changeChocolateInfo(String newName, int newPrice) {
	name = newname;
	price = newPrice;
	printChocolateINfo();
}


void changeChocolateInfo(String newName, int newPrice, String newType){
	name = newname;
	price = newPrice;
	type = newType;
	printChocolateInfo();
}
