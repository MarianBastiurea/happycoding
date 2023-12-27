package org.example;

import java.util.Scanner;

/*Write a Java program that accepts an employee's ID, total worked hours in a month
and the amount he received per hour. Print the ID and salary (with two decimal places)
of the employee for a particular month.
https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/c-programming-basic-exercises-12.php
*/
public class C01P12_Displays_Employee_ID_And_Monthly_Salary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID:");
        String ID = sc.next();
        System.out.println();
        System.out.print("Enter employee hourly salary: ");
        double hourlySalary = sc.nextDouble();
        System.out.println();
        System.out.print(" Enter employee worked hours; ");
        double workedHours = sc.nextDouble();
        System.out.println();
        double monthlySalary = hourlySalary * workedHours;
        System.out.printf("Employee Id: " + ID + " and monthly salary is: %.2f", monthlySalary);
    }
}
