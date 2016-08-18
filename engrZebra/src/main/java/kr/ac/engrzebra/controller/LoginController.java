package kr.ac.engrzebra.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ac.engrzebra.dto.Enterprise;
import kr.ac.engrzebra.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

private LoginService loginService;
	
	@Autowired//di 주입 
	public void setLoginService(LoginService loginService){
		this.loginService = loginService;	
	}

	@RequestMapping("/doLogin")
	public String showDoLoginPage(Model model, HttpSession session, HttpServletRequest request){

		String temail = request.getParameter("email");
		String tpassword = request.getParameter("password");
		
		Enterprise enterprise =loginService.checkEnterprise(temail,tpassword);

		if(enterprise == null){
			System.out.println("로그인 실패");
			return "failLogin";
	
		} else {
			System.out.println("로그인 성공");
			
			model.addAttribute("modelLoginMember", enterprise);
			session.setAttribute("sessionLoginMember", enterprise);		
			session.setAttribute("logOk", enterprise.getCompanyName());
	
			return "home";
		}	
	}
	
	@RequestMapping("/logout")
	public String showLogoutPage(){
		//로그아웃시 홈페이지로 이동시킨다.
		return "logout";
	}

}