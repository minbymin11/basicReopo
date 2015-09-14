
public class InterfaceImplABMain {

	public static void main(String[] args){
		System.out.println("--------------InterfaceABImpl---------------");
		InterfaceABImpl abimpl1=new InterfaceABImpl();
		abimpl1.method1();
		abimpl1.method2();
		abimpl1.method3();
		abimpl1.method4();
		
		InterfaceA ia1=abimpl1;
		InterfaceB ib1=abimpl1;
		
		System.out.println("--------------InterfaceA---------------");
		ia1.method1();
		ia1.method1();
		
		System.out.println("--------------InterfaceB---------------");
		ib1.method3();
		ib1.method4();
		
		
		
		System.out.println("------------final field-----------------");
		System.out.println(InterfaceA.MEMBER1);
		System.out.println(InterfaceA.MEMBER2);
		System.out.println(InterfaceB.MEMBER3);
		System.out.println(InterfaceB.MEMBER4);
		System.out.println(InterfaceABImpl.MEMBER1);
		System.out.println(InterfaceABImpl.MEMBER2);
		System.out.println(InterfaceABImpl.MEMBER3);
		System.out.println(InterfaceABImpl.MEMBER4);
	
		System.out.println("------------------InterfaceA,InterfaceB--------------------");
	
		InterfaceA ia2=new InterfaceABImpl();
		ia2.method1();
		ia2.method2();
		InterfaceB ib2=(InterfaceB)ia2;
		ib2.method3();
		ib2.method4();
		
		System.out.println("-------------------Interface[Array]-------------------------");
		InterfaceA[] iaArray={
				new InterfaceABImpl(),
				new InterfaceABImpl(),
				new InterfaceABImpl(),
				new InterfaceABImpl(),
				new InterfaceABImpl(),
				new InterfaceABImpl(),
				new InterfaceABImpl(),
				new InterfaceABImpl(),
				new InterfaceABImpl()
				
		};
		for (int i = 0; i < iaArray.length; i++) {
			System.out.println("°´Ã¼ÁÖ¼Ò : "+iaArray[i]);
			iaArray[i].method1();
			iaArray[i].method2();
			InterfaceB tempIb = (InterfaceB)iaArray[i];
			tempIb.method3();
			tempIb.method4();
		}
	}
}
