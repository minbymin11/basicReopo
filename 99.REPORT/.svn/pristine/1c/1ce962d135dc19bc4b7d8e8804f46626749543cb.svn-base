package com.itwill.student;

public class StudentManagerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		StudentManager sm = new StudentManager();
		
		//1-1학생전체 석차 초기화
		//1-2학생 전체 석차 계산
		
		
		/*
		 * 2. 전체학생들 정보출력
		 */
		//
		System.out.println("2.전체.................");
		sm.stCalc();
		sm.headerPrint();
		sm.print();
	
		
		/*
		 * 3. 학번 인자로 받아서 학생 1명 참조변수 반환
		 */
		System.out.println("3.학번..................");
		Student sm1=sm.findByNo("1");
		sm1.studentPrint();
		
		
		/*
		 * 4. 학점인자로 받아서 학생들 참조변수반환
		 */
		System.out.println("4.학점..................");
		Student[] sm2=sm.findByGrade('D');
		for (int i = 0; i < sm2.length; i++) {
			sm2[i].studentPrint();
		}
		/*
		 * 5. 석차인자로 받아서 학생(들) 반환
		 */
		System.out.println("5.석차.................");
		Student sm3=sm.findByRank(5);
		sm3.studentPrint();
		
		/*
		 * 6. 점수입력 받아서  점수 입력받은 점수 이하 학생들 반환
		 */
		System.out.println("6.점수.................");
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
		 * 7. 이름 입력받아서 학생들 반환
		 */
		System.out.println("7.이름..................");
		Student[] sm7 = sm.findByStName("ZIM");
		for (int i = 0; i < sm7.length; i++) {
			sm7[i].studentPrint();
		}
		
		/*
		 * 9. 석차로 오름차순정렬해주세요
		 */
	//	Student{} sm8 = sm.sortByAsc();
	}

}
