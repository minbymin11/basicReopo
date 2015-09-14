public class AcademyMain {

	public static void main(String[] args) {


		AcademyGangsa gs1 = new AcademyGangsa(4, "SANG", "안드로메다");
		AcademyGangsa gs2 = new AcademyGangsa(5, "JANG", "DB");

		AcademyStaff sf1 = new AcademyStaff(6, "JUNG", "marketing");
		AcademyStaff sf2 = new AcademyStaff(7, "YU", "원장");

		// 각 타입이 달라 배열 3개 생성
		AcademyGangsa[] gansas = new AcademyGangsa[2];
		AcademyStaff[] staffs = new AcademyStaff[2];


		gansas[0] = gs1;
		gansas[1] = gs2;

		staffs[0] = sf1;
		staffs[1] = sf2;
		
		/*
		* AcademyStudent타입 st에 1,"kim","linux" 넣음
		*
		* AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		* AcademyStudent st2 = new AcademyStudent(2, "KANG", "OFFICE");
		* AcademyStudent st3 = new AcademyStudent(3, "SONG", "JAVA");
		*
		* AcademyStudent[] students = new AcademyStudent[3];  //AcademyStudent배열 타입 student를 3개 만들어줌
		*
		*AcademyStudent 배열 타입으로 선언된 student[0]에 AcademyStudent타입으로 만든 st1을 넣어줌 student[0]이랑 st1은 타입이 같아서 들어감
		* students[0] = st1;																					
		* students[1] = st2;				
		* students[2] = st3;
		*/
		//위에 배열 만든것을 밑에 처럼 바꿔 쓸 수 있음
		AcademyStudent[] students= {
									new AcademyStudent(1,"KIM", "LINUX"),
									new AcademyStudent(2,"KANG", "OFFICE"),
									new AcademyStudent(3,"SONG", "JAVA")
		};
		
		for (int i = 0; i < students.length; i++) {
			students[i].studentPrint();
		}
		for (int i = 0; i < gansas.length; i++) {
			gansas[i].gangsaprint();
		}
		for (int i = 0; i < staffs.length; i++) {
			staffs[i].staffPrint();
		}

	}

}
