
public abstract class Employee {

	private int no;//���
	private String name;// �̸�
	private int salary;//�޿�
	//private int incet;//�μ�Ƽ��

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name= name;
	}
	//�μ�Ƽ�� ���
	//public absract void calcIncet(); 
	
	
	//�޿����
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
