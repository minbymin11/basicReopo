
public class ClassABMain {

	
	public static void main(String[] args){
		ClassA ca=new ClassA();
		
		ClassB cb=new ClassB();
		cb.classa=ca;
		cb.b_a_access();
	}
}
