package com.itwill.lotto;
//��ȣ����, ���(�����Ͻ���ü)
public class LottoManager {
	
	public static int MONEY=1000;
	LottoManager lot = new LottoManager();
	
	/*
	 *  �ζ� 1set ����(�ߺ��Ǹ�ȵ�)
	 */
	public int[] lotMachine(int cnt) {
		
		int[] lot1 = new int[6];
		
		for (int i = 0; i <lot1.length; i++) { // 6�� ������
				double dr = Math.random(); // ��������
				lot1[i] = (int) (dr * 45) + 1; // ���� 45�� ���� ��Ʈ�迭��ü�� ����	
				for (int j = 0; j<i; j++) {
					if (lot1[i] == lot1[j]) { // �ߺ����� ������ �ѹ� �� ������
							i--;
							break;
					}
			}
	
		}
		return lot1;
		
	}

	/*
	 * �ԱݵǴ� ���� ���� �ζǹ�ȣset�� �ݺ��ؼ� ȣ���ϴ� �޼ҵ�
	 */
	
	public void lotByBucks(int bucks){
		int cnt = bucks /MONEY; //1000���� �Ѱ���
		
	}
	
	/*
	 * �����ȹ�ȣ ���
	 */
	public void print(){
		System.out.println();
	}

}
