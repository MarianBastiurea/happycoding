package org.example.c02controlflow.calculate;

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
    public static int findLCM(int firstInteger, int secondInteger) {
        int x, y, temp, HCF, LCM;
        x = Math.abs(firstInteger);
        y = Math.abs(secondInteger);
        if (firstInteger == 0 || secondInteger == 0) {
            return 0;  // LCM is 0 if one of the numbers is 0
        }
        while (y != 0) {
            temp = y;
            y = x % y;
            x = temp;
        }
        HCF = x;
        LCM = (Math.abs(firstInteger) * Math.abs(secondInteger)) / HCF;
        return LCM;
    }
}