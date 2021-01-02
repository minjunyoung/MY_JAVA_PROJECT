package icehs.science.chaptor05;

public class GuGudanOddNumber {

	public static void main(String[] args) {
		for(int dan = 2; dan <=5; dan++) {
			for(int j = 1; j<= 9; j++) {
				int result = dan  * j;
				if (result %  2 ==1 ) {
					System.out.println(dan + " * " + j + " = " + (dan * j));
				}
			}
		}

	}

}
