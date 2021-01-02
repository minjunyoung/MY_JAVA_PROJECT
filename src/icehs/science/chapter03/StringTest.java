package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String king = "¼¼Á¾´ë¿Õ";
		String year = "2017";
		String money = "10000";
		int intYear = Integer.parseInt(year);
		
		System.out.println(king + 72
				
				+ money);
		System.out.println(year + "³â" );
		System.out.println(money + year);
		System.out.println(intYear + Integer.parseInt(money));
		
	}

}
