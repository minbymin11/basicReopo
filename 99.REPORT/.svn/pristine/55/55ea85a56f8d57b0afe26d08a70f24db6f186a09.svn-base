package com.itwill.account;
/*
 * Account 객체들을 멤버변수로 가지며
 * 계좌객체들의 업무를 실행하는 클래스
 */
public class AccountManager {
	public static final int ASC=0;    //오름차순
	public static final int DESC=1;  //내림차순

	private Account[] accounts = { 
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
	public void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

	/*
	 *2. 잔고가  90000원 이상인 계좌들 정보 출력
	 */
	public Account[] findByBalance(int inputBalnce) {
		int count=0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= inputBalnce) {
				count++;
			}
		}
		Account[] aa = new Account[count];
		int index = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() >= inputBalnce) {
				 aa[index] = accounts[i];
				 index++;
			}
		}
		
		return aa;
	}

	
	
	/*
	 * 3. 이율이 3.0%이상인 계좌들 정보 출력
	 */
	public Account[] findByRate(double inputRate) {
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getRate()>inputRate)
				count++;
		}
		Account[] accArr = new Account[count];
		
		int index=0;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getRate()>inputRate){
				accArr[index]=accounts[i];
				index++;
			}
		}
		return accArr;
	}
	
	/*
	 *  4-1 계좌번호 5555번 계좌 1개 출력
	 */
	public Account findByNo(String no) {
		Account findAccount=null;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo().equals(no)){
				findAccount = accounts[i];
				
			}
		}
		return findAccount;
	}

	

	
	/*
	 * 4.-2 계좌번호 5555번 찾아서 5000원 입금(출금)후 계좌정보를 출력,( 스트링 열의 비교)
	 */
	
	public Account[] deposit(String no, int m) {
		
		int count = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getNo().equals(no)) {
				accounts[i].deposit(m);
				count++;
				break;
			}
		}
			Account[] depArr = new Account[count];
			
			int index = 0;
			for (int j = 0; j < depArr.length; j++) {
				depArr[index] = accounts[j];
			}
			
			return depArr;
	}
	

	
	/*
	 * 5. 이름이 "KIM"인 계좌들 출력
	 */
	public Account[] findByName(String name) {
		int count = 0;
		// 만족하는 Account갯수 알아내기
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner().equals(name)) {
				count++;
			}
		}
		Account[] aa = new Account[count];
		int index=0;
		// 만족하는 Account주소들 넣기
		for (int j = 0; j < accounts.length; j++) {
			if (accounts[j].getOwner().equals(name)) {
				 aa[index] = accounts[j];
				 index++;
			}
		}
		return aa;
	}
/*
 * 6. 정렬	
 */
	/*
	 * 이름정렬
	 */
	public void sort(int memberType, int sortType) {
		//이름으로 오름차순
		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-1; j++) {				//9번비교
				String jOwner1=accounts[j].getOwner();  			//이름꺼내서 스트링으로 저장
				String jOwner2=accounts[j+1].getOwner();  			//이름꺼내서 스트링으로 저장
				if (jOwner1.compareTo(jOwner2)>0) {						//비교값이 0보다 크면 오름차순 정렬
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1]=tempAccount;
				}
			}
		}
		/*
		 * 잔고정렬
		 */
		

	}
}