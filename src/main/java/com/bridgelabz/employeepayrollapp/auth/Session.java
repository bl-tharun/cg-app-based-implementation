package com.bridgelabz.employeepayrollapp.auth;

public class Session {
    private String username;
    private long loginTime;
    private long timeoutMillis;

    public Session(String username) {
        this.username = username;
        this.loginTime = System.currentTimeMillis();
        this.timeoutMillis = 2 * 60 * 1000; // 2 minutes
    }

    public boolean isExpired() {
        long current = System.currentTimeMillis();
        return (current - loginTime) > timeoutMillis;
    }

    @Override
    public String toString() {
        return "Session active for user: " + username;
    }
}
