
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����
		Car car1 = new Car();
		
		car1.no="1234";  //car1 �ּҿ� �������no�� 1234�Է�
		car1.inTime=12; 
		//2�ð��� ������ 
		car1.outTime=14;
		car1.fee=(car1.outTime-car1.inTime)*1000;
		
		
		Car car2 = new Car();
		
		car2.no="5678";
		car2.inTime=13;
		//2��°�� OUT
		car2.outTime=14;
		car2.fee=(car2.outTime-car2.inTime)*1000;				

		
		//��� ���
		car1.headerPrint();
		
		//car1. ���(���������)
			
		car1.print();

				
		//car2. ���(���������)
		car2.print();

	}

}
