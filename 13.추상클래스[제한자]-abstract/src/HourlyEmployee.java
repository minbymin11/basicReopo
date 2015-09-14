
public class HourlyEmployee extends Employee{
	
	private int payFerHour; //�ð����ӱ�
	private int worksHour; //���ѽð�
	
	
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public HourlyEmployee(int no, String name, int payPerHour, int worksHour){
		super(no, name);
		this.payFerHour = payPerHour;
		this.worksHour = worksHour;
	}
	
	@Override
	public void calcSalary() {
		setSalary(payFerHour*worksHour);
	}
	

	public int getPayFerHour() {
		return payFerHour;
	}

	public int getWorksHour() {
		return worksHour;
	}

	public void setPayFerHour(int payFerHour) {
		this.payFerHour = payFerHour;
	}

	public void setWorksHour(int worksHour) {
		this.worksHour = worksHour;
	}
}
