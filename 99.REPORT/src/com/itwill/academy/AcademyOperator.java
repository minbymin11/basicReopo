package com.itwill.academy;

public class AcademyOperator extends AcademyPerson{
	public String technic;
	public AcademyOperator() {
		// TODO Auto-generated constructor stub
	}
	
	public AcademyOperator(int no,String name,String technic) {
		super(no, name);
		//this.no=no;
		//this.name=name;
		this.technic = technic;
	}

	public String getTechnic() {
		return technic;
	}
	public void setTechnic(String technic) {
		this.technic = technic;
	}
	@Override
	public void print() {
		super.print();
		System.out.println(this.technic);
	}
	
}
