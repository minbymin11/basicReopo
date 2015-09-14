
public class CompanyEmployeeAbsractMain {

	public static void main(String[] args) {
		
		//Employee[] emps=new Employee[5];
		Employee[] emps={
				new SalaryEmployee(1, "KIM", 30000000),
				new SalaryEmployee(2, "YU", 10000000),
				new SalaryEmployee(3 ,"JUNG", 24000000),
				new HourlyEmployee(4, "HA", 10000, 150),
				new HourlyEmployee(5, "PARK", 10000, 98)
		};

		
	}
	

}
