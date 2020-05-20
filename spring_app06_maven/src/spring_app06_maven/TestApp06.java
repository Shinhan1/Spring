package spring_app06_maven;

import java.sql.Connection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestApp06 {
	public static void main(String[] args) {
//		OracleDAO dao = new OracleDAO();
//		
//		MysqlDAO dao2 = new MysqlDAO();
		
//		CommonDAO dao1 = new OracleDAO();
//		dao1.connect();
//		
//		CommonDAO dao2 = new MysqlDAO();
//		dao2.connect();
		
		BeanFactory factory = 
				new XmlBeanFactory(new FileSystemResource("src/connection.xml"));
		
		CommonDAO comOracle = factory.getBean("oracle", CommonDAO.class);
		Connection conn1 = comOracle.connect();
		System.out.println("conn1 : " + conn1);
		comOracle.selectAll();
		System.out.println("--------------------------------------------------");
		
		CommonDAO comMysql = factory.getBean("mysql", CommonDAO.class);
		Connection conn2 = comMysql.connect();
		System.out.println("conn2 : " + conn2);
		comMysql.selectAll();
		
	}
}