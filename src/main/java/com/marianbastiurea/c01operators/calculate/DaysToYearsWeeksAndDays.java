package com.marianbastiurea.c01operators.calculate;


/*
Write a Java program to convert specified days into years, weeks and days.
*/
public class DaysToYearsWeeksAndDays {
    private DaysToYearsWeeksAndDays() {
    }


    public static int[] findYearsWeeksDays(int numberOfDays) {
        int years = 0;
        int weeks = 0;
        int days = 0;
        int leapYear = 0;
        int[] result = new int[3];
        years = numberOfDays / 365;
        //we will keep count of leap year by split by 4 number of year
        leapYear = years / 4;
        weeks = (numberOfDays - years * 365 - leapYear) / 7;
        days = numberOfDays - years * 365 - weeks * 7 - leapYear;
        result[0] = years;
        result[1] = weeks;
        result[2] = days;
        return result;
    }
}