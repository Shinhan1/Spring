package kr.co.goott7.mybatis_to_db;

import java.util.List;


public class MysqlDAO implements DAO {
	ConnectionManager cm;
	
	public void setCm(ConnectionManager cm) {
		this.cm = cm;
	}
	
	@Override
	public List<DeptDTO> selectAll() {
//		SqlSessionFactory factory = cm.getFactory();
		
//		SqlSession ss = factory.openSession(true);
//		List<DeptDTO> list = ss.selectList("selectAll");
//		return list;
		
		// method chaining
		return cm.getFactory().openSession(true).selectList("selectAll");
	}
	
	@Override
	public DeptDTO selectOne(int no) {
		return cm.getFactory().openSession(true).selectOne("selectOneByDeptno", no);
	}
	
	@Override
	public void insertOne(DeptDTO dto) {
		// TODO Auto-generated method stub
		cm.getFactory().openSession(true).insert("insertOneByDept", dto);
		
	}
	
	@Override
	public void updateOne(DeptDTO dto) {
		// TODO Auto-generated method stub
		cm.getFactory().openSession(true).insert("updateOneByDept", dto);
	}
	
	@Override
	public void deleteOne(int no) {
		// TODO Auto-generated method stub
		cm.getFactory().openSession(true).delete("deleteOneByDeptno", no);
		
	}
}
