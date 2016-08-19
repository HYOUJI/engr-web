package kr.ac.engrzebra.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import kr.ac.engrzebra.dto.AppUser;

import org.springframework.jdbc.core.RowMapper;

public class AppUserMapper implements RowMapper<AppUser>{

	public AppUser mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		AppUser appUser =new AppUser();
		
		appUser.setName(rs.getString("name"));
		appUser.setEmail(rs.getString("email"));
		appUser.setLastReviewDate(rs.getString("lastReviewDate"));
		appUser.setLevel(rs.getString("level"));
		appUser.setMemberUrl(rs.getString("memberUrl"));
		appUser.setPassword(rs.getString("password"));
		appUser.setPhoneNumber(rs.getString("phoneNumber"));
		appUser.setPoint(rs.getInt("point"));
		appUser.setReviewCount(rs.getInt("reviewCount"));
		appUser.setTotalReviewCount(rs.getInt("totalReviewCount"));
		
		return appUser;		
	}
}