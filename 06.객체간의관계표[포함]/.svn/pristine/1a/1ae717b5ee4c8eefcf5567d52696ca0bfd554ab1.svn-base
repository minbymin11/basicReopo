//멤버변수 모두 캡슐화하고 계산 메소드를 각각 분리해야겠다. 헤더프린터 만들고

public class StudentArrayMain {

	public static void main(String[] args) {
		/*
		 * Student[] students=new Student[3];
		 * 
		 * students[0]=new Student();
		 * students[1]=new Student();
		 * students[2]=new Student();
		 * 
		 */
		//	Student[] students = new Student[3];
	
		Student[] students={
				new Student(1,"KIM",44,67,81),
				new Student(2,"AIM",45,67,81),
				new Student(3,"BIM",65,65,85),
				new Student(4,"VIM",75,64,87),
				new Student(5,"HIM",85,62,89),
				new Student(6,"OIM",35,64,88),
				new Student(7,"SIM",45,68,86),
				new Student(8,"ZIM",55,69,84),
				new Student(9,"RIM",65,60,82),
				new Student(10,"FIM",75,61,80),
				
				};
		
		students[0].headerPrint();
		for (int i = 0; i < students.length; i++) {
			//계산
			students[i].calcTotal();
			students[i].calcAvg();
			students[i].clacGrade();
			
			
			//출력
			students[i].studentPrint();
		}
		
		
		
		//1. 반전체평균계산
		double banAvgTot = 0;
		for (int i = 0; i < students.length; i++) {
		
			banAvgTot+=students[i].getStudentAvg();
		}
		double banAvg = banAvgTot/students.length;
		Student.setClassAvg(banAvg);
		System.out.println("반평균: " + Student.getClassAvg());
		
		//석차계산
		Student.calRank(students);
		for (int i = 0; i < students.length; i++) {
			students[i].studentPrint();
		}
		/*
		 * 2. 전제학생들 정보 출력
		 */
		
		/*
		 * 3. 학번 3번학생 1명 정보 출력
		 */
		
		/*
		 * 4.학점이 A학점인 학생들 출력
		 */
		
		/*
		 * 5. 석차 3등까지 학생들 정보출력 
		 */
		

		/*
		 * 6. 국어점수 60점 이하 학생들 출력
		 */
		
		/*
		 * 7. 이름이 "KIM"인 학생들 출력
		 */
		
	}
	
	
}
