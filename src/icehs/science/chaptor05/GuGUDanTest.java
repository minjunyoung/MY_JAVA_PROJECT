package icehs.science.chaptor05;

public class GuGUDanTest {

	public static void main(String[] args) {
		for(int dan =2; dan <= 9; dan++) {
			for(int j = 1; j <=9; j++) {
				if(j == 9) {
				System.out.println(dan + " * " + j + " = " + ( dan * j) );
				}else {
					System.out.print(dan + " * " + j + " = " + ( dan * j) + ",");
				}
			}
			System.out.println();
		}

	}

}
