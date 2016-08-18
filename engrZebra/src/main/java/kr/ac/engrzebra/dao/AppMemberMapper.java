package kr.ac.engrzebra.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import kr.ac.engrzebra.dto.Member;

import org.springframework.jdbc.core.RowMapper;

public class AppMemberMapper implements RowMapper<Member>{

	public Member mapRow(ResultSet rs, int rowNum) throws SQLException{
		
		Member member =new Member();
		
		member.setId(rs.getString("id"));
		member.setLastReviewDate(rs.getString("lastReviewDate"));
		member.setLevel(rs.getString("level"));
		member.setMemberUrl(rs.getString("memberUrl"));
		member.setName(rs.getString("name"));
		member.setPassword(rs.getString("password"));
		member.setPhoneNumber(rs.getString("phoneNumber"));
		member.setPoint(rs.getInt("point"));
		member.setReviewCount(rs.getInt("reviewCount"));
		member.setTotalReviewCount(rs.getInt("totalReviewCount"));
		
		return member;		
	}
}

