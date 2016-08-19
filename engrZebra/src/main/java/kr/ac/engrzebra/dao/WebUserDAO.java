package kr.ac.engrzebra.dao;

import javax.sql.DataSource;

import kr.ac.engrzebra.dto.WebUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

//웹 유저 - 기업(enterprise) /일반(common) 사용자  ~ DB의 user 속성 값으로 판별 
@Component("webUserDAO")
public class WebUserDAO {
	
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from webusertb";
		
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}

	
	// Querying and returning a webUser
		public WebUser getWebUser(String email) {

			try {
				String sqlStatement = "select * from webusertb where email=?";

				return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { email }, new WebUserMapper());
			} catch (Exception e) {

				System.out.println("WebUserDAO - getWebUser() 예외 처리 메세지 ");
				e.printStackTrace();
				
				return null;
			}
		}

	public boolean insert(WebUser webUser) {

		String name = webUser.getName();
		String email = webUser.getEmail();
		String password = webUser.getPassword();
		String user = webUser.getUser();
		
		String sqlStatement = "insert into enterprisetb (name, email, password, user) values (?,?,?,?)";
		
		return (jdbcTemplateObject.update(sqlStatement, new Object[] { name, email, password, user }) == 1);
	}

	public boolean update(WebUser webUser) {

		String name = webUser.getName();
		String email = webUser.getEmail();
		String password = webUser.getPassword();
		String user = webUser.getUser();
		
		String sqlStatement = "update enterprisetb set companyName=?, email=?, password=?, user=? where email=?";
		
		return (jdbcTemplateObject.update(sqlStatement, new Object[] { name, email, password, user }) == 1);
	}

	public boolean delete(int email) {

		String sqlstatement = "delete from webusertb where email=?";
		
		return (jdbcTemplateObject.update(sqlstatement, new Object[] { email }) == 1);
	}
}