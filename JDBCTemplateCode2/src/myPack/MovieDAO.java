package myPack;

import org.springframework.jdbc.core.JdbcTemplate;

public class MovieDAO {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveMovie(Movies m1) {
		String sqlStr = "Insert into mtb values("+m1.getMid()+",'"+m1.getActor()+"','"+m1.getTitle()+"')";
		return jdbcTemplate.update(sqlStr);
	}
}
