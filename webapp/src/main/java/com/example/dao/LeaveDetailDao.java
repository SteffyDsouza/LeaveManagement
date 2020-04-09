package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Leave;
@Repository
public interface LeaveDetailDao  extends MongoRepository<Leave,String>{

}
