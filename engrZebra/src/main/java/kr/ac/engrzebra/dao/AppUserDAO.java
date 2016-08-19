package kr.ac.engrzebra.dao;

import javax.sql.DataSource;

import kr.ac.engrzebra.dto.AppUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

// App User - 일반사용자
@Component("appUserDAO")
public class AppUserDAO {
	
	 private JdbcTemplate jdbcTemplateObject;
	
	 @Autowired
	   public void setDataSource(DataSource dataSource) {
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }

	   // 앱 사용자 가져오기
	   public AppUser getAppUser(String email) {
	      try {
	         String sqlStatement = "select * from appusertb where email=?";
	         return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { email }, new AppUserMapper());
	      } catch (Exception e) {
	         System.out.println("AppUserDAO - getAppUser() 예외 처리 메시지 발생");

	         return null;
	      }
	   }
	
	   
	   
	   public void setting(String email, int reviewCount, int point, int totalReviewCount) {
		   String sqlStatement = "update membertb set reviewCount = ?, point= ?, totalreviewcount= ? where email = ?";

	       totalReviewCount++;
	       reviewCount--;
	       point += 10;

	       jdbcTemplateObject.update(sqlStatement, new Object[] { reviewCount, point, totalReviewCount, email });

	       System.out.println(totalReviewCount);

	       if (totalReviewCount == 4) {
	          sqlStatement = "update membertb set level = 'silver' where email = ?";
	          jdbcTemplateObject.update(sqlStatement, new Object[] { email });
	       } 
	       else if (totalReviewCount == 7) {
	          sqlStatement = "update membertb set level = 'gold' where email = ?";
	          jdbcTemplateObject.update(sqlStatement, new Object[] { email });
	       }
	    }
 
	   public void setting2(String email, int reviewCount, int point, String nowDate, int totalReviewCount) {
		   
		   String sqlStatement = "update membertb set reviewCount = ?, point= ?, lastreviewdate= ?, totalreviewcount= ? where email = ?";

	       totalReviewCount++;
	       reviewCount = 2;
	       point += 10;

	       jdbcTemplateObject.update(sqlStatement, new Object[] { reviewCount, point, nowDate, totalReviewCount, email });

	       if (totalReviewCount == 4) {
	    	   sqlStatement = "update membertb set level = 'Silver' where email = ?";
	           jdbcTemplateObject.update(sqlStatement, new Object[] { email }); 
	       } 
	       else if (totalReviewCount == 7) {
	    	   sqlStatement = "update membertb set level = 'Gold' where email = ?";
	           jdbcTemplateObject.update(sqlStatement, new Object[] { email });
	       } 
	   }
}