package com.example.payroll;

public class Payroll {

    public double calculateSalary(double baseSalary, int leaveDays) {
        double deductionPerDay = baseSalary / 30;
        return baseSalary - (deductionPerDay * leaveDays);
    }
}