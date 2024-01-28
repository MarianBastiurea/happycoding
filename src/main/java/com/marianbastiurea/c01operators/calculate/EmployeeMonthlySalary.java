package com.marianbastiurea.c01operators.calculate;

/*
Write a Java program that accepts an employee's ID, total worked hours in a month
and the amount he received per hour. Print the ID and salary (with two decimal places)
of the employee for a particular month.
*/
public class EmployeeMonthlySalary {
    private EmployeeMonthlySalary () {}


    public static double getMonthlySalary(double hourlySalary, double workedHours) {
        double monthlySalary = hourlySalary * workedHours;
        return monthlySalary;
    }
}
