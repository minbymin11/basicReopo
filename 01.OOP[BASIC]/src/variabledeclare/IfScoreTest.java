package variabledeclare;
import javax.swing.JOptionPane;

public class IfScoreTest 
 {
	public static void main(String[] args) {

		//String korScoreStr = JOptionPane.showInputDialog("국어점수입력");
		//String engScoreStr = JOptionPane.showInputDialog("영어점수입력");
		//String mathScoreStr = JOptionPane.showInputDialog("수학점수입력");

		int kor, eng, math;
		
		//kor=Integer.parseInt(korScoreStr);
		//eng=Integer.parseInt(engScoreStr);
		//math=Integer.parseInt(mathScoreStr);
		
		kor = 100;
		eng = 100;
		math = 100;

		/*
		옛날일....
		국어,영어,수학 점수를 가지고 
		총점,평균,평점(A,B,C....)을 출력하시요....
           - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하세요(if)
           - 평균은 소수점이하 2자리수까지만 출력하세요
           - 출력포맷
			 
			 ************************
			 국어: 78
			 영어: 56
			 수학: 77
			 총점:256
			 평균:78.56
			 평점: C (switch)
			 ************************
		*/

		int sum = kor + eng + math;
		double avg = sum / 3;
		// char hakjum = ' ';
		int str = ' ';

		str = (int) avg / 10;

		if (0 > kor || 100 < kor || 0 > eng || 100 < eng || 0 > math || 100 < math ) {
			System.out.println("유효하지않음");
			return;
		}

		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("수학:" + math);
		System.out.println("총점:" + sum);
		System.out.println("평균:" + avg);

		switch (str) {
		case 10:
		case 9:
			System.out.println("평점:A");
			break;
		case 8:
			System.out.println("평점:B");
			break;
		case 7:
			System.out.println("평점:C");
			break;
		case 6:
			System.out.println("평점:D");
			break;
		default:
			System.err.println("평점:F");
			break;

		}

		/*
		 * if (avg >= 90) { hakjum = 'A'; } else if (avg >= 80) { hakjum = 'B';
		 * } else if (avg >= 70) { hakjum = 'C'; } else if (avg >= 60) { hakjum
		 * = 'D'; } else { hakjum = 'F'; }
		 */

	}
}
