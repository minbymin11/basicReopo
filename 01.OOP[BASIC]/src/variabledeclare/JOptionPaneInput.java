package variabledeclare;
import javax.swing.JOptionPane;

public class JOptionPaneInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		
		String korStr = JOptionPane.showInputDialog("���������� �Է��ϼ���");
		System.out.println("String:"+korStr);
		int kor=Integer.parseInt(korStr); 
		
		System.out.println("int : "+kor);
		
		System.out.println("main end");
	}

}
