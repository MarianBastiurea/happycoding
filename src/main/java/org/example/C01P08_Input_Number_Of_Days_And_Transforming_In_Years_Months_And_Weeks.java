package org.example;

import java.util.Scanner;

/* Write a Java program to convert specified days into years, weeks and days.
and subtract an equivalent number of days
https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/c-programming-basic-exercises-8.php
*/
public class C01P08_Input_Number_Of_Days_And_Transforming_In_Years_Months_And_Weeks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int daysNumber = sc.nextInt();
        int years, weeks, days, leapYear;
        years = (int) daysNumber / 365;
        //we will keep count of leap year by split by 4 number of year
        leapYear = (int) years / 4;
        weeks = (daysNumber - years * 365 - leapYear) / 7;
        days = daysNumber - years * 365 - weeks * 7 - leapYear;
        System.out.println("number of leap year: " + leapYear);
        System.out.println("If convert it in years, weeks and days,");
        System.out.println("result will be: " + years + " years, " + weeks + " weeks and " + days + " days");
    }
}