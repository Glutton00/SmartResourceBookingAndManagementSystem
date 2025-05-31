package com.srbm.dto;

public class Admin extends User {
    private String role;

	public Admin(String userId, String userName, String userPassword, String email, String phoneNumber, String role) {
	    super(userId, userName, userPassword, email, phoneNumber, "ADMIN");
	    this.role = role;
    }

	public String getRole() { 
    	return this.role;
  }
}