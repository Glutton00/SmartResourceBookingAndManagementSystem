package com.capg.srbm.dto;

public class RegularUser extends User {
    private String role;

    public RegularUser(String userId, String userName, String userPassword,String email,String phoneNumber, String role) {
        super(userId, userName, userPassword,   email, phoneNumber, "REGULAR_USER");
        this.role = role;
    }

    public String getRole() { return role; }
    
}
