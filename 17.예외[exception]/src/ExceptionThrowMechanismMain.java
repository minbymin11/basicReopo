
public class ExceptionThrowMechanismMain {

		public static void main (String[] args) throws Exception {
			System.out.println("main 호출");
			A a=new A();
			System.out.println("main --->A.a()호출");
			a.a();
			System.out.println("min JVM반환");
			return;
		}
}
