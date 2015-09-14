
public class AcademyGangsa extends AcademyPerson {

	public String subject;// 引鯉

	// 持失切
	public AcademyGangsa() {
	}

	public AcademyGangsa(int no, String name, String subject) {
		this.no = no;
		this.name = name;
		this.subject = subject;
	}

	// getter setter
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void gangsaprint() {
		this.personprint();
		System.out.println(subject);
	}

}
