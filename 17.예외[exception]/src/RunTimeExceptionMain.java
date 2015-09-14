
public class RunTimeExceptionMain {

	public static void main(String[] args) {
		//NullPointerException
		String str=null;
		System.out.println(str.length());
		//ArrayIndexOutOfBoundsException
		int[] ia={1,2,3};
		System.out.println(ia[3]);
		//ArithmeticException
		int r=3/0;
		
	}

}
