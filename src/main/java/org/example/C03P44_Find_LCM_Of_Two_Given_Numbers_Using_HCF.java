package org.example;

import java.util.Scanner;
/* Write a C program to find the LCM(least common multiple)
 of any two numbers using HCF(highest common factor).
Test Data :
Input 1st number for LCM: 15
Input 2nd number for LCM: 20
Expected Output :
The LCM of 15 and 20 is : 60

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-44.php
 */

public class C03P44_Find_LCM_Of_Two_Given_Numbers_Using_HCF {
    public static void main(String args[]) {
        int x, y, temp, HCF, LCM;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstInteger = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int secondInteger = scanner.nextInt();
        scanner.close();
        x = firstInteger;
        y = secondInteger;
        while (y != 0) {
            temp = y;
            y = x % y;
            x = temp;
        }
        HCF = x;
        LCM = (firstInteger * secondInteger) / HCF;
        System.out.println("HCF of input numbers: " + HCF);
        System.out.println("LCM of input numbers: " + LCM);
    }
}