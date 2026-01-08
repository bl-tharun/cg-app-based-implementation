package com.bridgelabz.employeepayrollapp;

import com.bridgelabz.employeepayrollapp.auth.Session;
import com.bridgelabz.employeepayrollapp.service.AuthenticationService;

public class UseCase2LoginApp {
    public static void main(String[] args) {
        System.out.println("------ UC2: EMPLOYEE AUTHENTICATION & LOGIN ------");

        AuthenticationService auth = new AuthenticationService();
        Session session = auth.login();

        if (session != null) {
            System.out.println("\n" + session.toString());
            if (session.isExpired())
                System.out.println("Session expired, login again!");
            else
                System.out.println("Session active and valid");
        }
    }
}
