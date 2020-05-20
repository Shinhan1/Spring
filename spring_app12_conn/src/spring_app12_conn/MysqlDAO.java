package spring_app12_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlDAO implements DAO {
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/goott7?useSSL=false";
	String user = "scott";
	String password = "tiger";
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();
	
	public void init() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("conn : " + conn);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}	// init() end
		
	public void close() {
		try {
			conn.close();
			System.out.println("종료 메소드 호출");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	// close() end
	
	@Override
	public int selectCount() {
		sb.setLength(0);
		sb.append("select count(*) cnt ");
		sb.append("from dept");
		
		int result = 0;
		
		try {
			ps = conn.prepareStatement(sb.toString());
			
			rs = ps.executeQuery();
			
			rs.next();
			
			result = rs.getInt("cnt");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}	// selectCount() end
	
	
	
	
	
}
