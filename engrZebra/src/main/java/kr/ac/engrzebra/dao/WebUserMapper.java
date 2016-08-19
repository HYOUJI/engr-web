package kr.ac.engrzebra.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import kr.ac.engrzebra.dto.WebUser;

import org.springframework.jdbc.core.RowMapper;

public class WebUserMapper implements RowMapper<WebUser>{
	
	public WebUser mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		WebUser webUser =new WebUser();
	
		webUser.setName(rs.getString("name"));
		webUser.setEmail(rs.getString("email"));
		webUser.setPassword(rs.getString("password"));
		webUser.setUser(rs.getString("user"));
		
		return webUser;
	}
}