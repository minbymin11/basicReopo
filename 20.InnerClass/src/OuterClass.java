
public class OuterClass {
	public OuterClass() {
	}
	public int outer_member_var=888;
	public void outer_method(){
		System.out.println("OuterClass.outer_method()");
	}
	/*
	 * 2. OuterClass���� InnerClass �ǻ��
	 *     - InnerClass ��ü����
	 *     - InnerClass ��ü���
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
		/* << nested class �� ������ >>
		 *  1. inner class���� OuterClass �� member����(�޽��) ����(���,����)
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
