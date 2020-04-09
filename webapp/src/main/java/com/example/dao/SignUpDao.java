package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;
@Repository
public interface SignUpDao extends MongoRepository<Employee,String>{

}
