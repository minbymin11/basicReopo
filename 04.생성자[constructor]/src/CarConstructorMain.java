
public class CarConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����
		Car car1 = new Car("1234", 12);   //���������ϸ鼭 �Է�
		
		//car1.setNo("1234");
		//car1.setInTime(12);
		//2�ð��� ������  ����
		//car1.setOutTime(15);
		//���(���������)
		Car.headerPrint();
		car1.calCulateFee();
		//car1.getFee();
		car1.print();
		
		
		/*
		//����
		Car car2 = new Car();
		car2.setIpChaData("4321", 31);
				
		//2�ð��� ������  ����
		car2.outTime=14;
		car2.fee=(car2.outTime-car2.inTime)*1000;
		
		//���(���������)
		
		car2.print();
		*/
		
		
		
		

	}

}


