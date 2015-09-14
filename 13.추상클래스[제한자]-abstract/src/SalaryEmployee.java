
public class SalaryEmployee extends Employee {

	private int annualSarary;
	public SalaryEmployee() {
		// TODO Auto-generated constructor stub
	}

	public SalaryEmployee(int no, String name, int annualSarary) {
		super(no, name);
		this.annualSarary = annualSarary;
	}

	@Override
	public void calcSalary() {
		// TODO Auto-generated method stub
		setSalary((annualSarary/12));
	}
	
	public int getAnnualSarary() {
		return annualSarary;
	}

	public void setAnnualSarary(int annualSarary) {
		this.annualSarary = annualSarary;
	}

}
