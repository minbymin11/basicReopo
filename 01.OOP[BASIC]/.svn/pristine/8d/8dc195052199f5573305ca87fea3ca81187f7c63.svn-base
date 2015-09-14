/**
 * 
 * 이 클래스는 주차장에있는 차객체를 추상화한 클래스 입니다.
 * @author Administrator
 * @since   8.24
 * @version 0.1
 */
public class Car {
	/**
	 * 속성(멤버변수)
	 * */

	/**
	 * 차량번호
	 */
	public String no;
	/**
	 * 입차시간
	 */
	public int inTime;
	/**
	 * 출차시간
	 */
	public int outTime;
	/**
	 * 주차요금
	 */
	public int fee;
	
	/*
	 * 행위
	 */
	
	/**
	 * 입차시데이타셋팅
	 * @param no 차량번호
	 * @param inTime 입차시간
	 */
		public void setIpChaData(String no, int inTime){
		this.no = no;
		this.inTime = inTime;
	}
	
	/**
	 * 요금계산
	 */
	public void calCulateFee(){
		this.fee = (this.outTime-this.inTime)*100;
	}
	
	/**
	 * 차량 정보 출력
	 */
	public void print(){
		System.out.println(this.no+"\t"+ this.inTime+"\t"+ this.outTime +"\t"+ this.fee+"\n");
		
	}
	
	/**
	 * 헤더출력
	 */
	public void headerPrint(){
		System.out.println("----------------------------------------------");
		System.out.println("번호 \t 입차 \t 출차 \t 요금");
		System.out.println("----------------------------------------------");
	}
	

}
