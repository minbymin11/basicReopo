
public class CarConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입차
		Car car1 = new Car("1234", 12);   //변수선언하면서 입력
		
		//car1.setNo("1234");
		//car1.setInTime(12);
		//2시간이 지난후  출차
		//car1.setOutTime(15);
		//출력(영수증출력)
		Car.headerPrint();
		car1.calCulateFee();
		//car1.getFee();
		car1.print();
		
		
		/*
		//입차
		Car car2 = new Car();
		car2.setIpChaData("4321", 31);
				
		//2시간이 지난후  출차
		car2.outTime=14;
		car2.fee=(car2.outTime-car2.inTime)*1000;
		
		//출력(영수증출력)
		
		car2.print();
		*/
		
		
		
		

	}

}


