package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.auth.Session;
import com.bridgelabz.employeepayrollapp.entity.Manager;
import com.bridgelabz.employeepayrollapp.entity.RegularEmployee;
import com.bridgelabz.employeepayrollapp.entity.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthenticationService {
    private Map<String, User> users = new HashMap<>();
    private int maxAttempts = 3;

    public AuthenticationService() {
        // predefined demo users
        users.put("emp1", new RegularEmployee("emp1", "emp1"));
        users.put("manager1", new Manager("manager1", "manager1"));
    }

    public Session login() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.print("\nEnter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            User user = (User) users.get(username);

            if (user != null && user.authenticate(username, password)) {
                System.out.println("\nLogin Successful!");
                System.out.println("Role: " + user.getRole());

                Session session = new Session(username);

                showDashboard(user.getRole());

                return session;
            }
            attempts++;
            System.out.println("Remaining attempts: " + (maxAttempts - attempts));
        }
        System.out.println("Account temporarily locked due to 3 failed attempts!");
        return null;
    }

    private void showDashboard(String role) {
        System.out.println("\n------DASHBOARD------");

        if ("EMPLOYEE".equals(role))
            System.out.println("Employee dashboard");
        if ("MANAGER".equals(role))
            System.out.println("Manager dashboard");
    }
}
