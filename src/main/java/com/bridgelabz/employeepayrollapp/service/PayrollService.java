package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.entity.Employee;
import com.bridgelabz.employeepayrollapp.entity.Payslip;
import com.bridgelabz.employeepayrollapp.entity.SalaryComponents;

public class PayrollService {
    public Payslip generatePayslip(
            Employee employee,
            String month,
            double basic,
            double hra,
            double da,
            double allowances
    ) {
        SalaryComponents sc = new SalaryComponents(basic, hra, da, allowances);

        // ---- Gross Salary ----
        double gross = basic + hra + da + allowances;

        // ---- Deductions ----
        sc.pf = basic * 0.12;        // 12% PF
        sc.tax = gross * 0.10;       // 10% income tax (demo rule)

        // ---- Net Pay ----
        sc.netPay = gross - (sc.pf + sc.tax);

        return new Payslip(employee, sc, month);
    }
}
