package com.example.socialmediatdcproject.model;

public class User {
    private int userId;
    private String email;
    private String password;
    private String fullName;
    private String avatar;
    private String phoneNumber;
    private int roleId;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public User(int userId, String email, String password, String fullName, String avatar, String phoneNumber, int roleId) {
        this.email = email;
        this.userId = userId;
        this.password = password;
        this.fullName = fullName;
        this.avatar = avatar;
        this.roleId = roleId;
        this.phoneNumber = phoneNumber;
    }

    public User() {
        this.email = "";
        this.userId = 0;
        this.password = "";
        this.fullName = "";
        this.avatar = "";
        this.roleId = 0;
        this.phoneNumber = "";
    }
}
