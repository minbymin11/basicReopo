
public class CarFactoryMain {

	public static void main(String[] args) {

		Car k7=new Car();   //Car °´Ã¼ Âï¾î³¿
		k7.setModel("k7");  
		k7.setNo(1234);
		k7.setWheelNumber(4);
		
		
		//Engine °´Ã¼ Âï¾î³¿
		Engine k7Engine = new Engine("A", 2980);
		//k7.engine = k7Engine;
		k7.setEngine(k7Engine);  //Ä¸½¶È­
		k7.print();
		
		
		Engine temEngine=k7.getEngine();
		temEngine.print();
		
		/*
		 * Engine k5Engine=new Engine("C", 1980);
		 */
	
		Car k5 = new Car(3214, "k5", new Engine("C", 1980), 4);
		k5.print();
	}
}
