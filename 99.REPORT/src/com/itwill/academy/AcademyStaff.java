package com.itwill.academy;

public class AcademyStaff extends AcademyPerson{
	public String depart;//ºÎ¼­
	public AcademyStaff() {
		// TODO Auto-generated constructor stub
	}
	public AcademyStaff(int no, String name, String depart) {
		super(no, name);
		//this.no=no;
		//this.name=name;
		this.depart = depart;
	}
	
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	public void print(){
		super.print();
		System.out.println(depart);
	}

}
