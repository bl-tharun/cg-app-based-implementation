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

    public Employee(String empId, String name) {
        this.empId = empId;
        this.name = name;
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

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
