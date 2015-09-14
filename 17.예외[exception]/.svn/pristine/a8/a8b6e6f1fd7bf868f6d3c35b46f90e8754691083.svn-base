import javax.swing.JOptionPane;

public class ExceptionCatchMechanismMain {

		public static void main (String[] args) throws Exception {
			System.out.println("main 호출");
			A a=new A();
			System.out.println("main --->A.a()호출");
			
			try{
				System.out.println(">> try Start");
				a.a();
				System.out.println(">> try End");
				
			}catch(Exception e){
				System.out.println("## catch Start");
				System.out.println("## catch Error message"+e.getMessage());
				System.out.println("## catch end");
				e.printStackTrace();//스택에 저장된 에러 전부 출력(??)
				JOptionPane.showMessageDialog(null, e.getMessage());//에러발생 다이얼로그
			}
			System.out.println("min JVM반환");
			return;
		}
}
