package com.example.payroll;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PayrollTest {

    @Test
    void testSalaryCalculation() {
        Payroll payroll = new Payroll();

        double result = payroll.calculateSalary(30000, 2);

        assertEquals(28000, result);
    }
}