
public class AcademyStudent extends AcademyPerson {

	public String ban;

	// 생성자
	public AcademyStudent() {
	}

	// AcademyPerson(부모)로부터 no랑 name 상속 받았음
	public AcademyStudent(int no, String name, String ban) {
		this.no = no;
		this.name = name;
		this.ban = ban;

		// getter setter
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public void studentPrint() {
		this.personprint();
		System.out.println(ban);
	}

}
