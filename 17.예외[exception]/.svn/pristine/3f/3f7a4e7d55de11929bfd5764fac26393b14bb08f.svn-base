import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionFinallyMain {

	public static void main(String[] args) {
		
		System.out.println("----------------------------case1-------------------------------");
		Connection con=null;
		FileInputStream fis = null;
		try{
			System.out.println("stmt1");
			con = DriverManager.getConnection("url");
			con.createStatement();
			fis=new FileInputStream("a.txt");
			int readByte=fis.read();
			System.out.println("readByte:"+readByte);
			System.out.println("stmt2");
			boolean b=true;
			if(b){
				return;
			}
			System.out.println("stmt3");
		}catch(Exception e){
			System.out.println("Exception : "+e.getMessage());
			
		}finally{
			/*
			 * - 반드시 실해해야하는 코드
			 * - 반드시 실행해야 할 코드를 기술
			 * - 리소스해지(파일닫기,DB연결해지, 스트림닫기)
			 */
			System.out.println("finally start------------");
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null){
			try{
				
			}catch(IOException e){

			}
		}
	}
	}
}
