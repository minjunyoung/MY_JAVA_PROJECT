package icehs.science.chapter06;

public class Account {
		String name;
		String accNo;
		int balance;
		
		void deposit(int money) {
			System.out.println(money + " ���� �Ա��մϴ�");
			if (money < 0 ) {
			System.out.println("[����]�ݾ��� ������ �Է��� �� �����ϴ�");
		}else {
			balance += money; //balance = balance +money
		}
			}
		
		int wihtdraw(int money) {
			System.out.println(money + " ���� ����մϴ�");
			if(money <0) {
			System.out.println("[����]�ݾ��� ������ �Է��� �� �����ϴ�");
			return 0;
		}else if(balance < money) {
			System.out.println( "[����] �ܾ��� �����մϴ�.");
			return 0;
		}else if(balance < money) {
			System.out.println("[");
		}
			System.out.println();
			balance -= money; // balance = balance - money;
			return money;
			
		}
		void printAccountINfo() {
			System.out.println("���� " + accNo +"(������ : " + name +")");
			System.out.println("���� " + balance + "��");
		}
}
