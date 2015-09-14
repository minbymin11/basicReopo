package com.itwill.util.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayCollectionUtilMain {

	public static void main(String[] args) {
		
		int[] korScore={34,55,89,12,71,23};
		for (int i = 0; i < korScore.length; i++) {
			System.out.println(korScore[i]);
		}
		/*
		 * Arrays util클래스
		 */
		//정렬 오름차순으로 되어있음 내림하려면수동으로 하셈
		System.out.println();
		System.out.println("---------Arrays.sort()-----------------------");
		Arrays.sort(korScore);
		for (int i = 0; i < korScore.length; i++) {
			System.out.println(korScore[i]+" ");
		}
		
		
		System.out.println();//뭐지 이거? 안쓰면 덮어 씌우네
		String[] name = {"박","정","유","yu"};
		Arrays.sort(name);
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]+" ");
		}
		
		System.out.println("-----------------참조타입의 정렬-------------------------");
		Account[] accounts = { 
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
		//인터페이스, 추상메소드 뭔말이여? comparableTo 재정의? //객체비교하려면 comparableTo을 재정의해줘야댐
		Arrays.sort(accounts);
		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
		}
		/*
		 * collections util 클래스(list만 가능)
		 */
		ArrayList<Integer> scoreList = new ArrayList<Integer>();
		scoreList.add(23);
		scoreList.add(43);
		scoreList.add(14);
		scoreList.add(3);
		scoreList.add(1);
		
		System.out.println(scoreList);
		Collections.sort(scoreList);
		System.out.println(scoreList);
		
		Account acc0 = new Account("1111", "KIM", 33400, 3.2);
		Account acc1 = new Account("2222", "LEE", 56700, 1.6);
		Account acc2 = new Account("3333", "PARK", 39000, 5.2);
		Account acc3 = new Account("4444", "CHOI", 12000, 1.8);
		Account acc4 = new Account("5555", "SIM", 99000, 10.0);
	
		ArrayList<Account> accountList = new ArrayList<Account>();
		accountList.add(acc0);
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		
		System.out.println(accountList);
		Collections.sort(accountList);      
		System.out.println(accountList);
		
		AccountSortByName asbn = new  AccountSortByName();
		
		for (int i = 0; i < accounts.length; i++) {
	//		asbn.compare(accountList);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
