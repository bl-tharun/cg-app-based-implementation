package com.bridgelabz.employeepayrollapp.entity;

import java.io.FileWriter;
import java.io.IOException;

public class Employee {
    private String empId;
    private String name;
    private String phone;
    private String email;
    private UserAccount account;

    public Employee(String empId, String name, String email, String phone, UserAccount account) {
        this.empId = empId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.account = account;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", account=" + account +
                '}';
    }

    // persist employee to a text file
    public void persist() throws IOException {
        FileWriter writer = new FileWriter("employee_data.txt", true);
        writer.write(empId + "," + name + "," + email + "," + phone + "," + account.getUsername() + "\n");
        writer.close();
    }
}
