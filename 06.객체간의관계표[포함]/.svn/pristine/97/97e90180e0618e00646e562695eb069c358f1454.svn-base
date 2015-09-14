
public class Car {
	//엔진에 관련함 멤버변수
	//private String engine_type; //엔진타입
	//private int cc;  //배기량
	//캡슐화(private)
	private int no;  //차량번호
	private String model; // 모델명
	private int wheelNumber; // 바퀴수
	private Engine engine;   //참조변수(engine객체의 주소값)
	
	
	//기본생성자
	public Car() {
	
	}
	public Car(int no, String model, Engine engine, int wheelNumber){
		this.no=no;
		this.model=model;
		this.engine=engine;
		this.wheelNumber=wheelNumber;
	}
	
	
	
	public void print(){
		System.out.print(no+"\t"+model+"\t"+wheelNumber+"\t");
		
		this.engine.print();
		System.out.println();
	
	}
	
	
	
	
	
	//setter, getter
	public Engine getEngine(){
		return this.engine;
	}
	
	public int getNo() {
		return no;
	}


	public String getModel() {
		return model;
	}


	public int getWheelNumber() {
		return wheelNumber;
	}
	
	public void setEngine(Engine engine){           //엔진도 하나의 객체이자 타입
		this.engine=engine;
		
	}

	public void setNo(int no) {
		this.no = no;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public void setWheelNumber(int wheelNumber) {
		this.wheelNumber = wheelNumber;
	}
	
	
}

