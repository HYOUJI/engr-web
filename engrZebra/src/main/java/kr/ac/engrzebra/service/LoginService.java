package kr.ac.engrzebra.service;

import kr.ac.engrzebra.dao.AppMemberDAO;
import kr.ac.engrzebra.dao.EnterpriseDAO;
import kr.ac.engrzebra.dto.Enterprise;
import kr.ac.engrzebra.dto.Member;
import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService {

	private EnterpriseDAO enterpriseDAO;
	private AppMemberDAO memberDAO;

	@Autowired // DI ¡÷¿‘
	public void setEnterpriseDAO(EnterpriseDAO enterpriseDAO) {
		this.enterpriseDAO = enterpriseDAO;
	}

	@Autowired
	public void setMemberDAO(AppMemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	public Enterprise checkEnterprise(String temail, String tpassword) {

		Enterprise enterprise = enterpriseDAO.getEnterprise(temail);

		if (enterprise == null) {
			return null;
		} else {
			String dbpassword = enterprise.getPassword();

			if (dbpassword.equals(tpassword)) {
				return enterprise;
			} else {
				return null;
			}
		}
	}
	
	
	//MOBILE - user
	/*
	@Autowired
	public void setMemberDAO(AppMemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	public Member checkMember(String id, String password) {

		Member member = memberDAO.getMember(id);
		if (member == null) {
			return null;
		} else {
			String dbpassword = member.getPassword();

			if (dbpassword.equals(password)) {
				return member;
			} else {
				return null;
			}
		}
	}
	*/
}
