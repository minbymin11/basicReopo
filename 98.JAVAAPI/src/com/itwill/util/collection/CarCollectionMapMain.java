package com.itwill.util.collection;

public class CarCollectionMapMain {

	public static void main(String[] args) {

		CarManager cm = new CarManager();
		Car car = new Car();
		
		//ÀÔÂ÷
		// cm.ipCha("5678", 19);
		Car[] car1=cm.print();
		for (int i = 0; i < car1.length; i++) {
			car1[i].print();
		}
		
		Car[] car2=cm.findByNo("1111");
		car2[0].print();
		
		Car[] ca3=cm.findByTime(13);
		ca3[0].print();	
	
	}

}
