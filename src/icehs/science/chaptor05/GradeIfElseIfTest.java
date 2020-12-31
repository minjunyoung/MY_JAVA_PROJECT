package icehs.science.chaptor05;

public class GradeIfElseIfTest {

	public static void main(String[] args) {
		int score = 90;
		
		if (score >= 90 && score <= 100) {
			System.out.println("A학점입니다.");
		}else if (score >= 80 && score< 90) {
			System.out.println("B학점입니다.");
		}else if (score >= 70 && score< 80) {
			System.out.println("C학점입니다.");
		}else if (score >= 60 && score< 70) {
			System.out.println("D학점입니다.");
		}else if(score >= 0 && score < 60)
			System.out.println("F학점입니다.");
		
			
		}

	}