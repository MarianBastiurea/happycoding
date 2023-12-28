package org.example;

import java.util.Scanner;

/*  Write a C program to find the HCF (Highest Common Factor) of two numbers.
Test Data :
Input 1st number for HCF: 24
Input 2nd number for HCF: 28
Expected Output :
HCF of 24 and 28 is : 4

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-43.php
 */

public class C03P43_Find_HCF_Of_Two_Numbers {
    public static void main(String[] args) {
        int c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstInteger = sc.nextInt();
        System.out.print("Enter second integer: ");
        int secondInteger = sc.nextInt();
        for (int i = 1; i <= firstInteger && i <= secondInteger; i++) {
            if (firstInteger % i == 0 && secondInteger % i == 0)
                c = i;
        }
        System.out.printf("HCF of " + firstInteger + " and " + secondInteger + " is " + c);
    }
}