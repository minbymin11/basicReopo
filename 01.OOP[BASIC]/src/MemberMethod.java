
public class MemberMethod {
	public int memberVar1; //�������
	
	public void print(){
		System.out.println("print invoke");
		/**
		 * this : �ڱ���������
		 */
		System.out.println("print :"+ this.memberVar1);
	}

	public void method1() {
		String name = "���ȣ";
		System.out.println("A. method1 ����" + name);
		System.out.println("B. method1 ������ ȣ���ѳ� ��ȯ");
		return;
	}

	public void method2(String name) {

		String msg = "�� �ȳ��ϼ���";
		System.out.println(name + msg);
		return;
	}

	public void method3(String name, int age) {
		
		String msg;
		
		if(age>25 && age<=35){
			msg = "�Ѱ�"+name+ "�� �ȳ��ϼ���.";
			System.out.println(msg);
			
		}else{
			msg = name+"�� �ȳ��ϼ���";
			System.out.println(msg);
		}
		//System.out.println(name + msg);
		
		return;
	}
	
	public String method4(){
		
		String msg="method4���� ��ȯ�� ������";
		
		return msg;
	}
	
	public int method5(int a, int b){
		
		int sum = a + b;
	
		return sum;
		
	}

}