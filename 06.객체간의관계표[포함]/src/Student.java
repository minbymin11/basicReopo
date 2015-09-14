import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.omg.Messaging.SyncScopeHelper;

//멤버변수 모두 캡슐화하고 계산 메소드를 각각 분리해야겠다. 헤더프린터 만들고(static), 반평균(static)
public class Student {
/*
 * 속성(멤버변수)
 */
	private int studentNo;
	private String studentName;
	private int kor;
	private int eng;
	private int math;
	private int studentTotal;
	private double studentAvg;
	private char studentGrade;
	private int studentRank;
	private static double classAvg;  //반평균
	
	
	
	//생성자??
	
	public static double getClassAvg() {
		return classAvg;
	}

	public static void setClassAvg(double classAvg) {
		Student.classAvg = classAvg;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentNo, String studentName, int kor, int eng, int math) {
		
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}

	
	/*
	 * 멤버메소드
	 */
	//반평균계산
	//public static void calculateBanAvg(){
	//	
	//}
	
	//정렬(성적순  ),
	public static void calRank(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length - 1; j++) {
				if ((students[j]).getStudentTotal() > students[j + 1].getStudentTotal()) {
					Student tempStudent = students[j];
					students[j] = students[j + 1];
					students[j+1] = tempStudent;
				}
			}
		}
	}

	//총점계산
	public void calcTotal(){
		this.studentTotal=this.kor+this.eng+this.math;
	}
	//평균계산
	public void calcAvg(){
		this.studentAvg = (this.kor + this.eng + this.math) / 3;
	}
	//학점계산
	public void clacGrade(){
		int str = (int) this.studentAvg / 10;

		if (0 > kor || 100 < kor || 0 > eng || 100 < eng || 0 > math || 100 < math) {
			System.out.println("유효하지않음");
			return;
		}

		switch (str) {
		case 10:
		case 9:
			studentGrade = 'A';
			break;
		case 8:
			studentGrade = 'B';
			break;
		case 7:
			studentGrade = 'C';
			break;
		case 6:
			studentGrade = 'D';
			break;
		default:
			studentGrade = 'F';
			break;
		}

		
	}
	
	//getter, setter
	public int getStudentNo() {
		return studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getStudentTotal() {
		return studentTotal;

	}

	public double getStudentAvg() {
		return studentAvg;
	}

	public char getStudentGrade() {
		return studentGrade;
	}

	public int getStudentRank() {
		return studentRank;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setStudentRank(int studentRank) {
		this.studentRank = studentRank;
	}

	//헤더출력
	public void headerPrint(){
		System.out.print("학번\t"+"이름\t"+"국어\t"+"영어\t"+"수학\t"+"평균\t"+"총점\t"+"학점\t"+"석차\n");
	}
	//학생출력
	public void studentPrint(){

		System.out.println(this.studentNo+"\t"+this.studentName+"\t "
				+this.kor+"\t"+this.eng+"\t"+this.math+"\t"+this.studentAvg+"\t"+this.studentTotal+"\t"+this.studentGrade+"\t"+this.studentRank+"\n");
		
	}
}
