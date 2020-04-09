package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Admin;
@Repository
public interface AdminDao extends MongoRepository<Admin,String>{

}
