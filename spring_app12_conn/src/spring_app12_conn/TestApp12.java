package spring_app12_conn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestApp12 {
	public static void main(String[] args) {
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("app12.xml");
		
//		OracleDAO dao = context.getBean("oracle", OracleDAO.class);
//		System.out.println("dept 테이블의 총 row 수 : " + dao.selectCount());
		
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("app12.xml");
		
		MysqlDAO dao = context.getBean("dao", MysqlDAO.class);
		System.out.println("dept 테이블의 총 row 수 : " + dao.selectCount());
		
//		AbstractApplicationContext
		
	}

}
