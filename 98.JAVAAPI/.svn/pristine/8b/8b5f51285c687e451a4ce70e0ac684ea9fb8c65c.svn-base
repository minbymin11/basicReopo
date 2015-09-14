package com.itwill.util.collection;

import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Iterator;

public class CarManager {

//	private Car[] cars;
//	private int emptyCount;//빈주차장 구획수
	
	public HashMap<String, Car> carMap = new HashMap<String, Car>();
	
	//생성자
	public CarManager() {
		Car car1 = new Car("1111", 12);
		Car car2 = new Car("2222", 13);
		Car car3 = new Car("3333", 14);
		Car car4 = new Car("4444", 15);
		Car car5 = new Car("5555", 16);
		
		carMap.put(car1.getNo(), car1);
		carMap.put(car2.getNo(), car2);
		carMap.put(car3.getNo(), car3);
		carMap.put(car4.getNo(), car4);
		carMap.put(car5.getNo(), car5);
		
		}
	/*
	public CarManager(int count){
		cars=new Car[count];
		emptyCount=cars.length;
	}
	*/
	
	/*
	 * 입차
	 */
	/*
	public  void ipCha(Car inCar) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null) {
//				emptyCount--;
				cars[i] = inCar;
				break;
			}
		}
	}
	*/
	/*
	 * 전체차량출력
	 */
	public Car[] print(){
		int index = 0;
		Car[] rCar = new Car[carMap.size()];
		Iterator<String> carIter = carMap.keySet().iterator();
		while(carIter.hasNext()){
			String ctemp=carIter.next();
			rCar[index] = carMap.get(ctemp);
			index++;
		}
		return rCar;
	}

	public Car[] findByNo(String carNo) {
		int index = 0;
		Car[] rCar = new Car[carMap.size()];
		Iterator<String> carIter = carMap.keySet().iterator();
		while (carIter.hasNext()) {
			String cTemp=carIter.next();
			if (carMap.containsKey(carNo)) {
				rCar[index]=carMap.get(cTemp);
				index++;
				break;
			}
		}
		return rCar;
		
	}

	public Car[] findByTime(int inTime) {
		int index= 0;
		Car[] rCar = new Car[carMap.size()];
		Iterator<String> carIter = carMap.keySet().iterator();
		while(carIter.hasNext()){
			String cTemp=carIter.next();
			if(carMap.containsValue(inTime)){
				rCar[index]=carMap.get(cTemp);
				index++;
				break;
			}
		}
		return rCar;
	}
	
	
	
	/*
	 * 주차가능여부리턴
	 */
	/*
	public boolean isAvailable(){
		boolean isPark=true;
		if(getCarCount()>=cars.length){
			isPark=false;
		}
		return isPark;
	}
	*/
	/*
	 * 번호 입력 받아서 차량 1개 찾기
	 */
	/*
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
	/*
	public Car carOut(String carNo, int outTime, boolean yesNo) {
		
		Car carArr=new Car();
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] != null && cars[i].getNo() == carNo) {
				cars[i].setOutTime(outTime);
				cars[i].calCulateFee();
				carArr = cars[i];
				cars[i]=null;
//				emptyCount++;
			
				
				
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
	/*
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
	*/
	
}