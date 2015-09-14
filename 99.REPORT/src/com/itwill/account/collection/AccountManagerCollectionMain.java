package com.itwill.account.collection;

public class AccountManagerCollectionMain {

	public static void main(String[] args) {

		AccountManager accountManager=new AccountManager();
		
		/*	
		/*
		 * 1. �����µ� �������
		 */
		System.out.println("1-------------��ü ���-----------");
		Account[] acc1=accountManager.print();
		for (int i = 0; i < acc1.length; i++) {
			acc1[i].print();
		}
		/*
		 *2. �ܰ��Է� �Էµ��ܰ��̻��� �̻��� ���°�ü�� ���� ���
		 */
		System.out.println("2----------�Է� �ܰ� �̻� ��-------");
		Account[] acc2 =accountManager.findByBalance(50000);
		for (int i = 0; i < acc2.length; i++) {
			acc2[i].print();
		}
		
		System.out.println("3--------- �Է� ���� �̻����(��ǻ� 2�� ����)----------");
		Account[] acc3 =accountManager.findByRate(3.0);
		for (int i = 0; i < acc3.length; i++) {
			acc3[i].print();
		}
	    
		System.out.println("4-----------���¹�ȣ �ϳ� �Է� �޾Ƽ� ���� 1�� ��ȯ--------");
		Account[] acc4 =accountManager.findByNo("5555");
		for (int i = 0; i < acc4.length; i++) {
			if(acc4[i]!=null)
						acc4[i].print();
			
		}
		
		/*
		 *  4-1 ���¹�ȣ 5555�� �Է� ���� 1�� �ּ� ��ȯ
		 */
		/*
		System.out.println("------4-1");
		Account findAccount1 = accountManager.findByNo("5555");
		findAccount1.print();
		Account findAccount2 = accountManager.findByNo("2222");
		findAccount2.print();
		*/
		/*
		 * 4.-2 ���¹�ȣ 5555�� ã�Ƽ� 5000�� �Ա�(���)�� ���������� ���,( ��Ʈ�� ���� ��)
		 */
		/*
		System.out.println("---4.2�Ա�");
		Account[] aa6=accountManager.deposit("5555", 5000);
		Account[] aa7=accountManager.deposit("1111", 4000);
		System.out.println(aa6[0]);
		System.out.println(aa7[0]);
		*/
	
		
		/*
		 * 5. �̸��� "KIM" �Է� ���°�ü�� ���
		 */
		/*
		System.out.println("----5 �̸��Է�");
		Account[] aa4 = accountManager.findByName("KIM");
		Account[] aa5 = accountManager.findByName("LEE");
		aa4[0].print();
		aa5[0].print();
		*/
		/*
		 * 6. ����
		 */
		/*
		System.out.println("------------6.����");
		
		accountManager.sort(Account.BALANCE_TYPE, AccountManager.ASC);
		accountManager.print();
		*/
	}
	

}
