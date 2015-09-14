package com.itwill.util.collection;

public class Account implements Comparable<Account>{
	private String no;// 계좌번호
	private String owner;// 계좌주
	private int balance;// 잔고
	private double iyul;// 이율
	/**
	 * 기본값을가지는 계좌객체생성
	 */
	public Account() {
	
	}
	/**
	 * 입력된인자값을가지는 계좌객체생성
	 * @param no 계좌번호
	 * @param owner 계좌주
	 * @param balance 잔고
	 * @param iyul 이율
	 */
	public Account(String no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}

	//collection에서 arrays 사용하면서 참조형 사용하려고? 
	@Override
	public int compareTo(Account o) {
		return this.balance-o.getBalance();//이거 좀 어렵다, 참조변수형 정렬을 위해서 사용(??) 
		
	}

	//AccountData set 메쏘드
	/**
	 * 계좌객체 데이타셋 메쏘드
	 * @param no 계좌번호
	 * @param owner 계좌주
	 * @param balance 잔고
	 * @param iyul 이율
	 */
	public void setAccountData(String no,String owner,int balance,double iyul) {
		//this.no=no;
		this.setNo(no);
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	/**
	 입금
	 @param m 입금할돈
	*/
	public void ipGum(int m) {
		balance += m;
	}
	
	/**
	 * 출금
	 * @param m 출금할돈
	 * @return 출금성공여부,false 출금실패,true 출금성공
	 */
	public boolean chulGum(int m) {
		boolean isSuccess=true;
		balance -= m;
		if(balance < 0){
			balance+=m;
			isSuccess=false;
			return isSuccess;
		}
		
		return isSuccess;
	}
	/**
	 * 헤더프린트
	 */
	public static void headerPrint(){
		System.out.println("---------------------------------");
		System.out.println("번호 \t 이름 \t 잔고 \t 이율");
		System.out.println("---------------------------------");
	}
	// 출력
	public void print() {
		System.out.println(no + "\t" + owner + "\t" + balance + "\t" + iyul);
	}
	
	@Override
	public String toString() {
		return no + "\t" + owner + "\t" + balance + "\t" + iyul;
	}
	
	// getter
	public String getNo() {
		return no;
	}

	public String getOwner() {
		return owner;
	}
	/**
	 * 잔고조회
	 * @return 잔고
	 */
	public int getBalance() {
		return balance;
	}

	public double getIyul() {
		return iyul;
	}

	// setter
	public void setNo(String no) {
		this.no = no;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setIyul(double iyul) {
		this.iyul = iyul;
	}

}
