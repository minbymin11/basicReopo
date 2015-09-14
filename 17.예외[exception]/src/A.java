
public class A {

	public void a() throws Exception {
		B b = new B();
		System.out.println("A.a()메소드 호출");
		System.out.println("B.b()--C.c()메소드 호출");
		b.b();
		System.out.println("A.a()반환");
		
		return;
	}

}
