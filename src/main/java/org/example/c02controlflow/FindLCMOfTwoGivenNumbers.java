package org.example.c02controlflow;

/*
 Write a program in C to find the LCM of any two numbers.
Test Data :
Input 1st number for LCM: 15
Input 2nd number for LCM: 20
Expected Output :
The LCM of 15 and 20 is : 60
 */

import java.util.Scanner;

public class FindLCMOfTwoGivenNumbers {
    public static void main(String[] args) {
        int j = 1;
        int LCM;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second integer:");
        int secondNumber = sc.nextInt();
        for (int i = 1; i <= firstNumber && i <= secondNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                j = i;
            }
        }
        LCM = (firstNumber * secondNumber) / j;
        System.out.println("The LCM of " + firstNumber + " and " + secondNumber + " is " + LCM);
    }
}
