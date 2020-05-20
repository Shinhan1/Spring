package spring_app14_jdbc;

import java.util.List;

public interface DAO {
	public List<EmpDTO> selectAll();
	public EmpDTO selectOne(int no);
	public void insertOne(EmpDTO dto);
	public void updateOne(EmpDTO dto);
	public void deleteOne(int empno);
}
