package spring_app12_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnTest {
	public static void main(String[] args) {
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@localhost:1521:XE";
//		String user = "scott";
//		String password = "tiger";
//		
//		try {
//			Class.forName(driver);
//			Connection conn = DriverManager.getConnection(url, user, password);
//			
//			System.out.println("conn : " + conn);
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		new OracleDAO();
	}
}
