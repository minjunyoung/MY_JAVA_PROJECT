package icehs.science.chaptor05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		int  index = 1;
		int sum = 0;
		while (sum <100 ) {
			int number = index * 5;
			sum += number;
			System.out.println(index + ".(+"+ (number + ") " + sum));
		}

	}

}
