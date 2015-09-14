
public class Car {

	private static int count;//차량생산대수
	private int no;
	private String model;
	
	//생성자
	public Car() {
	}
	public Car(int no, String model) {
		this.no=no;
		this.model=model;
		count++;  //=Car.count++, static이므로 자기참조 변수가 없으므로 this를 쓰지 않는다.
							//객체가 한번 호출 될때마다 count++
	}

	//static get set
	/*
	public static void setCount(int count){
		Car.count=count;
	}
	public static int getCount(){
		return Car.count;
	}
	*/
	// Static이라도 art+shift+s--->o키 눌러서 만들어도 똑같이 나옴
	// Static get set은 static은 붙쳐줘야한다.
	public static void setCount(int count) {
		Car.count = count;
	}

	public static int getCount() {
		return count;
	}
	
	//getter, setter
	public int getNo() {
		return no;
	}
		public String getModel() {
		return model;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setModel(String model) {
		this.model = model;
	}
	//한번만 사용되는 메소드는 static으로 선언한다. 
	public static void headerPrint(){
		System.out.println("차번호\t"+"차종");
	}
	
	public void print(){
		System.out.println(this.no+"\t "+"\t"+this.model);
	}
}
