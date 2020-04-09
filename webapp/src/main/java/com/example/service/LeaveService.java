package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.dao.LeaveDetailDao;
import com.example.model.Leave;
@Service
public class LeaveService {

	@Autowired
	private LeaveDetailDao leaveDetailDao;
	
	public void addLeavesDetail(Leave obj) {
		// TODO Auto-generated method stub
		leaveDetailDao.save(obj);
	}

	public List<Leave> getLeaveDetails() {
		// TODO Auto-generated method stub
		System.out.println("list got values");
		List<Leave> list=leaveDetailDao.findAll();
		if(!CollectionUtils.isEmpty(list)) {
			
			return list;
	  }else {
		  return null;
	  }
	}

	
  
}
