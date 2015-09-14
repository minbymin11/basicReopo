package com.itwill.account;

public class AccountManagerMain {

	public static void main(String[] args) {

		AccountManager accountManager=new AccountManager();
		

		/*
		 * 1. 모든계좌들 정보출력
		 */
		accountManager.print();
		/*
		 *2. 잔고입력 입력된잔고이상인 이상인 계좌객체들 정보 출력
		 */
	    System.out.println("------2. 잔고입력");
		Account[] aa1 = accountManager.findByBalance(90000);
		Account[] aa2 = accountManager.findByBalance(50000);
		for (int i = 0; i < aa1.length; i++) {
			aa1[i].print();
			
		}
		for (int i = 0; i < aa2.length; i++) {
			aa2[i].print();
			
		}
		
		System.out.println("--------3 이율 3.0 이상");
		/*
		 * 3. 이율이 3.0%이상입력 이율이상인 계좌객체들 반환
		 */
		Account[] aa3 = accountManager.findByRate(3.0); 
		for (int i = 0; i < aa3.length; i++) {
		aa3[i].print();
		}
		
		/*
		 *  4-1 계좌번호 5555번 입력 계좌 1개 주소 반환
		 */
		System.out.println("------4-1");
		Account findAccount1 = accountManager.findByNo("5555");
		findAccount1.print();
		Account findAccount2 = accountManager.findByNo("2222");
		findAccount2.print();
		/*
		 * 4.-2 계좌번호 5555번 찾아서 5000원 입금(출금)후 계좌정보를 출력,( 스트링 열의 비교)
		 */
		System.out.println("---4.2입금");
		Account[] aa6=accountManager.deposit("5555", 5000);
		Account[] aa7=accountManager.deposit("1111", 4000);
		System.out.println(aa6[0]);
		System.out.println(aa7[0]);
		
		
	
		
		/*
		 * 5. 이름이 "KIM" 입력 계좌객체들 출력
		 */
		System.out.println("----5 이름입력");
		Account[] aa4 = accountManager.findByName("KIM");
		Account[] aa5 = accountManager.findByName("LEE");
		aa4[0].print();
		aa5[0].print();
		
		/*
		 * 6. 정렬
		 */
		System.out.println("------------6.정렬");
		
		accountManager.sort(Account.BALANCE_TYPE, AccountManager.ASC);
		accountManager.print();
	}
	

}
