package com.itwill.util.collection;

import java.util.HashSet;

public class SetMain {

	public static void main(String[] args) {
		System.out.println("-------------Wrapper, String-----------------------");
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		System.out.println("1.set size: "+ lottoSet.size());
		System.out.println(">>add");
		lottoSet.add(new Integer(23));
		lottoSet.add(12);
		lottoSet.add(34);
		lottoSet.add(33);
		lottoSet.add(40);
		System.out.println("2.set size:"+lottoSet.size());
		boolean isDuplcate=lottoSet.add(12);
		System.out.println("�߰�����(�ߺ�): "+isDuplcate);
		System.out.println("3.set size"+lottoSet.size());
		System.out.println("set ����>>"+lottoSet);
		System.out.println(">>remove");
		boolean isRemove=lottoSet.remove(40);
		System.out.println("������?"+isRemove);
		System.out.println("������ set ����>>"+lottoSet);
		
		
		
		
		
		System.out.println("-------------������-----------------------");
		
		Account acc0 = new Account("1111", "KIM", 33400, 3.2);
		Account acc1 = new Account("2222", "LEE", 56700, 1.6);
		Account acc2 = new Account("3333", "PARK", 39000, 5.2);
		Account acc3 = new Account("4444", "CHOI", 12000, 1.8);
		Account acc4 = new Account("5555", "SIM", 99000, 10.0);
		
		HashSet<Account> accSet=new HashSet<Account>();
		System.out.println("1. account set size:"+accSet.size());
		accSet.add(acc0);
		accSet.add(acc1);
		accSet.add(acc2);
		accSet.add(acc3);
		accSet.add(acc4);
		System.out.println("1. account set size:"+accSet.size());
		System.out.println("��ü���: "+accSet);
		isDuplcate = accSet.add(acc4);
		System.out.println("�ߺ�üũ: "+ isDuplcate);
		System.out.println(">>>remove");
		System.out.println("��ü���: "+accSet);
		isDuplcate=accSet.remove(acc2);
		System.out.println();
		//acc3�� ���ԵǾ� ������ �����ϼ�
		if(accSet.contains(acc3)){
			accSet.remove(acc3);
		}
		
		
		
	}

}
