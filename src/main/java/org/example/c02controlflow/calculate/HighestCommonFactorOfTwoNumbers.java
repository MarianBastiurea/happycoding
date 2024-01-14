package org.example.c02controlflow.calculate;

/*
Write a Java program to find the HCF (Highest Common Factor) of two numbers.
Test Data :
Input 1st number for HCF: 24
Input 2nd number for HCF: 28
Expected Output :
HCF of 24 and 28 is : 4
 */

public class HighestCommonFactorOfTwoNumbers {
    public static int findHCF(int firstInteger, int secondInteger) {
        while (secondInteger != 0) {
            int temp = secondInteger;
            secondInteger = firstInteger % secondInteger;
            firstInteger = temp;
        }
        return firstInteger;
    }
}