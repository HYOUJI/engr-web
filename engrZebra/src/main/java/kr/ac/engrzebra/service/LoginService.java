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
	
	/* �� ����� �α��� ó�� */
	public WebUser checkWebUser(String temail, String tpassword) {

		//1. �̸����� �̿��� �ش� ������ �����´�
		WebUser webUser = webUserDAO.getWebUser(temail);
		
		/* 2. user���� �̿��� � ��������� �Ǻ� test */
		//enterprise login test
		if(webUser.getUser().equals("enterprise")){
			System.out.println("��� �����");
		}
		//�Ϲ� ����� 
		else if(webUser.getUser().equals("common")){
			System.out.println("�Ϲ� �����");
		}
		else System.out.println("user���� ���� �߸��� ����� �Դϴ�.");

		
		//��ϵ��� ���� �����
		if (webUser == null) 
			return null;
		
		//��ϵ� �����
		else {
			String dbpassword = webUser.getPassword();

			if (dbpassword.equals(tpassword)) {
				return webUser;
			}
			else 
				return null;
		}
	}
	
	
	/* �� ����� �α��� ó�� */
	public AppUser checkAppUser(String email, String password) {

		AppUser appUser = appUserDAO.getAppUser(email);
		
		//��ϵ��� ���� �����
		if (appUser == null)
			return null;
		
		//��ϵ� �����
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