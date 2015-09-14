
public class OuterClassMain {

	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		oc.outer_member_var=437539845;
		oc.outer_method();
		
		OuterClass.InnerClass innerObject = oc.new InnerClass();
		
	}

}
