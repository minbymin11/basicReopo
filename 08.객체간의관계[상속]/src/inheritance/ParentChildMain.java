package inheritance;

public class ParentChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p1 = new Parent(); //Parent class�� p1��ü ����
		p1.member1=100;
		p1.member2=200;
		p1.method1();
		p1.method2();
		
		System.out.println("-----------childA---------");
		/*
		 *ChildA ��ü�� ������� 3,4�ۿ� ���µ� �θ�κ��� ������� 1,2�� ��� �޾Ƽ� ��밡���ϴ�
		 *ChildA ��ü�� ����޼ҵ� 3,4�ۿ� ���µ� ����� ���� ����޼ҵ� 3,4�� ��ӹ޾Ƽ� ��밡��
		 *�θ�� ���� �󺹹��� ChildA�� �θ��� �������, ����޼ҵ� ��� ��밡���ϴ�
		 */
		ChildA ca1 = new ChildA();
		ca1.member1 = 111;
		ca1.member2 = 222;
		ca1.member3 = 333;
		ca1.member4 = 444;
		ca1.method1();
		ca1.method2();
		ca1.method3();
		ca1.method4();
		ca1.childPrint();
		String ca1Str=ca1.toString();
		System.out.println(ca1Str);
		
		
		System.out.println("-----------childB---------");
		ChildB cb1 = new ChildB();
		cb1.member1 = 1234;
		cb1.member2 = 5555;
		cb1.isMarried= true;
		cb1.name="KANG";
		cb1.method1();
		cb1.method2();
		cb1.childPrint();
	}

}
