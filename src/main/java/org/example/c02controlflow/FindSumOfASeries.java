package org.example.c02controlflow;

import java.util.Scanner;
/*
Write a program in Java to find the sum of the series [ 1-X^2/2!+X^4/4!- .........].
Test Data :
Input the Value of x :2
Input the number of terms : 5
Expected Output :
the sum = -0.415873
Number of terms = 5
value of x = 2.000000

 */

public class FindSumOfASeries {
    public static void main(String[] args) {
        int numberOfTerms, x;
        int powerOfX = 0;
        double b, sum; // b have values -1 and 1 give the sign of series term
        double result = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of X: ");
        x = sc.nextInt();
        System.out.print("Enter number of terms: ");
        numberOfTerms = sc.nextInt();
        for (int i = 2; i <= numberOfTerms; ++i) {
            int fact = 1;
            powerOfX = powerOfX + 2;
            if (i % 2 == 0) {
                b = -1;
            } else {
                b = 1;
            }
            for (int j = 1; j <= powerOfX; ++j) {
                fact = fact * j;
            }
            sum = Math.pow(x, powerOfX) / fact * b;
            result = result + sum;
        }
        System.out.println(" value of sum is: " + result);
    }
}