
public class ClassB {
	ClassA classa;//classA 클래스에 접근가능하게 만듬
	public void b_a_access(){
		/*
		 * 
		 */
		classa.amember=9999;	//classA의 멤버변수에 접근
		System.out.println(classa.amember);
		
	}
}
