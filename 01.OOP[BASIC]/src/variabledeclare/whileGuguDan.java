package variabledeclare;
import javax.swing.JOptionPane;

public class whileGuguDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		String ggdStr = JOptionPane.showInputDialog("단수입력");

		int i = Integer.parseInt(ggdStr);

		while (i > 0) {
			int j = 1;
			while (j < 10) {
				System.out.print(i + "*" + j + "=" + i * j + "\t" + "\n");
				j++;
			}
			// System.out.print("\n");
			break;
		}
	//	int _Num = JOptionPane.showConfirmDialog(null, "더하겠음?");
		

	}

}
