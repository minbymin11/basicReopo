
public class AcademyMain {

	public static void main(String[] args) {

		AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "KANG", "OFFICE");
		AcademyStudent st3 = new AcademyStudent(3, "SONG", "JAVA");
		
		AcademyGangsa gs1 = new AcademyGangsa(4, "SANG", "안드로메다");
		AcademyGangsa gs2 = new AcademyGangsa(5, "JANG", "DB");
		
		AcademyStaff sf1 = new AcademyStaff(6, "JUNG", "marketing");
		AcademyStaff sf2 = new AcademyStaff(7, "YU", "원장");
		
		//각 타입이 달라 배열 3개 생성
		AcademyStudent[] students = new AcademyStudent[3];
		AcademyGangsa[] gansas = new AcademyGangsa[2];
		AcademyStaff[] staffs = new AcademyStaff[2];
		
		students[0] = st1;
		students[1] = st2;
		students[2] = st3;
		
		gansas[0] = gs1;
		gansas[1] = gs2;
		
		staffs[0] = sf1;
		staffs[1] = sf2;
		
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
		for (int i = 0; i < gansas.length; i++) {
			gansas[i].print();
		}
		for (int i = 0; i < staffs.length; i++) {
			staffs[i].print();
		}
		
	}

}
