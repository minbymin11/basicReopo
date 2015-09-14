
public class OuterClass {
	public OuterClass() {
	}
	public int outer_member_var=888;
	public void outer_method(){
		System.out.println("OuterClass.outer_method()");
	}
	/*
	 * 2. OuterClass에서 InnerClass 의사용
	 *     - InnerClass 객체생성
	 *     - InnerClass 객체사용
	 */
	public void outer_inner_use(){
		InnerClass innerClass=new InnerClass();
		innerClass.inner_member_var=3343432;
		innerClass.inner_method();
	}
	/*** member inner class ***/
	public class InnerClass{
		public int inner_member_var=999;
		public void inner_method(){
			System.out.println("InnerClass.inner_method()");
		}
		/* << nested class 의 사용목적 >>
		 *  1. inner class에서 OuterClass 의 member변수(메쏘드) 접근(사용,실행)
		 */
		public void inner_outer_access(){
			//OuterClass.this.outer_member_var = 333;
			//OuterClass.this.outer_method();
			outer_member_var = 333;
			outer_method();
			/*
			InnerClass.this.inner_member_var=8989;
			InnerClass.this.inner_method();
			*/
		}
		
	}
	
}
