package com.elearnsystem.models;

public class Faculty {
	
	String email;
	String password;
	public Faculty() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Faculty [email=" + email + ", password=" + password + "]";
	}
  
	
}
