package spring_app14_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestApp14 {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("app14.xml");
		DAO dao = context.getBean("dao", DAO.class);
		
		List<EmpDTO> list = dao.selectAll();
		
		for(EmpDTO dto : list) {
			System.out.println("사원번호 : " + dto.getEmpno() + "\t" +
					"사원이름 : " + dto.getEname() + "\t" + "연봉 : " + 
					dto.getSal() + "\t" + "부서번호 : " + dto.getDeptno());
		}
		
		System.out.println("-----------------------------------------------------------");
		
		EmpDTO dto1 = dao.selectOne(7782);
		System.out.println("사원번호 : " + dto1.getEmpno() + "\t" +
					"사원이름 : " + dto1.getEname() + "\t" + "연봉 : " + 
					dto1.getSal() + "\t" + "부서번호 : " + dto1.getDeptno());
		
		System.out.println("-----------------------------------------------------------");
		
		EmpDTO dto2 = new EmpDTO(9999, "SHIN", 8000, 40);
		dao.insertOne(dto2);
		
	}
}
