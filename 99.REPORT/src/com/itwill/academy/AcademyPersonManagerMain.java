package com.itwill.academy;

public class AcademyPersonManagerMain {

	public static void main(String[] args) {
		AcademyPersonManager apm=new AcademyPersonManager();
		
		//전체출력
		apm.print();
		
		//학생,강사,스텝,OP 출력
		System.out.println("------Student-------");
		apm.print(AcademyPersonManager.STUENT_TYPE);
		System.out.println("------Gangsa-------");
		apm.print(AcademyPersonManager.GANGSA_TYPE);
		
		
		/*
		 * AcademyStudent(AcademyStaff,AcademyGangsa,AcademyOperator) 추가
		 */
		AcademyGangsa ag=new AcademyGangsa(23, "KIM", "OFFICE");
		AcademyOperator ao=new AcademyOperator(45, "HONG", "LAN");
		AcademyStudent as=new AcademyStudent(88, "SANG", "JAVA");
		AcademyStaff asf=new AcademyStaff(90, "KIL", "홍보");
		
		apm.addPerson(ag);
		apm.addPerson(as);
		apm.addPerson(ao);
		apm.addPerson(asf);
		System.out.println("---------------addPerson-------------");
		apm.print();
		
		
		//수정
		apm.updatePerson(1, "park", "OS" );
		
		
		//삭제
		
		apm.deleteByPerson(2);
		apm.print();
				
		//번호로 찾기
		AcademyPerson aNo = apm.findByNo(1);
		System.out.println("----------findPersonByNo----------------");
		aNo.print();
		
		
		//이름으로찾기
		System.out.println("-----------findPersonByName---------");
		AcademyPerson aName = apm.findByName("KIM");
		aName.print();
				
		//반,부서,과목,기술로 찾기

		
	}
}

