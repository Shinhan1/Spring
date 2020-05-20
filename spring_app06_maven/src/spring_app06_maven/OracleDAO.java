package spring_app06_maven;

import java.sql.Connection;

public class OracleDAO implements CommonDAO {
	
	public OracleDAO() {}
	
	@Override
	public Connection connect() {
		// TODO Auto-generated method stub
		return OracleXEConnection.getInstance().getConnection();
	}
	
	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		System.out.println("전부 다 출력됨...");
	}
	
	
	
}
