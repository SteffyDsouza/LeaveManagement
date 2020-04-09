package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Admin;
import com.example.model.Employee;
import com.example.service.SignUpService;

@Controller
public class SignUpController {
	@Autowired
	private SignUpService signUpService;

	@GetMapping("hello")
	 public String UserHome()
	 {
		 System.out.println("dsdjfkjslk");
		 return "hello.jsp";
	 }
	
	@GetMapping("AdminSignUp")
	 public String AdminHome()
	 {
		 System.out.println("dsdjfkjslk");
		 return "AdminSignUp.jsp";
	 }
	 
	 @PostMapping("add")
	 public String signUp2(@ModelAttribute Employee obj)
	 {
         String s=signUpService.addEmployee(obj);
         ModelAndView obj1=new ModelAndView();
         obj1.addObject("msg",s);
         if(s.equals("employee added successfully")) {
        	 return "Login.jsp";
         }else {
		 return "hello.jsp";
         }
	 }
	 
	 @PostMapping("adminSignUp")
	 public String adminSignUp(@ModelAttribute Admin obj,Model model) {
		   String s=signUpService.addAdmin(obj);
	         
	         
	         if(s.equals("Admin added successfully")) {
	        	 model.addAttribute("msg",s);
	        	 return "AdminSignUp.jsp";
	         }else {
	        	 model.addAttribute("msg","admin already exist");
			 return "AdminSignUp.jsp";
	         }
	 }
}
