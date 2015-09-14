package com.itwill.car.collection;

public class CarManagerCollectionMain  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarManager carManager=new CarManager(30);
		/*
		 * 입차
		 */
		
		
    	Car car1 = new Car("1234", 12 );
				
    	carManager.ipCha(car1);
		carManager.ipCha(new Car("2344", 12));
		carManager.ipCha(new Car("3212", 13));
		carManager.ipCha(new Car("4234", 14));
		carManager.ipCha(new Car("5234", 15));
		carManager.ipCha(new Car("3775", 16));
		carManager.ipCha(new Car("9678", 17));
		carManager.ipCha(new Car("3456", 18));
		
		Car.headerPrint();
		carManager.print();
		
		System.out.println(">>주차가능함?"+carManager.isAvailable());
		/*
		 * 번호 입력 받아서 차량 1개 찾기
		 */
		
		Car car2=carManager.findByCarNo("2344");
		car2.print();
				
		/*
		 * 입차시간으로 차량찾기
		 */
		Car[] car3= carManager.findByInTime(15);
			for (int i = 0; i < car3.length; i++) {
					car3[i].print();
			}

		/*
		 * -출차
		 * 번호,시간 영수증출력입력 받아서 출차 
		 */
			Car car4=carManager.carOut("2344", 15, false);
			car4.print();

	
	}

}


