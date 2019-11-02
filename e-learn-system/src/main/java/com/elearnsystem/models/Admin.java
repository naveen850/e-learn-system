package com.elearnsystem.models;

public class Admin {
	
	String user;
	String password;
	public Admin() {
		super();
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [user=" + user + ", password=" + password + "]";
	}
	

}
