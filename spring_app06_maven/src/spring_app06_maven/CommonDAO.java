package spring_app06_maven;

import java.sql.Connection;

public interface CommonDAO {
	public Connection connect();
	public void selectAll();
}
