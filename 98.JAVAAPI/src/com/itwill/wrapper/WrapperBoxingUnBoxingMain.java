package com.itwill.wrapper;

public class WrapperBoxingUnBoxingMain {

	public static void main(String[] args) {
		Integer wi1 = new Integer(12);
		//auto boxing ����ó�� �ؾߵǴµ� �ؿ� ó�� �ᵵ ��
		Integer wi2 = 23;
		
		int pi1 = wi1.intValue();
		//auto unboxing ���� ó�� �Ⱦ��� �׳� �־ ��(�ּҰ�)=���� �����ü� ����
		int pi2 = wi2;
		
		Integer[] wiArr1=new Integer[3];
		wiArr1[0] = new Integer(1);
		//���� ó�� �� �ʿ� ����
		//�ؿ� ó�� boxing�ϸ��
		wiArr1[1] =2;
		wiArr1[2] = 3;
		//unboxing
		for (int i = 0; i < wiArr1.length; i++) {
			int tempInt=wiArr1[i];
			System.out.println(tempInt);
		}
		Object[] oArr = new Object[3];
		oArr[0]= new Integer(1);
		//���� ó�� �� �ʿ� ����
		//�ؿ� ó�� boxing�ϸ��
		oArr[1]=2;
		oArr[2]=3;
		//unboxing
		for (int i = 0; i < oArr.length; i++) {
			int tempInt = (Integer)oArr[i]; //Object Ÿ���̶� ��Ƽ�� Ÿ������ casting�ؾߴ�
			System.out.println(tempInt);
		}
		
		/************����****************/
		Integer wi31 = new Integer(30);
		Integer wi41 = new Integer(40);
		Integer wi5 = new Integer(50);
		
		//�ּҳ��� ������ ������?���������ϵ�
		int result = wi31 + wi41;
		result = wi31 - wi5;
		result = wi31 -20;
		boolean bResult = wi31< wi5;  //�ּҳ��� ��Ҹ� ������? ��������
		bResult = wi31>500;
		
		System.out.println("---------------###����###--------------");
		
		if(wi31==30){
			System.out.println("wi3==30: "+"���� ����");
		}
		//�ּҳ��� ���� �ּҷ� ����
		if(wi31==wi41){
			System.out.println("wi==wi4: "+"�ּҰ� ����");
		}else{
			System.out.println("wi!=wi4: "+ "�ּҰ� �ٸ���");
		}
		//���� ������ ���Ϸ��� equals() ���
		if(wi31.equals(wi41)){
			System.out.println("wi3 equals wi : ���� ����");
		}else{
			System.out.println("wi3 equals wi : ���� �ٸ���");
			
		}
		
		
	}

}
