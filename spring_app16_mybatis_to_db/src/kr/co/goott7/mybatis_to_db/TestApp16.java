package kr.co.goott7.mybatis_to_db;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestApp16 {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("app16.xml");
		DAO d = context.getBean("dao", DAO.class);
		
		List<EmpDTO> list = d.selectAll();
	
		for (EmpDTO dto : list) {
			System.out.println(dto.getEmpno() + "\t" + dto.getEname() +
					"\t" + dto.getSal() + "\t" + dto.getDeptno());
		}
		
		System.out.println("-------------------------------------------------");
		EmpDTO dto1 = d.selectOne(7499);
		System.out.println(dto1.getEmpno() + "\t" + dto1.getEname() +
				"\t" + dto1.getSal() + "\t" + dto1.getDeptno());
		
		
	}
}
