package icehs.science.chapter09;

public class AnimalTest {
	public static void main(String[] args) {
		Cat c = new Cat(3, "�丣�þ�" , "�߿���");
		System.out.println("�̸� : " + c.getName());
		System.out.println("���� : " + c.getAge());
		System.out.println("���� : " + c.getKind());
		c.run();
		c.hunt();
		c.play();
		
		System.out.println();
		
		Dog d1 = new Dog(2, "�ú������㽺Ű" , "�۸���");
		System.out.println("�̸� : " + d1.getName());
		System.out.println("���� : " + d1.getAge());
		System.out.println("���� : " + d1.getKind());
		d1.run();
		d1.hunt();
	}
}
