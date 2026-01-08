package com.bridgelabz.employeepayrollapp.entity;

public abstract class User {
    protected String username;
    protected String passwordHash;
    protected String role;

    public User(String username, String passwordHash, String role) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.role = role;
    }

    public abstract boolean authenticate(String username, String password);

    public String getRole() {
        return role;
    }
}
