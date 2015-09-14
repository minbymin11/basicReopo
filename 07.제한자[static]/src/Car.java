
public class Car {

	private static int count;//����������
	private int no;
	private String model;
	
	//������
	public Car() {
	}
	public Car(int no, String model) {
		this.no=no;
		this.model=model;
		count++;  //=Car.count++, static�̹Ƿ� �ڱ����� ������ �����Ƿ� this�� ���� �ʴ´�.
							//��ü�� �ѹ� ȣ�� �ɶ����� count++
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
	// Static�̶� art+shift+s--->oŰ ������ ���� �Ȱ��� ����
	// Static get set�� static�� ��������Ѵ�.
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
	//�ѹ��� ���Ǵ� �޼ҵ�� static���� �����Ѵ�. 
	public static void headerPrint(){
		System.out.println("����ȣ\t"+"����");
	}
	
	public void print(){
		System.out.println(this.no+"\t "+"\t"+this.model);
	}
}
