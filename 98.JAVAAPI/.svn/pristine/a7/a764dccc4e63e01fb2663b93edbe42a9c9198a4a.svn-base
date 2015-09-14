package com.itwill.util.collection;

public class Student {
	/*
	 * 속성(멤버변수)
	 */
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private double pAvg;
	private char grade;
	private int rank;//석차
	
	
	/*
	 *반전체평균
	 */
	private static double banAvg;
	
	
	public Student() {
	}
	public Student(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	/*
	 * 행위(멤버메쏘드)
	 */
	public void setStudentInfo(int no, String name){
		this.no = no;
		this.name = name;
	}
	public void setScore( int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public void calculateTot(){
		this.tot=this.kor+this.eng+this.math;
	}
	public void calculateAvg(){
		this.avg=this.tot/3.0;
		this.pAvg = (((int)(this.avg*10))+5)/10.0;
	}
	public void calculateGrade(){
		if(this.avg>=90 && this.avg<=100){
			this.grade='A';
		}else if(this.avg>=80 && this.avg<90){
			this.grade='B';
		}else if(this.avg>=70 && this.avg<80){
			this.grade='C';
		}else if(this.avg>=60 && this.avg<70){
			this.grade='D';
		}else if(this.avg>=0 && this.avg<60){
			this.grade='F';
		}else{
			this.grade=' ';
		}
		
	}
	public void headerPrint(){
		System.out.println("---------------------------------------------------------------------");
		System.out.println(" 번호\t이름\t국어\t영어\t수학\t총점\t평균\t평점\t석차");
		System.out.println("---------------------------------------------------------------------");
	}
	public void print(){
		
		System.out.println("   "+no+"\t "+name+"\t "+kor+"\t "+eng+"\t "+math+"\t"+tot+"\t"+pAvg+"\t  "+grade+"\t  "+rank);
	}
	/*
	 * 
	 */
	/********************static************************/
	//평균계산
	public static void calculateBanAvg(Student[] students){
		double banAvgTot = 0;
		for (int i = 0; i < students.length; i++) {
			banAvgTot+=students[i].getAvg();
		}
		double banAvg = banAvgTot/students.length;
		Student.setBanAvg(banAvg);
		
	}
	//정렬(번호,석차(총점),국어,영어,수학)
	public static void calculateRank(Student[] students){
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length-1; j++) {
				if(students[j].getRank() > students[j+1].getRank()){
					Student tempStudent = students[j];
					students[j]=students[j+1];
					students[j+1]=tempStudent;
				}
			}
		}
		
		
	}
	/****************************************************/
	//getter,setter
	public static double getBanAvg() {
		return banAvg;
	}
	public static void setBanAvg(double banAvg) {
		Student.banAvg = banAvg;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
