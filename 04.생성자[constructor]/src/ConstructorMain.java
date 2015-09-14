import java.util.concurrent.ConcurrentHashMap;

public class ConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor c1 = new Constructor();
		c1.print();
		Constructor c2 = new Constructor(100);
		c2.print();
		Constructor c3 = new Constructor(100,200);
		c3.print();
		
		System.out.println("--------------------------------------------");
		DefaultConstructor dc1=new DefaultConstructor(89,79);
		dc1.print();
		System.out.println(dc1);
		
		DefaultConstructor dc2=new DefaultConstructor(99999,8888);
		dc2.print();
		System.out.println(dc2);
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
