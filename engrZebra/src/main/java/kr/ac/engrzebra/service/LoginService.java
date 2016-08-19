package kr.ac.engrzebra.service;

import kr.ac.engrzebra.dao.AppUserDAO;
import kr.ac.engrzebra.dao.WebUserDAO;
import kr.ac.engrzebra.dto.WebUser;
import kr.ac.engrzebra.dto.AppUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//WEB & APP Login Service
@Service("loginService")
public class LoginService {

	private WebUserDAO webUserDAO;
	private AppUserDAO appUserDAO;

	@Autowired 
	public void setWebUserDAO(WebUserDAO webUserDAO) {
		this.webUserDAO = webUserDAO;
	}

	@Autowired
	public void setAppUserDAO(AppUserDAO appUserDAO) {
		this.appUserDAO = appUserDAO;
	}
	
	/* 웹 사용자 로그인 처리 */
	public WebUser checkWebUser(String temail, String tpassword) {

		//1. 이메일을 이용해 해당 유저를 가져온다
		WebUser webUser = webUserDAO.getWebUser(temail);
		
		/* 2. user값을 이용해 어떤 사용자인지 판별 test */
		//enterprise login test
		if(webUser.getUser().equals("enterprise")){
			System.out.println("기업 사용자");
		}
		//일반 사용자 
		else if(webUser.getUser().equals("common")){
			System.out.println("일반 사용자");
		}
		else System.out.println("user값이 없는 잘못된 사용자 입니다.");

		
		//등록되지 않은 사용자
		if (webUser == null) 
			return null;
		
		//등록된 사용자
		else {
			String dbpassword = webUser.getPassword();

			if (dbpassword.equals(tpassword)) {
				return webUser;
			}
			else 
				return null;
		}
	}
	
	
	/* 앱 사용자 로그인 처리 */
	public AppUser checkAppUser(String email, String password) {

		AppUser appUser = appUserDAO.getAppUser(email);
		
		//등록되지 않은 사용자
		if (appUser == null)
			return null;
		
		//등록된 사용자
		else {
			String dbpassword = appUser.getPassword();
			
			if (dbpassword.equals(password)){
				return appUser;
			}
			else
				return null;
		}
	}	
}