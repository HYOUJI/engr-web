package kr.ac.engrzebra.controller;

import kr.ac.engrzebra.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
	
	private LoginService loginService;
	
	@Autowired
	public void setLoginService(LoginService loginService){
		this.loginService = loginService;
	}

	
	
}
