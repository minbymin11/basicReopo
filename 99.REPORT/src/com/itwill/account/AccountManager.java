package com.itwill.account;
/*
 * Account ��ü���� ��������� ������
 * ���°�ü���� ������ �����ϴ� Ŭ����
 */
public class AccountManager {
	public static final int ASC=0;    //��������
	public static final int DESC=1;  //��������

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
	 * 1. �����µ� �������
	 */
	public void print() {
		// TODO Auto-generated method stub
		for (int i = 0; i < accounts.length; i++) {
			accounts[i].print();
		}
	}

	/*
	 *2. �ܰ�  90000�� �̻��� ���µ� ���� ���
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
	 * 3. ������ 3.0%�̻��� ���µ� ���� ���
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
	 *  4-1 ���¹�ȣ 5555�� ���� 1�� ���
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
	 * 4.-2 ���¹�ȣ 5555�� ã�Ƽ� 5000�� �Ա�(���)�� ���������� ���,( ��Ʈ�� ���� ��)
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
	 * 5. �̸��� "KIM"�� ���µ� ���
	 */
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
	/*
	 * �̸�����
	 */
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
		/*
		 * �ܰ�����
		 */
		

	}
}