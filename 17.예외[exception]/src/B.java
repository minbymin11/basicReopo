
public class B {
	
	public void b() throws Exception{
		C c=new C();
		System.out.println("B-->C.c() 메소드호출");
		System.out.println("C.c()메소드 호출");
		c.c();
		System.out.println("B.b()메소드 반환");
		return;
	}
}
