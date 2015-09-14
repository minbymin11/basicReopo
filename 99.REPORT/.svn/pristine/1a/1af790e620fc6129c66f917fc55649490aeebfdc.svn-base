package com.itwill.car;

public class CarManager {

	private Car[] cars;
	private int emptyCount;//빈주차장 구획수
	
	//생성자
	public CarManager() {
		cars=new Car[30];
		emptyCount=cars.length;
	}
	public CarManager(int count){
		cars=new Car[count];
		emptyCount=cars.length;
	}
	
	/*
	 * 입차(충복체크)
	 */
	
	
	/*
	 * 입차
	 */
	public  void ipCha(Car inCar) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null) {
				emptyCount--;
				cars[i] = inCar;
				break;
			}
		}
	}
	/*
	 * 전체차량출력
	 */
	public void print(){
		for (int i = 0; i < cars.length; i++) {
			if(cars[i]!=null){
				cars[i].print();
			}
		}
	}
	/*
	 * 주차장 주차된차량 전체대수반환
	 */
	private int getCarCount(){
		int count = 0;
		for (int i = 0; i < cars.length; i++) {
			if(cars[i]!=null){
				count++;
			}
		}
		return count;
	}
	/*
	 * 주차가능여부리턴
	 */
	public boolean isAvailable(){
		boolean isPark=true;
		if(getCarCount()>=cars.length){
			isPark=false;
		}
		return isPark;
	}
	/*
	 * 번호 입력 받아서 차량 1개 찾기
	 */
	public Car findByCarNo(String carNo) {
		Car carArr = null; //car객체 초기화(??)
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].getNo().equals(carNo)) {
				carArr = cars[i];
				break;
			}
		}
		return carArr;
	}
	
	/*
	 * -출차
	 * 번호,시간 영수증출력입력 받아서 출차 
	 */
	public Car carOut(String carNo, int outTime, boolean yesNo) {
		
		Car carArr=new Car();
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null && cars[i].getNo() == carNo) {
				cars[i].setOutTime(outTime);
				cars[i].calCulateFee();
				carArr = cars[i];
				cars[i]=null;
				emptyCount++;
			
				
				
			}
		}
		if(yesNo==true){
			return carArr;
		}else
			return null;
	
	}
	
	
	/*
	 * 입차시간 받아서 차량 여러개반환(입차시간이후에들어온차량)
	 */
	public Car[] findByInTime(int inTime) {
		int count = 0;
		for (int i = 0; i < cars.length; i++) {
			if (cars[i]!=null&&cars[i].getInTime() >= inTime) {
				count++;
			}
		}
		
		int index = 0;
		Car[] carArr = new Car[count];
		
		
		for (int j = 0; j < cars.length ; j++) {
			if (cars[j]!=null&&cars[j].getInTime() >= inTime) {
				carArr[index] = cars[j];
				index++;
			}

		}
		return carArr;
	}
	
}