package spring_app14_jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MysqlDAO implements DAO {
	
	StringBuffer sb = new StringBuffer();
	private JdbcTemplate jdbcTemplate;


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<EmpDTO> selectAll() {
		sb.setLength(0);
		sb.append("select empno, ename, sal, deptno from emp ");
		
		
		RowMapper<EmpDTO> rm = new RowMapper<EmpDTO>() {
			@Override
			public EmpDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				/* EmpDTO의 생성자를 이용해 한번에 리턴해준다 */
				return new EmpDTO(rs.getInt(1), rs.getString(2),
							rs.getInt(3), rs.getInt(4));
			}
			
		};
		
		List<EmpDTO> list = jdbcTemplate.query(sb.toString(), rm);
		
		return list;
	}

	@Override
	public EmpDTO selectOne(int no) {
		sb.setLength(0);
		sb.append("select empno, ename, sal, deptno from emp ");
		sb.append("where empno = ? ");
		
		RowMapper<EmpDTO> rm = new RowMapper<EmpDTO>() {
			@Override
			public EmpDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new EmpDTO(rs.getInt(1), rs.getString(2),
							rs.getInt(3), rs.getInt(4));
			}
			
		};
		EmpDTO dto = jdbcTemplate.queryForObject(sb.toString(), rm, no);
		
		
		return dto;
	}

	@Override
	public void insertOne(EmpDTO dto) {
		sb.setLength(0);
		sb.append("insert into emp ");
		sb.append("values (?, ?, 0, 0, now, ?, 0, ?) ");
		
		int result = jdbcTemplate.update(sb.toString(), dto.getEmpno(), 
				dto.getEname(), dto.getSal(), dto.getDeptno());
		
		System.out.println("insert 처리 : " + result);

	}

	@Override
	public void updateOne(EmpDTO dto) {

	}

	@Override
	public void deleteOne(int empno) {

	}

}
