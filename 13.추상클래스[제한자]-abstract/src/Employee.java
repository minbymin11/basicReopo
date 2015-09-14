
public abstract class Employee {

	private int no;//사번
	private String name;// 이름
	private int salary;//급여
	//private int incet;//인센티브

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name= name;
	}
	//인센티브 계산
	//public absract void calcIncet(); 
	
	
	//급여계산
	public abstract void calcSalary();
	
	
	public void print(){
		System.out.println(this.getSalary());
	}
	
	
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
