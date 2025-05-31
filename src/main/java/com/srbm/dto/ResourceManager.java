package com.srbm.dto;

public class ResourceManager extends User {
    private String role;

    public ResourceManager(String userId, String userName, String userPassword,String email,String phoneNumber, String role){
        super(userId, userName, userPassword,   email, phoneNumber, "RESOURCE_MANAGER");
        this.role = role;
    }

    public String getRole() {
         return this.role ;
    }
}
