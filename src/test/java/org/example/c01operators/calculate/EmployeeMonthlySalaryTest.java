package org.example.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeMonthlySalaryTest {

    @Test
    void calculateSalary() {
        double hourlySalary = 10D;
        double workedHours = 5D;

        double monthlySalary = EmployeeMonthlySalary.getMonthlySalary(hourlySalary, workedHours);

        assertEquals(50D,monthlySalary);
    }
}