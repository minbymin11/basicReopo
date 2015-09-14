package com.itwill.student;
 
public class StudentManager {

	Student[] students={
			new Student("1","KIM",44,67,81),
			new Student("2","AIM",45,67,81),
			new Student("3","BIM",65,65,85),
			new Student("4","VIM",75,64,87),
			new Student("5","HIM",85,62,89),
			new Student("6","OIM",35,64,88),
			new Student("7","SIM",45,68,86),
			new Student("8","ZIM",55,69,84),
			new Student("9","RIM",65,60,82),
			new Student("10","FIM",75,61,80),
			};

	/*
	 * 1-1.��ü�л��������
	 */
	public void stCalc(){
		for (int i = 0; i < students.length; i++) {
			students[i].calcTotal();
			students[i].calcAvg();;
			students[i].calcGrade();
			students[i].calcRank(students);
		}
	}
	
	/*
	 * 1-2.�л��������
	*/
	
	//�л���ü ���� �ʱ�ȭ
	// �л���ü ���� ���
	
	/*
	 * 2.��ü�л��� �������
	 */
	public void print(){
		for (int i = 0; i < students.length; i++) {
			students[i].studentPrint();
		}
	}

	/*
	 * 3.�й� ���ڷι޾Ƽ� �л�1�� �������� ��ȯ
	 */
	
	public Student findByNo(String studentNo) {
		// TODO Auto-generated method stub
		Student stArr = null;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getStudentNo() == studentNo) {
				stArr = students[i];
			}
		}
		return stArr;
	}

	/*
	 * 4.�������ڷ� �޾Ƽ� �л��� ����������ȯ 
	 */
	public Student[] findByGrade(char studentGrade) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getStudentGrade()==studentGrade) {
				count++;		
			}	
		}
		Student[] st = new Student[count];
		int index=0;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStudentGrade()==studentGrade){
				st[index] = students[i];
				 index++;
			}
				
		}
		return st;
		
	}

	/*
	 * 5.�������ڷι޾Ƽ� �л�(��) ��ȯ 
	 */
	public Student findByRank(int studentRank) {
		// TODO Auto-generated method stub
		Student stArr=null;
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStudentRank()==studentRank){
				stArr=students[i];
			}
		}
		return stArr;
	}


	/*
	 * 6.����(����,����,����)�Է¹޾Ƽ�  �������� �л��� ��ȯ
	 */

	public Student[] findByKorScore(int korScore) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getKor()==korScore) {
				count++;
				
			}
		}
		Student [] korArr = new Student[count];
		int index=0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getKor()==korScore){
				korArr[index] = students[i];
				index++;
			}
		}
		return korArr;
	}
	

	public Student[] findByEngScore(int engScore) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getEng()==engScore) {
				count++;
				
			}
		}
		Student [] engArr = new Student[count];
		int index=0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getEng()==engScore){
				engArr[index] = students[i];
				index++;
			}
		}
		return engArr;
	}
	public Student[] findByMathScore(int mathScore) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getMath()==mathScore) {
				count++;
				
			}
		}
		Student [] mathArr = new Student[count];
		int index=0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getMath()==mathScore){
				mathArr[index] = students[i];
				index++;
			}
		}
		return mathArr;
	}


	/*
	 * 7.�̸����ڷι޾Ƽ� �л�(��) ��ȯ
	 */
	public Student[] findByStName(String stName) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getStudentName()==stName) {
				count++;
			}
			
		}
		int index=0;
		Student[] stArr = new Student[count];
		for (int i = 0; i < students.length; i++) {
			if (students[i].getStudentName()==stName){
				stArr[index] = students[i];
			}
		}
		return stArr;
	}
	/*
	 * 8.������������ ���� 
	 */
	public void sortByAsc() {
		// TODO Auto-generated method stub
		Student[] stArr = new Student [students.length];
		Student[] temp = new Student [students.length];
		
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i].getStudentRank()==students[j].getStudentRank()) {
						temp[i] = students[i];
						students[i]=students[j];
						students[j]=temp[i];
					}
			//	stArr[i]=
			}
			
		}
		
	}

	
	//�л��������
	public void headerPrint(){
		System.out.print("�й�\t"+"�̸�\t"+"����\t"+"����\t"+"����\t"+"���\t"+"����\t"+"����\t"+"����\n");
	}
	







}
