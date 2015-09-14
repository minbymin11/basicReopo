
public class Car {
	/**
	 * 속성(멤버변수)
	 * */
	public static final int FEE_PER_HOUR=1000;
	//차량번호
	private String no;
	//입차시간
	private int inTime;
	//출차시간
	private int outTime;
	//주차요금
	private int fee;
	
	/*
	 * 행위
	 */
	//입차시 데이타셋팅
	public void setIpChaData(String no, int inTime){
		this.no = no;
		this.inTime = inTime;
	}
	
	//요금계산
	public void calCulateFee(){
		this.fee = (this.outTime-this.inTime)*FEE_PER_HOUR;
	}
	
	//출력
	public void print(){
		System.out.println(this.no+"\t"+ this.inTime+"\t"+ this.outTime +"\t"+ this.fee+"\n");
		
	}
	
	//헤더출력
	public void headerPrint(){
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
	
		fee=(this.outTime-this.inTime)*1000;
		
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

	public int setFee(int fee) {
		
		this.fee = fee;
		
		return fee;
		
	}
	
	

}
