package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AdminDao;
import com.example.dao.SignUpDao;
import com.example.model.Admin;
import com.example.model.Employee;
@Service
public class SignUpService {
    @Autowired
    private SignUpDao signUpDao;
    
    @Autowired 
    private AdminDao adminDao;
    

	public String addEmployee(Employee obj) {
		// TODO Auto-generated method stub
		System.out.println("in User service");
		int size=signUpDao.findAll().size();
		Optional<Employee> emp=signUpDao.findAll().stream().filter((o)->o.getEmail().equals(obj.getEmail())).findFirst();
		if(!emp.isPresent()) {
		signUpDao.save(obj); 
		 return "employee added successfully";
		}else if(size==0){
			return "Sign Up to create account";
		}else {
			return "user already present";
		}
		
	}

	public String addAdmin(Admin obj) {
		// TODO Auto-generated method stub
		System.out.println("in AdminService");
		int size=signUpDao.findAll().size();
		Optional<Admin> emp=adminDao.findAll().stream().filter((o)->o.getEmail().equals(obj.getEmail())).findFirst();
		if(!emp.isPresent()) {
		  adminDao.save(obj); 
		 return "Admin added successfully";
		}else if(size==0) {
			return "sign Up to create account";
		}
		else {
			return "admin already present";
		}
		
	}
    
	
     
}
