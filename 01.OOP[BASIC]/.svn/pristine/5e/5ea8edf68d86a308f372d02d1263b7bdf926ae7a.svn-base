package variabledeclare;
import javax.swing.JOptionPane;

/*
		switch 문
		 - 형식
		    switch(변수){
		    	case 값_1:
		    	  stmt1;
		    	  break;
		    	case 값_2:
		    	  stmt2;
		    	  break;  
		        case 값_n:
		          stmt3;
		    	  break;
		        default:
		          stmt4;
		          return;
		    }
		switch(변수)  변수값은 byte,short,int char 
		              값이올수있다.(long 은안됨)
*/

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * level은 1~5사이의 정수 
		 * 
		 * */
		
		String levelStr=JOptionPane.showInputDialog("레벨을 입력하세요");
		int str = Integer.parseInt(levelStr);
		
	//	int level = 3;
		String msg = "";
		
		switch (str) {
		case 1:
			msg = "하";
			break;
		case 2:
			msg = "중하";
			break;
		case 3:
			msg = "중";
			break;
		case 4:
			msg = "중상";
			break;
		case 5:
			msg = "상";
			break;

		default:
			msg = "레벨은 1-5사이 정수입니다.";
			break;
		}
		
		System.out.println(msg);

	}

}
