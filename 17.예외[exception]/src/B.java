
public class B {
	
	public void b() throws Exception{
		C c=new C();
		System.out.println("B-->C.c() �޼ҵ�ȣ��");
		System.out.println("C.c()�޼ҵ� ȣ��");
		c.c();
		System.out.println("B.b()�޼ҵ� ��ȯ");
		return;
	}
}
