package com.itwill.student;

public class StudentManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		StudentManager sm = new StudentManager();
		
		//1-1�л���ü ���� �ʱ�ȭ
		//1-2�л� ��ü ���� ���
		
		
		/*
		 * 2. ��ü�л��� �������
		 */
		//
		System.out.println("2.��ü.................");
		sm.stCalc();
		sm.headerPrint();
		sm.print();
	
		
		/*
		 * 3. �й� ���ڷ� �޾Ƽ� �л� 1�� �������� ��ȯ
		 */
		System.out.println("3.�й�..................");
		Student sm1=sm.findByNo("1");
		sm1.studentPrint();
		
		
		/*
		 * 4. �������ڷ� �޾Ƽ� �л��� ����������ȯ
		 */
		System.out.println("4.����..................");
		Student[] sm2=sm.findByGrade('D');
		for (int i = 0; i < sm2.length; i++) {
			sm2[i].studentPrint();
		}
		/*
		 * 5. �������ڷ� �޾Ƽ� �л�(��) ��ȯ
		 */
		System.out.println("5.����.................");
		Student sm3=sm.findByRank(5);
		sm3.studentPrint();
		
		/*
		 * 6. �����Է� �޾Ƽ�  ���� �Է¹��� ���� ���� �л��� ��ȯ
		 */
		System.out.println("6.����.................");
		Student[] sm4 = sm.findByKorScore(44);
		for (int i = 0; i < sm4.length; i++) {
			sm4[i].studentPrint();
		}
		Student[] sm5 = sm.findByEngScore(69);
		for (int i = 0; i < sm5.length; i++) {
			sm5[i].studentPrint();
		}
		Student[] sm6 = sm.findByMathScore(80);
		for (int i = 0; i < sm6.length; i++) {
			sm6[i].studentPrint();
		}
		/*
		 * 7. �̸� �Է¹޾Ƽ� �л��� ��ȯ
		 */
		System.out.println("7.�̸�..................");
		Student[] sm7 = sm.findByStName("ZIM");
		for (int i = 0; i < sm7.length; i++) {
			sm7[i].studentPrint();
		}
		
		/*
		 * 9. ������ ���������������ּ���
		 */
	//	Student{} sm8 = sm.sortByAsc();
	}

}
