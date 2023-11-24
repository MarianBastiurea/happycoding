package org.example;

import java.util.Scanner;

class DisplaysIdAndMonthlySalary {
    public static void main(String[] args) {
        String id="0342";
        double hourlySalary;
        double workedHours;
        double monthlySalary;
        String a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee ID:");
        a=sc.next();
        System.out.println("Enter employee hourly salary: ");
        hourlySalary=sc.nextDouble();
        System.out.println(" Enter employee worked hours; ");
        workedHours= sc.nextDouble();
        monthlySalary=hourlySalary*workedHours;
        System.out.printf( "Employee Id: "+id+" and monthly salary is: %.2f", monthlySalary);
        }
    }
