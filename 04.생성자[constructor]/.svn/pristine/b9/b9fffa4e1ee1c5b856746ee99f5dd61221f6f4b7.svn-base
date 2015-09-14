

public class Car {
	/**
	 * 속성(멤버변수)
	 * */
	private String no;
	private int inTime;
	private int outTime;
	public int fee;
	
	private static int FEEPERHOUR;
	
	/*
	 * 행위
	 */
	//입차시 데이타셋팅
	
	
	/////생성자(constructor)
	
	public Car() {
		// TODO Auto-generated constructor stub
		Car.FEEPERHOUR=1000;//초기화
	}
	
	public Car(String no, int inTime) {
		this.setNo(no);
		this.setInTime(inTime);
		this.setOutTime(outTime);
	}
	
	public void setIpChaData(String no, int inTime){
		this.no = no;
		this.inTime = inTime;
	}

	//요금계산
	public void calCulateFee(){
		this.fee = (this.outTime-this.inTime)*Car.FEEPERHOUR;
		
	}
	
	//출력
	public void print(){
		System.out.println(this.no+"      \t"+ this.inTime+"      \t"+ this.outTime +"         \t"+ this.fee+"\n");
		
	}
	
	//헤더출력
	public static void headerPrint(){
		System.out.println("----------------------------------------------");
		System.out.println("번호 \t 입차 \t 출차 \t 요금");
		System.out.println("----------------------------------------------");
	}

	//getter setters
	
	public String getNo() {
		return no;
	}

	public int getInTime() {
		return inTime;
	}

	public int getOutTime() {
		return outTime;
	}

	public int getFee() {
	
		
		return fee;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}

	public void setFee(int fee) {	
		this.fee = fee;
		
		
	}
	
	

}
