package spring_app13_jdbc;

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
	public List<DeptDTO> selectAll() {
		sb.setLength(0);
		sb.append("select * from dept ");
		
		/*
		RowMapper : 데이터베이스의 테이블을 구성하는 각 row를
					틀에 맞게 담아서(Mapping) 구현한 객체
					
		- 사용 : RowMapper는 인터페이스이므로 구현하지(new) 못함, 그러므로 구현한 객체가
			       따로 필요함. -> 한 번 쓰고 말 것이므로 익명클래스로 구현해서 사용함.
		
		*/
		
		RowMapper<DeptDTO> rm = new RowMapper<DeptDTO>() {
			@Override
			public DeptDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
//				DeptDTO dto = new DeptDTO();
//				int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				
//				dto.setDeptno(deptno);
//				dto.setDname(dname);
//				dto.setLoc(loc);
				
				return new DeptDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		};	// RowMapper end
		
		List<DeptDTO> list =jdbcTemplate.query(sb.toString(), rm);
		
		return list;
	}

	@Override
	public DeptDTO selectOne(int no) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("select * from dept ");
		sb.append("where deptno = ? ");
		
		RowMapper<DeptDTO> rm = new RowMapper<DeptDTO>() {
			@Override
			public DeptDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return new DeptDTO(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
			
		};	// RowMapper end
		
		
		DeptDTO dto = jdbcTemplate.queryForObject(sb.toString(), rm, no);		
		
		return dto;
	}

	@Override
	public void insertOne(DeptDTO dto) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("insert into dept ");
		sb.append("values (?, ?, ?) ");
		
		// jdbcTemplate.update(sql문, ?에 들어갈 값을 순서대로 입력)
		int result = jdbcTemplate.update(sb.toString(), dto.getDeptno(), 
				dto.getDname(), dto.getLoc());
		System.out.println("insert 처리 결과 : " + result);

	}

	@Override
	public void updateOne(DeptDTO dto) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("update dept ");
		sb.append("set dname = ?, loc = ? ");
		sb.append("where deptno = ? ");
		
		int result = jdbcTemplate.update(sb.toString(), dto.getDname(),
						dto.getLoc(), dto.getDeptno());
		
		System.out.println("insert 처리 결과 : " + result);
		
		
	}

	@Override
	public void deleteOne(int no) {
		// TODO Auto-generated method stub
		sb.setLength(0);
		sb.append("delete from dept ");
		sb.append("where deptno = ? ");
		
		int result = jdbcTemplate.update(sb.toString(), no);
		
		System.out.println("delete 처리 결과 : " + result);

	}

}
