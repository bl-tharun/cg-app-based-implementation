package com.bridgelabz.employeepayrollapp;

import com.bridgelabz.employeepayrollapp.entity.Employee;
import com.bridgelabz.employeepayrollapp.entity.UserAccount;
import com.bridgelabz.employeepayrollapp.exception.ValidationException;
import com.bridgelabz.employeepayrollapp.validation.Validator;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeRegistrationApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------ UC1: EMPLOYEE REGISTRATION ------");
        try {
            // taking and validating employee id
            System.out.print("Enter Employee Id (EMP-XXXX): ");
            String empId = scanner.nextLine();
            Validator.validateEmpId(empId);

            // taking and validating name
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            Validator.validateName(name);

            // taking and validating email
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            Validator.validateEmail(email);

            // taking and validating phone number
            System.out.print("Enter Phone Number (must be 10 digits): ");
            String phone = scanner.nextLine();
            Validator.validatePhone(phone);

            System.out.print("Create Username: ");
            String username = scanner.nextLine();
            System.out.print("Create Password: ");
            String password = scanner.nextLine();

            // create account and employee object
            UserAccount account = new UserAccount(username, password);
            Employee employee = new Employee(empId, name, email, phone, account);

            // store it in a file
            employee.persist();

            // confirm registration
            System.out.println("\n-------------------------------");
            System.out.println(employee);
            System.out.println("Data persisted in file: employee_data.txt");
            System.out.println("-------------------------------");
        } catch (ValidationException e) {
            System.out.println("\nValidation Failed: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("\nError Saving Employee Data");
        }
    }
}
