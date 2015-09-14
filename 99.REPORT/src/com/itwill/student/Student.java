package com.itwill.student;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.omg.Messaging.SyncScopeHelper;

//������� ��� ĸ��ȭ�ϰ� ��� �޼ҵ带 ���� �и��ؾ߰ڴ�. ��������� �����(static), �����(static)
public class Student {
/*
 * �Ӽ�(�������)
 */
	private String studentNo;
	private String studentName;
	private int kor;
	private int eng;
	private int math;
	private int studentTotal;
	private double studentAvg;
	private char studentGrade;
	private int studentRank ;
	private static double classAvg;  //�����
	
	
	
	//������??
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String studentNo, String studentName, int kor, int eng, int math) {
		
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}

	
	//����޼ҵ�
	
	
	//����հ��
	public static void calculateBanAvg(){
	
	}
	
	//����(��ȣ, ����(����)  ),
	public static void sortByGrade(Student[] students){
		
	}
	
	//�������
	public void calcTotal(){
		this.studentTotal=this.kor+this.eng+this.math;
	}
	//��հ��
	public void calcAvg(){
		this.studentAvg = (this.kor + this.eng + this.math) / 3;
	}
	// �������
	public void calcRank(Student[] students) {
		// �л���ü ���� �ʱ�ȭ
		for (int i = 0; i < students.length; i++) {
			students[i].setStudentRank(1);
		}
		// �л���ü ���� ���
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i].getStudentTotal() < students[j].getStudentTotal()) {
					int oldRank = students[i].getStudentRank();
					int newRank = oldRank + 1;
					students[i].setStudentRank(newRank);
				}
			}
		}

	}

	//�������
	public void calcGrade(){
//		this.studentGrade = studentGrade;
		int str = (int) this.studentAvg / 10;

		if (0 > kor || 100 < kor || 0 > eng || 100 < eng || 0 > math || 100 < math) {
			System.out.println("��ȿ��������");
			return;
		}

		switch (str) {
		case 10:
		case 9:
			studentGrade = 'A';
			break;
		case 8:
			studentGrade = 'B';
			break;
		case 7:
			studentGrade = 'C';
			break;
		case 6:
			studentGrade = 'D';
			break;
		default:
			studentGrade = 'F';
			break;
		}

		
	}
	
	
	//getter, setter

	public static double getClassAvg() {
		return classAvg;
	}

	public static void setClassAvg(double classAvg) {
		Student.classAvg = classAvg;
	}

	

	public String getStudentNo() {
		return studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getStudentTotal() {
		return studentTotal;

	}

	public double getStudentAvg() {
		return studentAvg;
	}

	public char getStudentGrade() {
		return studentGrade;
	}

	public int getStudentRank() {
		return studentRank;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	public void setStudentTotal(int studentTotal) {
		this.studentTotal=studentTotal;

	}

	public void setStudentAvg(double studentAvg) {
		this.studentAvg=studentAvg;
	}

	public void setStudentRank(int studentRank) {
		this.studentRank = studentRank;
	}

	//�л��������
	public void headerPrint(){
		System.out.print("�й�\t"+"�̸�\t"+"����\t"+"����\t"+"����\t"+"���\t"+"����\t"+"����\t"+"����\n");
	}
	
	public void studentPrint(){

		System.out.println(this.studentNo+"\t"+this.studentName+"\t "
				+this.kor+"\t"+this.eng+"\t"+this.math+"\t"+this.studentAvg+"\t"+this.studentTotal+"\t"+this.studentGrade+"\t"+this.studentRank+"\n");
		
	}
}
