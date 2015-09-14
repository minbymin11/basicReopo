import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.omg.Messaging.SyncScopeHelper;

public class ExceptionMultiCatchMain {

	/*
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

		System.out.println("1.main");
		
		//ºñRuntimeException
		
		FileInputStream fis = new FileInputStream("a.txt");
		int readByte=fis.read();
		Class.forName("A");
		DriverManager.getConnection("");
		
		
	}
*/
	public static void main(String[] args) {

		System.out.println("1.main");

		// ºñRuntimeException
		try {
			System.out.println("2.main");
			FileInputStream fis = new FileInputStream("a.txt");
			System.out.println("3.main");
			int readByte = fis.read();
			System.out.println("4.main");
			Class.forName("D");
			System.out.println("5.main");
			System.out.println("6.main");
			String str = null;
			System.out.println(str.length());
			System.out.println("7.main");
			DriverManager.getConnection("");
			System.out.println("8.main");
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException : " + e.getMessage());

		} catch (ClassNotFoundException e) {
			System.out.println("Class start");
			System.out.println("ClassNotFoundException : " + e.getMessage());
			System.out.println("catch:A class loading");
			try {
				Class.forName("A");

			} catch (ClassNotFoundException e1) {

				System.out.println("catch ---> catch : " + e1.getMessage());
			}

			System.out.println("catch:A class loading success");
			System.out.println("catch end");
		} catch (SQLException e) {
			System.out.println("SQLException : " + e.getMessage());

		}catch(Exception e){
			System.out.println("Exception: "+e.getMessage());
		}
		System.out.println("99.main");
		
	}
	   
}
