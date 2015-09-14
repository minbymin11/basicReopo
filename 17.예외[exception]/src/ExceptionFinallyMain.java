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
			 * - �ݵ�� �����ؾ��ϴ� �ڵ�
			 * - �ݵ�� �����ؾ� �� �ڵ带 ���
			 * - ���ҽ�����(���ϴݱ�,DB��������, ��Ʈ���ݱ�)
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
