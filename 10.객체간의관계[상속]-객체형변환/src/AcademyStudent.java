
public class AcademyStudent extends AcademyPerson {
	
		public String ban;
		public AcademyStudent() {
			// TODO Auto-generated constructor stub
		}
		public AcademyStudent(int no, String name, String ban){
			super(no, name);
			//this.no=no;
			//this.name=name;
			this.ban=ban;
			
		}
		public String getBan() {
			return ban;
		}
		public void setBan(String ban) {
			this.ban = ban;
		}
		public void print() {
			super.print();
			System.out.println(ban);
		}
	
}
