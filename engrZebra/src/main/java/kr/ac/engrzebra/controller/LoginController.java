package kr.ac.engrzebra.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ac.engrzebra.dto.WebUser;
import kr.ac.engrzebra.service.LoginService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//WEB User Login
@Controller
public class LoginController {

	private LoginService loginService;
	
	@Autowired
	public void setLoginService(LoginService loginService){
		this.loginService = loginService;	
	}

	@RequestMapping("/doLogin")
	public String showDoLoginPage(Model model, HttpSession session, HttpServletRequest request){

		String temail = request.getParameter("email");
		String tpassword = request.getParameter("password");
			
		WebUser webUser =loginService.checkWebUser(temail,tpassword);	
		
		if(webUser == null){
			System.out.println("로그인 실패");
			return "failLogin";
	
		} else {
			System.out.println("로그인 성공");
			
			model.addAttribute("modelLoginMember", webUser);
			session.setAttribute("sessionLoginMember", webUser);		
			session.setAttribute("loginUser", webUser.getName());
			session.setAttribute("user", webUser.getUser());

			System.out.println(session.getAttribute("user"));
			
			return "home";
		}	
	}
	
	@RequestMapping("/logout")
	public String showLogoutPage(){
		//로그아웃시 홈페이지로 이동시킨다.
		return "logout";
	}
}