package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student gilldong = new Student();
		
		gilldong.name = "ȫ�浿";
		gilldong.id = " S001";
		gilldong.english = 80;
		gilldong.korean = 94;
		gilldong.math = 89;
		
		System.out.println("�̸� : " + gilldong.name);
		System.out.println("�й� : " + gilldong.id);
		System.out.println("���� ���� : " + gilldong.korean);
		System.out.println("���� ���� : " + gilldong.english);
		System.out.println("���� ���� : " + gilldong.math);
		
		
		
		gilldong.printStudentInfo();
		System.out.println(" ��� : " + gilldong.calcAverage());
		
		System.out.println(" * �й��� �����մϴ�!1!");
		
		gilldong.changeStudentId("STU0001");
		
		gilldong.printStudentInfo();
		
	}

}
