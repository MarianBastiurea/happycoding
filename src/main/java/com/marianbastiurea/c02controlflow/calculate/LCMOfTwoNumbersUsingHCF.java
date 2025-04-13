package com.marianbastiurea.c02controlflow.calculate;

/*
Write a Java program to find the LCM(least common multiple)
of any two numbers using HCF(highest common factor).
Test Data :
Input 1st number for LCM: 15
Input 2nd number for LCM: 20
Expected Output :
The LCM of 15 and 20 is : 60
 */

public class LCMOfTwoNumbersUsingHCF {
    private LCMOfTwoNumbersUsingHCF() {
    }

    public static int findLCM(int firstInteger, int secondInteger) {
        int x, y, temp, hcf, lcm;
        x = Math.abs(firstInteger);
        y = Math.abs(secondInteger);
        if (firstInteger == 0 || secondInteger == 0) {
            return 0;  // lcm is 0 if one of the numbers is 0
        }
        while (y != 0) {
            temp = y;
            y = x % y;
            x = temp;
        }
        hcf = x;
        lcm = (Math.abs(firstInteger) * Math.abs(secondInteger)) / hcf;
        return lcm;
    }
}