package kr.ac.engrzebra.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import kr.ac.engrzebra.dto.Enterprise;

import org.springframework.jdbc.core.RowMapper;

public class EnterpriseMapper implements RowMapper<Enterprise>{
	
	public Enterprise mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		Enterprise enterprise = new Enterprise();
		
		enterprise.setCompanyName(rs.getString("companyName"));
		enterprise.setEmail(rs.getString("email"));
		enterprise.setPassword(rs.getString("password"));
		
		return enterprise;
	}
}
