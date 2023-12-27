package org.example;

import java.util.Scanner;

/*Write a Java program that accepts two integers from the user
 and calculates the sum of the two integers.
https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/c-programming-basic-exercises-9.php
*/
public class C01P09_Input_Two_Integer_And_Calculate_Their_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.println();
        int c = a + b;
        System.out.println("Sum is " + c);
    }
}