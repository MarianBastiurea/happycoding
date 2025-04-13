package com.marianbastiurea.c01operators.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeMonthlySalaryTest {

    @Test
    void given10AsHourlySalaryAnd5WorkedHoursSalaryShouldBe50() {
        double hourlySalary = 10D;
        double workedHours = 5D;

        double monthlySalary = EmployeeMonthlySalary.getMonthlySalary(hourlySalary, workedHours);

        assertEquals(50D, monthlySalary);
    }
}