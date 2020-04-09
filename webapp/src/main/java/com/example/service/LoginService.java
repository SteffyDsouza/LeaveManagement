package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.dao.AdminDao;
import com.example.dao.LoginDao;
import com.example.model.Admin;
import com.example.model.Employee;
@Service
@Component
public class LoginService {

	@Autowired
	private LoginDao loginDao;
	
	@Autowired
	private AdminDao adminDao;

	public String checkLogin(String email, String pass) {
		// TODO Auto-generated method stub
		System.out.println("in login service");
		Optional<Employee> obj=loginDao.findAll().stream().filter((o)->o.getEmail().equals(email)&&o.getPassword().equals(pass)).findFirst();

		if(obj.isPresent()) {
			//session.setAttribute("User",email);
		    System.out.println("found");
			return 	"validUser";
		}else {
			System.out.println("not found");
			return "Invalid Credential";
		}
		
		
		
	}

	public String checkAdminLogin(String email, String psw) {
		// TODO Auto-generated method stub
		System.out.println("in login service");
		Optional<Admin> obj=adminDao.findAll().stream().filter((o)->o.getEmail().equals(email)&&o.getPassword().equals(psw)).findFirst();

		if(obj.isPresent()) {
			//session.setAttribute("User",email);
		    System.out.println("found");
			return 	"validUser";
		}else {
			System.out.println("not found");
			return "Invalid Credential";
		}
		
	}

}
