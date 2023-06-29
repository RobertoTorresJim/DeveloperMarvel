package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

public class RoleVO {

	 private Long id;
	private String name;
	private List<UserVO> users = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<UserVO> getUsers() {
		return users;
	}
	public void setUsers(List<UserVO> users) {
		this.users = users;
	}
}
