package org.example;

public class C01P08_Input_Number_Of_Days_And_Transforming_In_Years_Months_And_Weeks {
    public static void main(String[] args) {
        int a = 1329;
        int years;
        int weeks;
        int days;
        years = (int) a / 365;
        weeks = (a - years * 365) / 7;
        days = a - years * 365 - weeks * 7;
        System.out.println("If convert 1329 days in years, weeks and days,");
        System.out.println("result will be= " + years + " years, " + weeks + " weeks and " + days + " days");
    }
}