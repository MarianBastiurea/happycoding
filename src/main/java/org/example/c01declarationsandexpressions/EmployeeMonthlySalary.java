package org.example.c01declarationsandexpressions;

import java.util.Scanner;

/*
Write a Java program that accepts an employee's ID, total worked hours in a month
and the amount he received per hour. Print the ID and salary (with two decimal places)
of the employee for a particular month.
*/
public class EmployeeMonthlySalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID: ");
        String ID = sc.next();
        System.out.println("Enter employee hourly salary: ");
        double hourlySalary = sc.nextDouble();
        System.out.print("Enter employee worked hours: ");
        double workedHours = sc.nextDouble();
        double monthlySalary = hourlySalary * workedHours;
        System.out.printf("Employee Id: " + ID + " and monthly salary is: %.2f", monthlySalary);
    }
}
