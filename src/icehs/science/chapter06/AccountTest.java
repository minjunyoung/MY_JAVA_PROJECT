package icehs.science.chapter06;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.name = "È«±æµ¿";
		acc.accNo = "123-456789";
		acc.balance = 10000;
		
		acc.printAccountINfo();
		acc.deposit(20000);
		System.out.println("ÀÜ¾× : " + acc.balance + "¿ø");
		acc.wihtdraw(0)
		acc.wihtdraw(45000);
		System.out.println("ÀÜ¾× : " + acc.balance + "¿ø");
	}

}
