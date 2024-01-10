package org.example.c01expressions;

import java.util.Scanner;

/*
Write a Java program to convert specified days into years, weeks and days.
*/
public class DaysToYearsWeeksAndDays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days:");
        int numberOfDays = sc.nextInt();
        int years, weeks, days, leapYear;
        years = numberOfDays / 365;
        //we will keep count of leap year by split by 4 number of year
        leapYear = years / 4;
        weeks = (numberOfDays - years * 365 - leapYear) / 7;
        days = numberOfDays - years * 365 - weeks * 7 - leapYear;
        System.out.println("number of leap year: " + leapYear);
        System.out.println("If convert it in years, weeks and days,");
        System.out.println("result will be: " + years + " years, " + weeks + " weeks and " + days + " days");
    }
}