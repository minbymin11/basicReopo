package com.itwill.account;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class AccountArrayMain {

	public static void main(String[] args) {
		Account[] accounts={
				new Account("1111", "KIM", 33400, 3.2),
				new Account("2222", "LEE", 56700, 1.6),
				new Account("3333", "PARK", 39000, 5.2),
				new Account("4444", "CHOI", 12000, 1.8),
				new Account("5555", "SIM", 56000, 3.0),
				new Account("6666", "QIM", 87000, 4.0),
				new Account("7777", "SWM", 78000, 5.0),
				new Account("8888", "EIM", 56000, 6.0),
				new Account("9999", "WIM", 99000, 7.0)
		};		


	/*
	 * 1. 모든계좌들 정보출력
	 */
		accounts[0].headerPrint();
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	/*
	 *2. 잔고가  90000원 이상인 계좌들 정보 출력
	 */
		System.out.println("----------잔고9000원이상인 계좌들 정보 철력");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= 90000) {
				accounts[i].print();
			}
		}
	
	/*
	 * 3. 이율이 3.0%이상인 계좌들 정보 출력
	 */
		System.out.println("3. 이율이 3.0%이상인 계좌들 정보 출력");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getRate() >= 3.0) {
				accounts[i].print();
			}
		}
	/* 4-1 계좌번호 5555번 계좌 1개 출력
	 * 4.-2 계좌번호 5555번 찾아서 5000원 입금(출금)후 계좌정보를 출력,( 스트링 열의 비교)
	 */
		System.out.println("4-1 계좌번호 5555번 계좌 1개 출력");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo().equals("5555")) {
				accounts[i].print();
				
			}
		}
		System.out.println("4.-2 계좌번호 5555번 찾아서 5000원 입금(출금)후 계좌정보를 출력,( 스트링 열의 비교)");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo().equals("5555")) {
				accounts[i].deposit(5000);
				accounts[i].print();
			}
		}

	/*
	 * 5. 이름이 "KIM"인 계좌들 출력
	 */
		System.out.println("5. 이름이 'KIM'인 계좌들 출력");
		for (int i = 0; i < accounts.length; i++) {
			String tempOwner = accounts[i].getOwner();
			if (tempOwner.equals("KIM")) {
				accounts[i].print();
			}

		}
	}

}
