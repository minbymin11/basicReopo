
public class ExceptionThrowMechanismMain {

		public static void main (String[] args) throws Exception {
			System.out.println("main ȣ��");
			A a=new A();
			System.out.println("main --->A.a()ȣ��");
			a.a();
			System.out.println("min JVM��ȯ");
			return;
		}
}
