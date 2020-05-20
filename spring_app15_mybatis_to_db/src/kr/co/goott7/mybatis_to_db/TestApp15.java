package kr.co.goott7.mybatis_to_db;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestApp15 {
	public static void main(String[] args) {
		ApplicationContext context = 
				new GenericXmlApplicationContext("app15.xml");
		
		DAO d = context.getBean("dao", DAO.class);
		
		// 전체 데이터 조회
//		List<DeptDTO> list = d.selectAll();
		
//		for(DeptDTO dto : list) {
//			System.out.println(dto.getDeptno() + "\t" + dto.getDname() + "\t" + dto.getLoc());
//		}
		
		System.out.println("-------------------------------------------");
		
		DeptDTO dto1 = d.selectOne(30);
		System.out.println(dto1.getDeptno() + "\t" + dto1.getDname() + "\t" + dto1.getLoc());
		System.out.println("-------------------------------------------");
		
		// 데이터 삽입
//		DeptDTO dto2 = new DeptDTO(60, "QA", "SEOUL");
//		d.insertOne(dto2);
		
		// 데이터 삭제
		d.deleteOne(60);
		
	}

}
