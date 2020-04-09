package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.service.LoginService;

@Controller
public class LoginController {
	  
	
	@Autowired
	private LoginService loginService;
    
	@RequestMapping("login")
	public String Login(String email,String psw,HttpSession session)
	{
		
	  String check=loginService.checkLogin(email,psw);
	   if(check.equals("validUser")) {
		   session.setAttribute("User",email);
		   return "LeaveManager.jsp";
	   }else {
		   return "hello.jsp";
	   }
	 }
	   
		@RequestMapping("adminLogin")
		public String adminLogin(String email,String psw,HttpSession session)
		{
			
		  String check=loginService.checkAdminLogin(email,psw);
		   if(check.equals("validUser")) {
			   session.setAttribute("Admin",email);
			   return "AdminLeaveManager.jsp";
		   }else {
			   return "AdminSignUp.jsp";
		   }
	   
	  
	   
	}
}
