/*
 * 2. 하나의 클래스에는 반드시 하나이상의 생성자메소드가 존재하여야한다
--> 생성자를 정의하지않을경우 컴파일러는 인자가하나도없는
    생성자(디폴드 생성자)를 자동으로 넣어서 컴파일한다.   
 */
public class DefaultConstructor {

	private int member1 = 888;
	private int member2 = 999;

	
	public DefaultConstructor() {
		// TODO Auto-generated constructor stub
	}

	
	public DefaultConstructor(int member1, int member2) {
		this.member1 = member1;
		this.member2 = member2;
	}

	public void print() {

		System.out.println("member1:" + member1);
		System.out.println("member2:" + member2);
	}

}
