package kr.ac.engrzebra.dao;

import java.util.List;

import javax.sql.DataSource;

import kr.ac.engrzebra.dto.Enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("enterpriseDAO")
public class EnterpriseDAO {
	
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from member";
		
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);																		
	}
	
	// Querying and returning a single object
	public Enterprise getEnterprise(String email) {
		try {
			String sqlStatement = "select * from enterprisetb where email=?";
			return jdbcTemplateObject.queryForObject(sqlStatement, new Object[] { email }, new EnterpriseMapper());
		} catch (Exception e) {
			System.out.println("DAO 예외 처리 발생 획인 메세지 ");
			e.printStackTrace();
			return null;
		}
	}

	// Querying and returning multiple object
	public List<Enterprise> getEnterprises() {

		String sqlStatement = "select * from enterprisetb";
		
		return jdbcTemplateObject.query(sqlStatement, new EnterpriseMapper()); // Anonymous																	// Classes
	}

	public boolean insert(Enterprise enterprise) {

		String companyName = enterprise.getCompanyName();
		String email = enterprise.getEmail();
		String password = enterprise.getPassword();
		String sqlStatement = "insert into enterprisetb (companyName, email, password) values (?,?,?)";
		
		return (jdbcTemplateObject.update(sqlStatement, new Object[] { companyName, email, password }) == 1);
	}

	public boolean update(Enterprise enterprise) {

		String companyName = enterprise.getCompanyName();
		String email = enterprise.getEmail();
		String password = enterprise.getPassword();
		String sqlStatement = "update enterprisetb set companyName=?, email=?, password=? where email=?";
		
		return (jdbcTemplateObject.update(sqlStatement, new Object[] { companyName, email, password, email }) == 1);
	}

	public boolean delete(int email) {

		String sqlstatement = "delete from enterprisetb where email=?";
		
		return (jdbcTemplateObject.update(sqlstatement, new Object[] { email }) == 1);
	}
}