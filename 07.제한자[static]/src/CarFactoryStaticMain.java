
public class CarFactoryStaticMain {

	public static void main(String[] args) {

		System.out.println("1-1.�������ʱ�ȭ��"+Car.getCount());
		Car.setCount(38);
		System.out.println("1-2.�������ʱ�ȭ��"+Car.getCount());
	
		Car car1 = new Car(1, "K3");
		Car car2 = new Car(2, "K4");
		Car car3 = new Car(3, "K5");
		Car car4 = new Car(4, "K6");
		System.out.println("2.����������:"+Car.getCount());
		System.out.println(Car.getCount());
		
		Car.headerPrint();
		car1.print();
		car2.print();
		car3.print();
		car4.print();
	}

}
