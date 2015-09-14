package com.itwill.student;

public class StudentArrayStaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 * 1-1. 전체학생성적계산
		 * 1-2. 학생석차계산
		 */
		students[0].headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].calcTotal();
			students[i].calcAvg();
			students[i].calcGrade();
		}
		
		
		for (int i = 0; i < students.length; i++) {
			students[i].setStudentRank(1);
		}
		
		//학생 석차계산
		for (int i = 0; i < students.length; i++) {
			students[i].calcRank(students);
			
		}

		
				
		/*
		 * 2. 전체학생들 정보출력
		 */
		for (int i = 0; i < students.length; i++) {
			students[i].studentPrint();
			
		}
		
		/*
		 * 3. 학번 3번 1명 학생정보출력
		 */
		students[0].headerPrint();
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStudentNo().equals("3")){
				students[i].studentPrint();
				
			}
		}
		
		/*
		 * 4.학점이 A학점인 학생들 출력
		 */
//		for (int i = 0; i < students.length; i++) {
//			if(students[i].getStudentGrade()>)
//		}
		
		/*
		 * 5. 석차 3등까지 학생들 정보출력 
		 */
		
		/*
		 * 6. 국어점수 60점 이하 학생들 출력
		 */
		students[0].headerPrint();
		for (int i = 0; i < students.length; i++) {
			if(students[i].getKor()<60){
				students[i].studentPrint();
			}
		}
		
		/*
		 * 7. 이름이 "KIM"인 학생들 출력
		 */
		students[0].headerPrint();
		for (int i = 0; i < students.length; i++) {
			if(students[i].getStudentName().equals("KIM")){
				students[i].studentPrint();
			}
		}

	}

}
