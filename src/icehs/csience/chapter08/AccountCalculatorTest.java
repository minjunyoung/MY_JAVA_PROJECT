package icehs.csience.chapter08;

import icehs.science.chapter06.Account;

public class AccountCalculatorTest {

	public static void main(String[] args) {
		Account[] acc = new Account[5];
		for(int i = 0; i < acc.length; i++) {
			acc[i] = new Account(" 1111-2222-5555" + (i+1),(i+1)*10000,4.5);
		}
		for(int i =0; i <acc.length; i++) {
			acc[i].print
		}
	}
}