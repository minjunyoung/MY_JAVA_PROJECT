package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student gilldong = new Student();
		
		gilldong.name = "홍길동";
		gilldong.id = " S001";
		gilldong.english = 80;
		gilldong.korean = 94;
		gilldong.math = 89;
		
		System.out.println("이름 : " + gilldong.name);
		System.out.println("학번 : " + gilldong.id);
		System.out.println("국어 성적 : " + gilldong.korean);
		System.out.println("영어 성적 : " + gilldong.english);
		System.out.println("수학 성적 : " + gilldong.math);
		
		
		
		gilldong.printStudentInfo();
		System.out.println(" 평균 : " + gilldong.calcAverage());
		
		System.out.println(" * 학번을 변경합니다!1!");
		
		gilldong.changeStudentId("STU0001");
		
		gilldong.printStudentInfo();
		
	}

}
