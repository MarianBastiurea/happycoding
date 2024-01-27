package org.example.c02controlflow.calculate;

/*
 Write a program in Java to find the LCM of any two numbers.
Test Data :
Input 1st number for LCM: 15
Input 2nd number for LCM: 20
Expected Output :
The LCM of 15 and 20 is : 60
 */

import java.util.Scanner;

public class LeastCommonMultipleOfTwoGivenNumbers {
    private LeastCommonMultipleOfTwoGivenNumbers () {}

    public static int findLCM(int firstNumber, int secondNumber) {
        if (firstNumber == 0 || secondNumber == 0) {
            return 0;  // LCM is 0 if one of the numbers is 0
        }
        int max = Math.max(firstNumber, secondNumber);
        int min = Math.min(firstNumber, secondNumber);
        for (int LCM = max; ; LCM += max) {
            if (LCM % min == 0) {
                return LCM;
            }
        }
    }
}
