package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.model.Leave;
import com.example.service.LeaveService;

@Controller
public class LeaveController {
	@Autowired
	private LeaveService leaveService;
	
   @PostMapping("addleave")
	public String addLeave(@ModelAttribute Leave obj) {
		leaveService.addLeavesDetail(obj);
		return "LeaveManager.jsp";
	}
   
   @GetMapping("getLeaveDetails")
   public String getLeaveDetails(Model model) {
	   System.out.println("inside getLeaveDetails");
	   List<Leave> s=leaveService.getLeaveDetails();
	   model.addAttribute("list",s);
	    return "AdminLeaveManager.jsp";
	   
   }
}
