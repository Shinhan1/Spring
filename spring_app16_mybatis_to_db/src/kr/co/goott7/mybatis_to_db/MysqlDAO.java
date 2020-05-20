package kr.co.goott7.mybatis_to_db;

import java.util.List;

public class MysqlDAO implements DAO {
	ConnectionManager cm;
	
	public void setCm(ConnectionManager cm) {
		this.cm = cm;
	}
	
	
	@Override
	public List<EmpDTO> selectAll() {
		// TODO Auto-generated method stub
		return cm.getFactory().openSession(true).selectList("selectAll");
	}

	@Override
	public EmpDTO selectOne(int no) {
		// TODO Auto-generated method stub
		return cm.getFactory().openSession(true).selectOne("selectOneByEmpno", no);
	}

	@Override
	public void insertOne(EmpDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOne(EmpDTO dto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteOne(int empno) {
		// TODO Auto-generated method stub

	}

}
