package com.itwill.academy;

public class AcademyPersonManager {
	public static final int STUENT_TYPE = 0;
	public static final int GANGSA_TYPE = 1;
	public static final int STAFF_TYPE = 2;
	public static final int OPERATOR_TYPE = 3;
	private AcademyPerson[] personArray;

	public AcademyPersonManager() {
		personArray = new AcademyPerson[30];
		init();
	}

	public AcademyPersonManager(int count) {
		personArray = new AcademyPerson[count];
		init();
	}

	private void init() {
		personArray[0] = new AcademyStudent(1, "KIM", "LINUX");
		personArray[1] = new AcademyStudent(2, "KANG", "OFFICE");
		personArray[2] = new AcademyStudent(3, "SONG", "JAVA");
		personArray[3] = new AcademyGangsa(4, "SANG", "안드로메다");
		personArray[4] = new AcademyGangsa(5, "CHOI", "DB");
		personArray[5] = new AcademyStaff(6, "SIM", "MARKETING");
		personArray[6] = new AcademyStaff(7, "HIM", "원장");
		personArray[7] = new AcademyOperator(8, "CIM", "게임");
		personArray[8] = new AcademyOperator(9, "VIM", "PC정비");
	}

	/*
	 * 1.Academy의 모든구성원출력
	 * 2.AcademyStudent,AcademyStaff,AcademyGangsa,AcademyOperator
	 */
	public void print() {
		for (AcademyPerson academyPerson : personArray) {
			if (academyPerson != null)
				academyPerson.print();
		}
	}

	public void print(int type) {
	
		switch (type) {
		case AcademyPersonManager.STUENT_TYPE:
			for (int i = 0; i < personArray.length; i++) {
				//System.out.println(personArray[i]);
				if (personArray[i] instanceof AcademyStudent) {
					personArray[i].print();
				}
			}
			break;
		case AcademyPersonManager.GANGSA_TYPE:
			for (int i = 0; i < personArray.length; i++) {
				if (personArray[i]!=null&&personArray[i] instanceof AcademyGangsa) {
					personArray[i].print();
				}
			}
			break;
		case AcademyPersonManager.STAFF_TYPE:
			for (int i = 0; i < personArray.length; i++) {
				if (personArray[i]!=null&&personArray[i] instanceof AcademyStaff) {
					personArray[i].print();
				}
			}
			break;
		case AcademyPersonManager.OPERATOR_TYPE:
			for (int i = 0; i < personArray.length; i++) {
				if (personArray[i]!=null&&personArray[i] instanceof AcademyOperator) {
					personArray[i].print();
				}
			}
			break;
		}

	}
	
	/*
	 * 1.AcademyPerson 추가
	 */
	public void addPerson(AcademyPerson ap) {
		for (int i = 0; i < personArray.length; i++) {
			if(personArray[i]==null){
				personArray[i]=ap;
				break;
			}
		}
	}

	/*
	 * public void addStudent(AcademyStudent as){
	 * 
	 * } 
	 * public void addStaff(AcademyStaff as){
	 * 
	 * } 
	 * public void addGangsa(AcademyGangsa ag){
	 * 
	 * } 
	 * public void addOperator(AcademyOperator ao){
	 * 
	 * }
	 */
	public AcademyPerson findByNo(int no) {
		AcademyPerson ac = null;
		for (int i = 0; i < personArray.length; i++) {
			if(personArray[i]!=null &&personArray[i].getNo()==no){
				ac=personArray[i];
			}
		}
		return ac;
	}
/*
 * 이름으로 찾아봐
 */
	public AcademyPerson findByName(String name) {
		AcademyPerson ac = null;
		for (int i = 0; i < personArray.length; i++) {
			if(personArray[i]!=null &&personArray[i].getName().equals(name)){
					ac=personArray[i];
			}
		}
		return ac;

	}

	public AcademyPerson[] findByEtc(int type, String etc) {
		return null;
	}
	public AcademyPerson[] findByEtc(AcademyPerson ap) {
		return null;
	}
	/*
	 * public AcademyStudent[] findByBan(String ban){
	 * 
	 * } public AcademyStaff[] findByDepart(String depart){
	 * 
	 * } public AcademyGangsa[] findBySubject(String subject){
	 * 
	 * } public AcademyOperator[] findByTechnic(String technic){
	 * 
	 * }
	 */

	/*
	 * 3 . 수정
	 * 이거 개쩐다 진심 ㄷㄷㄷ
	 */
	public void updatePerson(int no, String name, String subject) {
		for (int i = 0; i < personArray.length; i++) {
			if(personArray[i]!=null&&personArray[i].getNo()==no){
				if(personArray[i] instanceof AcademyStudent){
					personArray[i]=null;
					personArray[i]= new AcademyStudent (no, name, subject);
				}else if(personArray[i] instanceof AcademyGangsa){
					personArray[i]=null;
					personArray[i]= new AcademyStudent (no, name, subject);
				}else if(personArray[i] instanceof AcademyOperator){
					personArray[i]=null;
					personArray[i]= new AcademyStudent (no, name, subject);
				}else if(personArray[i] instanceof AcademyStaff){
					personArray[i]=null;
					personArray[i]= new AcademyStudent (no, name, subject);
				}
				
			}
		}	
		
		
	}
	/*
	 * public void updateStudent(int no,String name,String ban){
	 * 
	 * }
	 * public void updateStudent(AcademyStudent updateStudent){
	 * 
	 * } 
	 * public void updateStaff(AcademyStaff academyStaff){
	 * 
	 * } 
	 * public void updateGangsa(AcademyGangsa academyGangsa){
	 * 
	 * } 
	 * public void updateOperator(AcademyOperator academyOperator){
	 * 
	 * }
	 */

	/*
	 * 4. 삭제
	 */
	public void deleteByPerson(int no) {
		for (int i = 0; i < personArray.length; i++) {
			if(personArray[i]!=null &&personArray[i].getNo()==no){
				personArray[i]=null;
			}
		}
		System.out.println(no+"삭제");
		return;
		
	}
	public void deleteByPerson(int no, String name) {
		for (int i = 0; i < personArray.length; i++) {
			if(personArray[i]!=null&&personArray[i].getNo()==no &&personArray[i].getName().equals(name)){
					personArray[i]=null;
			}
		}
		return ;
	}
		
}

