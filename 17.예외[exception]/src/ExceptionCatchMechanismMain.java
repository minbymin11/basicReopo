import javax.swing.JOptionPane;

public class ExceptionCatchMechanismMain {

		public static void main (String[] args) throws Exception {
			System.out.println("main ȣ��");
			A a=new A();
			System.out.println("main --->A.a()ȣ��");
			
			try{
				System.out.println(">> try Start");
				a.a();
				System.out.println(">> try End");
				
			}catch(Exception e){
				System.out.println("## catch Start");
				System.out.println("## catch Error message"+e.getMessage());
				System.out.println("## catch end");
				e.printStackTrace();//���ÿ� ����� ���� ���� ���(??)
				JOptionPane.showMessageDialog(null, e.getMessage());//�����߻� ���̾�α�
			}
			System.out.println("min JVM��ȯ");
			return;
		}
}
