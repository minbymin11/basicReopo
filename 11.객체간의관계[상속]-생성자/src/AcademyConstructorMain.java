
public class AcademyConstructorMain {

	public static void main(String[] args) {
				AcademyPerson[] personArr={
				new AcademyStudent(1, "KIM", "LINUX"),
				new AcademyStudent(2, "KANG", "OFFICE"),
				new AcademyStudent(3, "SONG", "JAVA"),
				new AcademyGangsa(4, "SANG", "안드로메다"),
				new AcademyGangsa(5, "JANG", "DB"),
				new AcademyStaff(6, "JUNG", "marketing"),
				new AcademyStaff(7, "YU", "원장"),
				new AcademyOperator(8, "CIM", "게임"),
				new AcademyOperator(9, "TIM", "PC정비")
		};
		for (int i = 0; i < personArr.length; i++) {
			personArr[i].print();
		}
		System.out.println("---------AcademyPersonPrint---------------");
		AcademyPersonPrint app=new AcademyPersonPrint();
		app.personPrint(personArr);
		
		
		System.out.println("--------------연산자(instanceof)");
		/*
		 *  - 형태 : 참조변수 instanseof 클래스이름(Type)
		 *  - 결과 : 논리형데이타반환
		 */
		AcademyPerson temAp=personArr[5];
		boolean isStudentObject = temAp instanceof AcademyStudent;
		System.out.println("isStudenttObject: "+ isStudentObject);
		if(isStudentObject){
			AcademyStudent tempAs=(AcademyStudent)temAp;
			System.out.println("Student ban: "+tempAs.getBan());
			
		}
		for (int i = 0; i < personArr.length; i++) {
			if (personArr[i] instanceof AcademyStudent) {
				AcademyStudent as=(AcademyStudent)personArr[i];
				System.out.println("Student:"+as.getBan());
			}
			if (personArr[i] instanceof AcademyStaff) {
				AcademyStaff af=(AcademyStaff)personArr[i];
				System.out.println("Staff:"+af.getDepart());

			}
			if (personArr[i] instanceof AcademyGangsa) {
				AcademyGangsa ag=(AcademyGangsa)personArr[i];
				System.out.println("Gangsa:"+ag.getSubject());

			}
			if (personArr[i] instanceof AcademyOperator) {
				AcademyOperator ao=(AcademyOperator)personArr[i];
				System.out.println("Operator:"+ao.getTechnic());

			}
		}
	}

}
