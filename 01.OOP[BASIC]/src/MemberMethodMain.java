
public class MemberMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. main start ");
		
	
		
		MemberMethod mm = new MemberMethod(); //������Ʈ�� ���� = ���Ӱ� ������! ������Ʈ���� ������ȣ��
																//heap������ ���ο� ��ü�� �ϳ� ����ڴ�!!!!!!!!!!!!!!!!!!!!!!!!!!!!	
		mm.memberVar1=888;
		
		mm.print();
		
		System.out.println("��> mm.memberVar1 :"+mm.memberVar1);
		
		System.out.println("2. mm�� method1�޼ҵ带 ȣ��");
		/*
		 * public void method1();
		 */
		mm.method1();
		System.out.println("3. mm�� method1�޼ҵ带 ȣ���� ��ȯ�� �����尡 ����");
		
		/*
		 * public void method2(String name) //�޼ҵ��� ����
		 *
		 */
		
		mm.method2("���ȣ");
		mm.method2("�嵿��");
		/**
		 * 
		 * public void method3(String name, int age)
		 * */
		
		mm.method3("������", 30);
		mm.method3("���Ž�", 45);
		
		//public String method4();
		
		String returnMsg=mm.method4();
		System.out.println("4."+returnMsg);
		
		//public int method5(int a, int b)
		
		int result = mm.method5(123, 456);
		System.out.println("5."+result);
		
		System.out.println("4. main end");
		System.out.println("5. main return");
		return;
	}

}
