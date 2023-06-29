package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;


public class UserVO {

	private static final long serialVersionUID = 1L;
	
    private Long id;
	private String User;
	private String pass;
	private List<RoleVO> roles = new ArrayList<>();
	
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<RoleVO> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleVO> roles) {
		this.roles = roles;
	}
	
	
}
