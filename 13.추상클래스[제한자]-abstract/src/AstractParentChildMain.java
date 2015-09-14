
public class AstractParentChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractParent ap = new AbstractParent();
		
		AbstractChild ac = new AbstractChild();
		ac.method1();
		ac.method2();
		
		AbstractParent ap1  = new AbstractChild();
		ap1.method1();
		ap1.method2();
		
		AbstractParent ap2 = ac;
		ap2.method1();
		ap2.method2();

	}

}
