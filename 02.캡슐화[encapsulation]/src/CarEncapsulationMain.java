
public class CarEncapsulationMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setIpChaData("1234", 13);
		
		// 2�ð���������
		
		car1.setOutTime(14);
		
		car1.calCulateFee();;

		// ���(���������)
		car1.headerPrint();
		car1.print();
		/************************************/		
		Car car2=new Car();
		car2.setIpChaData("3434", 14);
		
		//3�ð��Ŀ�
		
		car2.setOutTime(17);
		
		car2.calCulateFee();;
		//car2.headerPrint();
		car2.print();
		
		int car2Fee=car2.getFee();
		System.out.println("car2 ���:"+car2Fee);
	}

}
