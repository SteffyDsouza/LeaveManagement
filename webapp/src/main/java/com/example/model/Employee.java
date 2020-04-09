package com.example.model;
import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Component
@Getter
@Setter
@NoArgsConstructor
@Document(collection = "User")
public class Employee implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
   private String name;
  private String email;
  private String projectname;
  private String supervisor;
  private String password;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getProjectname() {
	return projectname;
}
public void setProjectname(String projectname) {
	this.projectname = projectname;
}
public String getSupervisor() {
	return supervisor;
}
public void setSupervisor(String supervisor) {
	this.supervisor = supervisor;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
  
}
