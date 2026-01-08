package com.bridgelabz.employeepayrollapp;

import com.bridgelabz.employeepayrollapp.entity.Employee;
import com.bridgelabz.employeepayrollapp.entity.Payslip;
import com.bridgelabz.employeepayrollapp.service.PayrollService;

import java.util.Scanner;

public class UseCase3PayslipApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== USE CASE 3: PAYSLIP GENERATION ===");

        // employee (normally authenticated earlier)
        System.out.print("Enter Employee ID: ");
        String empId = sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        Employee employee = new Employee(empId, name);

        System.out.print("Enter Month (e.g., January 2026): ");
        String month = sc.nextLine();

        // salary inputs
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        double da = sc.nextDouble();

        System.out.print("Enter Allowances: ");
        double allowances = sc.nextDouble();

        PayrollService payrollService = new PayrollService();

        Payslip payslip = payrollService.generatePayslip(
                employee,
                month,
                basic,
                hra,
                da,
                allowances
        );

        // display formatted payslip
        System.out.println(payslip);
    }
}
