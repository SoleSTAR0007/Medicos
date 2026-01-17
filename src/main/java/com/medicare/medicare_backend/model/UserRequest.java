package com.medicare.medicare_backend.model;

import java.time.LocalDateTime;


/**
 * Base user entity for all system users:
 * PATIENT, DOCTOR, ADMIN
 */

public class UserRequest {

    private Long id;

    
    private String name;

    
    private String email;

    
    private String password;

    
    private Role role;

    private String phone;

   
    private boolean verified;

    private LocalDateTime createdAt;

    // -------- Constructors --------

    public UserRequest() {
    }

    public UserRequest(String name, String email, String password, Role role, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.phone = phone;
        this.verified = false;
        this.createdAt = LocalDateTime.now();
    }

    // -------- Getters & Setters --------

    public Long getId() {
        return id;
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
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Role getRole() {
        return role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public boolean isVerified() {
        return verified;
    }
    
    public void setVerified(boolean verified) {
        this.verified = verified;
    }
    
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
