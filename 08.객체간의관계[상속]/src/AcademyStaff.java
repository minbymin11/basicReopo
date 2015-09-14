
public class AcademyStaff extends AcademyPerson {

	public String depart;// 부서

	// 생성자
	public AcademyStaff() {
	}
	
	public AcademyStaff(int no, String name, String depart) {
		this.no = no;
		this.name = name;
		this.depart = depart;
	}

	// getter setter
	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public void staffPrint() {
		this.personprint();
		System.out.println(depart);
	}

}
