package com.itwill.account.collection;

import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;

/*
 * Account ��ü���� ��������� ������
 * ���°�ü���� ������ �����ϴ� Ŭ����
 */
public class AccountManager {
	public static final int ASC=0;    //��������
	public static final int DESC=1;  //��������

	private ArrayList accArrlist = new ArrayList(); //ArrayList ��
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
	 * 1. �����µ� �������
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
	
	//�Աݵ� �ݾ� �̻� ���� ��� 
	public Account[] findByBalance(int inputBalance){
		Account[] atemp = null;
		atemp = new Account[accArrlist.size()];
		int count = 0;
		int index = 0;
//		ArrayList aTempList = new ArrayList();
		for (int i = 0; i < accArrlist.size(); i++) {
			atemp[i] = (Account)accArrlist.get(i);    //arrList���� �񱳼��ڸ� ������ ����
			if(atemp[i].getBalance()>=inputBalance){
				count++;                   					//ArrayList��  ������Ʈ��  ���������ε� Account��ü�� ĳ������ �ȵǳ���?
//				System.out.println(atemp);
//				continue;
			}
		}
		Account[] atemp1 = null;					//���� �ߴµ��� �� ���ذ� �ȵȴ� ��
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
	// 3.������ ã�ƺ���(��ǻ� 2�� ����)  
	public Account[] findByRate(double inputRate){
		Account[] atemp = null;
		atemp = new Account[accArrlist.size()];
		int count = 0;
		int index = 0;
//		ArrayList aTempList = new ArrayList();
		for (int i = 0; i < accArrlist.size(); i++) {
			atemp[i] = (Account)accArrlist.get(i);    //arrList���� �񱳼��ڸ� ������ ����
			if(atemp[i].getRate()>=inputRate){
				count++;                   					//ArrayList��  ������Ʈ��  ���������ε� Account��ü�� ĳ������ �ȵǳ���?
//				System.out.println(atemp);
//				continue;
			}
		}
		Account[] atemp1 = null; // ���� �ߴµ��� �� ���ذ� �ȵȴ� ��
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
	//��Ʈ���� ���¹�ȣ �־ ��ȯ
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
//���¹�ȣ
/*	
	 //4-1 ���¹�ȣ 5555�� ���� 1�� ���
	 
	public Account findByNo(String no) {
		Account findAccount=null;
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getNo().equals(no)){
				findAccount = accounts[i];
				
			}
		}
		return findAccount;
	}
	 //4.-2 ���¹�ȣ 5555�� ã�Ƽ� 5000�� �Ա�(���)�� ���������� ���,( ��Ʈ�� ���� ��)
	
	
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
	

	
	
	 //5. �̸��� "KIM"�� ���µ� ���
	 
	public Account[] findByName(String name) {
		int count = 0;
		// �����ϴ� Account���� �˾Ƴ���
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getOwner().equals(name)) {
				count++;
			}
		}
		Account[] aa = new Account[count];
		int index=0;
		// �����ϴ� Account�ּҵ� �ֱ�
		for (int j = 0; j < accounts.length; j++) {
			if (accounts[j].getOwner().equals(name)) {
				 aa[index] = accounts[j];
				 index++;
			}
		}
		return aa;
	}
/*
 * 6. ����	
 */
	
	 //�̸�����
	 /*
	public void sort(int memberType, int sortType) {
		//�̸����� ��������
		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts.length-1; j++) {				//9����
				String jOwner1=accounts[j].getOwner();  			//�̸������� ��Ʈ������ ����
				String jOwner2=accounts[j+1].getOwner();  			//�̸������� ��Ʈ������ ����
				if (jOwner1.compareTo(jOwner2)>0) {						//�񱳰��� 0���� ũ�� �������� ����
					Account tempAccount = accounts[j];
					accounts[j] = accounts[j+1];
					accounts[j+1]=tempAccount;
				}
			}
		}
		
		

	}
	*/
