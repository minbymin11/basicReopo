package com.itwill.academy;

public class AcademyGangsa extends AcademyPerson{

	public String subject;//°ú¸ñ
	public AcademyGangsa() {
		// TODO Auto-generated constructor stub
	}
	public AcademyGangsa(int no, String name, String subject) {
		super(no, name);
		//this.no=no;
		//this.name=name;
		this.subject = subject;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print(){
		super.print();
		System.out.println(subject);
	}
	
}
