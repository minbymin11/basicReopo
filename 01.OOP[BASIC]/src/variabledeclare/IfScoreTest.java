package variabledeclare;
import javax.swing.JOptionPane;

public class IfScoreTest 
 {
	public static void main(String[] args) {

		//String korScoreStr = JOptionPane.showInputDialog("���������Է�");
		//String engScoreStr = JOptionPane.showInputDialog("���������Է�");
		//String mathScoreStr = JOptionPane.showInputDialog("���������Է�");

		int kor, eng, math;
		
		//kor=Integer.parseInt(korScoreStr);
		//eng=Integer.parseInt(engScoreStr);
		//math=Integer.parseInt(mathScoreStr);
		
		kor = 100;
		eng = 100;
		math = 100;

		/*
		������....
		����,����,���� ������ ������ 
		����,���,����(A,B,C....)�� ����Ͻÿ�....
           - 100���� �Ѵ� ���� ������ �ԷµǸ� �޼����� ����ϼ���(if)
           - ����� �Ҽ������� 2�ڸ��������� ����ϼ���
           - �������
			 
			 ************************
			 ����: 78
			 ����: 56
			 ����: 77
			 ����:256
			 ���:78.56
			 ����: C (switch)
			 ************************
		*/

		int sum = kor + eng + math;
		double avg = sum / 3;
		// char hakjum = ' ';
		int str = ' ';

		str = (int) avg / 10;

		if (0 > kor || 100 < kor || 0 > eng || 100 < eng || 0 > math || 100 < math ) {
			System.out.println("��ȿ��������");
			return;
		}

		System.out.println("����:" + kor);
		System.out.println("����:" + eng);
		System.out.println("����:" + math);
		System.out.println("����:" + sum);
		System.out.println("���:" + avg);

		switch (str) {
		case 10:
		case 9:
			System.out.println("����:A");
			break;
		case 8:
			System.out.println("����:B");
			break;
		case 7:
			System.out.println("����:C");
			break;
		case 6:
			System.out.println("����:D");
			break;
		default:
			System.err.println("����:F");
			break;

		}

		/*
		 * if (avg >= 90) { hakjum = 'A'; } else if (avg >= 80) { hakjum = 'B';
		 * } else if (avg >= 70) { hakjum = 'C'; } else if (avg >= 60) { hakjum
		 * = 'D'; } else { hakjum = 'F'; }
		 */

	}
}
