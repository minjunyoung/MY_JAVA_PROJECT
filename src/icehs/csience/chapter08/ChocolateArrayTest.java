package icehs.csience.chapter08;

public class ChocolateArrayTest {
	public static void main(String[] args) {
		Chocolate[] chocos = new Chocolate[3];
		chocos[0] = new Chocolate("�Ƹ�����", "��ũ" ,2200);
		chocos[1] = new Chocolate("ī�� Ű����", "��ũ", 2500);
		chocos[2] = new Chocolate("Ʈ���� ���", "ȭ��Ʈ" , 2300);
		
		chocos[0].printCHocolateInfo();
		chocos[1].printCHocolateInfo();
		chocos[2].printCHocolateInfo();
	}

}
