/*
  Collection:배열처럼여러개의 객체를 저장할수있다
  			 	- 서로다른형태의 자료를 요소로 가질수있다.
  			 	- 기억공간이 실행시에 자동증가 된다.
  			 	
  
  	- Set  : 동일한요소를 중복저장할수없도록하고 순서가없다
  	  	ex> HashSet
  	
  	- List : 동일한요소를 중복저장하며
  	                    요소가 순차적으로 처리됩니다.(인덱스를 사용해서접근)
  	  	ex> ArrayList,Vector,Stack,LinkedList                  
  	
  	- Queue: FIFO(First-In-FirstOut)
  	  	ex> LinkedList   	
  	
  Map: 객체를 키를 사용해서 저장한다.(키,객체쌍)
  	
  	- SortedMap
  	- ConcurrentMap
  		ex> HashTable
  
  <<Iterator>>
	 리스트는 원소들을 순차적으로 접근하기위해 for문을 사용했지만 
	 반복자(iterator)를 이용하여 원소에 접근할수있습니다.
	 반복자는 주어진 Collection에서 현재의 위치 그리고 다음단계로
	 이동하여 그곳을 현재의 위치로 반복하는 방법으로 구성되어 있습니다.
	 
	 Iterator 인터페이스는 Collection Interface에서 iterator() 메써드를
	 통해서 제공되기 때문에 Collection 인터페이스를 구현한 모든 클래스에서 사용이가능하므로
	 동일한 접근방식을 제공해준다는 장점이있습니다.
	   
	 Iterator 인터페이스는 현재위치에서 다음데이타가 있는지를 반환하는 hasNext()메써드와
	  다음 데이타를 얻고 그위치로 이동하는 next() 메써드가 있습니다.
 */
package com.itwill.util.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListMain {

	public static void main(String[] args) {

		System.out.println("--------------기본형(Wrapper, String)------------------");
		ArrayList scoreArray = new ArrayList();  //오브젝트의 가변배열
		System.out.println("1 before ListArray size: "+scoreArray.size());
		System.out.println("------------------add-------------------------");
		scoreArray.add(99);
		scoreArray.add(12);
		scoreArray.add(34);
		scoreArray.add(45);
		scoreArray.add(54);
		scoreArray.add(76);
		System.out.println("2. after ListArray size: "+scoreArray.size());
		System.out.println("-------------------get-------------------------");
		int lastScore=(int)scoreArray.get(scoreArray.size()-1);  //오브젝트형으로 반환되서 인티저로 캐스팅(unboxing)
		System.out.println("lastScore: "+lastScore);
		System.out.println(scoreArray); //socreArray는 toString()자동 호출(?)
		Integer findscore=new Integer(34);
		int findIndex=scoreArray.indexOf(findscore);
		System.out.println(findIndex);
		
		System.out.println("----------remove-----------------------------");
		
		scoreArray.remove(1); //인덱스 넣어도 삭제
		scoreArray.remove(new Integer(99)); //오브젝트 인티저형으로 캐스팅해서 인티저 99번 찾아서 삭제
		System.out.println("삭제후 전제출력"+scoreArray);
		System.out.println("삭제후 사이즈"+scoreArray.size()); 
		
		
		System.out.println("---------------참조형------------------------");

		Account acc0 = new Account("1111", "KIM", 33400, 3.2);
		Account acc1 = new Account("2222", "LEE", 56700, 1.6);
		Account acc2 = new Account("3333", "PARK", 39000, 5.2);
		Account acc3 = new Account("4444", "CHOI", 12000, 1.8);
		Account acc4 = new Account("5555", "SIM", 99000, 10.0);

		ArrayList accountList = new ArrayList();
		System.out.println("1.account list size:" + accountList.size());
		System.out.println(">>> add");
		accountList.add(acc0);
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		System.out.println("2.account list size:" + accountList.size());
		System.out.println(">>> get");
		Account lastAccount = (Account) accountList.get(4);
		System.out.println("lastAccount:" + lastAccount);

		//삭제remove()되면 삭제된 배열로 뒤에 배열이 당겨서 넣어진다 당연히 사이즈가 줄어든다 
		System.out.println(">>> remove");
		Account removeAccount = (Account) accountList.remove(accountList.size() - 1);
		System.out.println("removeAccount:" + removeAccount);
		System.out.println("3.account list size:" + accountList.size());

		System.out.println(">>전체출력");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			System.out.println(tempAccount);
		}
		
		System.out.println("accountList 구조:" + accountList);
		
		//1111번호로 찾아서 출력
		System.out.println(">>1111번출력");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getNo().equals("1111")) {
				System.out.println(tempAccount);
				break;
			}
		}
		
		//2222번 찾아서 삭제
		System.out.println(">> 2222번삭제");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getNo().equals("2222")) {
				Account rAccount = (Account) accountList.remove(i); 
				System.out.println("삭제된계좌:" + rAccount);
				System.out.println("삭제후size:" + accountList.size());
				if (i != accountList.size() - 1) {
					break;

				}
			}
		}
		
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			if (tempAccount.getOwner().equals("KIM")) {
				Account rAccount = (Account) accountList.remove(i);
				System.out.println("삭제된계좌:" + rAccount);
				System.out.println("삭제후size:" + accountList.size());
				if (i != accountList.size() - 1 || accountList.size()==1) {
					i--;
				}
			}
		}
		
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account) accountList.get(i);
			System.out.println(tempAccount);
		}
		
		System.out.println("---------------Iteration-------------");
		Iterator<Integer> scoreIter = scoreArray.iterator();
		while (scoreIter.hasNext()){
			int temScore=scoreIter.next();
			System.out.println(temScore);
		}
		
		Iterator<Account> accIter= accountList.iterator();
		while(accIter.hasNext()){
			Account temAcc = accIter.next();
			System.out.println(temAcc);
		}
		

	}

}
