
public class AcademyPerson {
	public int no;
	public String name;
	public AcademyPerson() {
		// TODO Auto-generated constructor stub
	}
	
		
	public AcademyPerson(int no, String name) {
		//super();
		this.no = no;
		this.name = name;
	}


	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void print(){
		System.out.print(no+"\t"+name+"\t");
	}
	
}
