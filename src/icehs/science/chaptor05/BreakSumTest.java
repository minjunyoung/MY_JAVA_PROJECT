package icehs.science.chaptor05;

public class BreakSumTest {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
			if(sum >30) {
				break;
				
			}
			
		}
		System.out.println("�հ� ��� : " + sum);

	}

}
