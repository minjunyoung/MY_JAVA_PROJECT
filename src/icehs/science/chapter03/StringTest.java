package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String king = "�������";
		String year = "2017";
		String money = "10000";
		int intYear = Integer.parseInt(year);
		
		System.out.println(king + 72
				
				+ money);
		System.out.println(year + "��" );
		System.out.println(money + year);
		System.out.println(intYear + Integer.parseInt(money));
		
	}

}
