package com.qldiem.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class taikhoan {
	
	private int id;
	private String username;
	private String password;
	private String email;
	roles role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public roles getRole() {
		return role;
	}
	public void setRole(roles role) {
		this.role = role;
	}
	public taikhoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public taikhoan(int id, String username, String password, String email, roles role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.role = role;
	}
	
	
	
}
