package com.itwill.account.collection;

import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;

/*
 * Account 객체들을 멤버변수로 가지며
 * 계좌객체들의 업무를 실행하는 클래스
 */
public class AccountManager {
	public static final int ASC=0;    //오름차순
	public static final int DESC=1;  //내림차순

	private ArrayList accArrlist = new ArrayList(); //ArrayList 선
	public AccountManager() {
			accArrlist.add(new Account("1111", "KIM", 33400, 3.2));
			accArrlist.add(new Account("2222", "LEE", 56700, 1.6));
			accArrlist.add(new Account("3333", "PARK", 39000, 5.2));
			accArrlist.add(new Account("4444", "CHOI", 12000, 1.8));
			accArrlist.add(new Account("5555", "SIM", 56000, 3.0));
			accArrlist.add(new Account("6666", "QIM", 87000, 4.0));
			accArrlist.add(new Account("7777", "SWM", 78000, 5.0));
			accArrlist.add(new Account("8888", "EIM", 56000, 6.0));
			accArrlist.add(new Account("9999", "WIM", 99000, 7.0));
			
	}
	/*
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
	*/
		
	/*
	 * 1. 모든계좌들 정보출력
	 */
	public Account[] print(){
			Account[] atemp = null;
			atemp = new Account[accArrlist.size()]; 
		for (int i = 0; i <accArrlist.size(); i++) {
			atemp[i] = (Account)accArrlist.get(i);
			//System.out.println(atemp);
		}
		return atemp;
		
	}
	
	//입금된 금액 이상 정보 출력 
	public Account[] findByBalance(int inputBalance){
		Account[] atemp = null;
		atemp = new Account[accArrlist.size()];
		int count = 0;
		int index = 0;
//		ArrayList aTempList = new ArrayList();
		for (int i = 0; i < accArrlist.size(); i++) {
			atemp[i] = (Account)accArrlist.get(i);    //arrList에서 비교숫자를 꺼내기 위한
			if(atemp[i].getBalance()>=inputBalance){
				count++;                   					//ArrayList는  오브젝트형  참조변수인데 Account객체로 캐스팅이 안되나요?
//				System.out.println(atemp);
//				continue;
			}
		}
		Account[] atemp1 = null;					//내가 했는데도 잘 이해가 안된다 아
		atemp1 = new Account[count];
		for (int i = 0; i < accArrlist.size(); i++) {
			atemp[i] = (Account)accArrlist.get(i);    
			if(atemp[i].getBalance()>=inputBalance){
				atemp1[index]=atemp[i];
				index++;
		}
		}
		return atemp1;
	}
	// 3.이율로 찾아볼기(사실상 2번 재탕)  
	public Account[] findByRate(double inputRate){
		Account[] atemp = null;
		atemp = new Account[accArrlist.size()];
		int count = 0;
		int index = 0;
//		ArrayList aTempList = new ArrayList();
		for (int i = 0; i < accArrlist.size(); i++) {
			atemp[i] = (Account)accArrlist.get(i);    //arrList에서 비교숫자를 꺼내기 위한
			if(atemp[i].getRate()>=inputRate){
				count++;                   					//ArrayList는  오브젝트형  참조변수인데 Account객체로 캐스팅이 안되나요?
//				System.out.println(atemp);
//				continue;
			}
		}
		Account[] atemp1 = null; // 내가 했는데도 잘 이해가 안된다 아
		atemp1 = new Account[count];
		for (int i = 0; i < accArrlist.size(); i++) {
			atemp[i] = (Account) accArrlist.get(i);
			if (atemp[i].getRate() >= inputRate) {
				atemp1[index] = atemp[i];
				index++;
			}
		}
		return atemp1;
		
	}
	//스트링형 계좌번호 넣어서 반환
	public Account[] findByNo(String inputNo){
		Account[] atemp = null;
		atemp = new Account[accArrlist.size()];
		Account[] atemp1 = new Account[1];
		for (int i = 0; i > accArrlist.size(); i++) {
			atemp[i] =(Account)accArrlist.get(i);
			if(atemp[i].getNo().equals(inputNo)){
				atemp1[0] = atemp[i];
				break;
			}
		}
		return atemp1;
	}
}
//계좌번호
/*	
	 //4-1 계좌번호 5555번 계좌 1개 출력
	 
	public Account findByNo(String no) {
		Account findAccount=null;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo().equals(no)){
				findAccount = accounts[i];
				
			}
		}
		return findAccount;
	}
	 //4.-2 계좌번호 5555번 찾아서 5000원 입금(출금)후 계좌정보를 출력,( 스트링 열의 비교)
	
	
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
	

	
	
	 //5. 이름이 "KIM"인 계좌들 출력
	 
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
	
	 //이름정렬
	 /*
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
		
		

	}
	*/
