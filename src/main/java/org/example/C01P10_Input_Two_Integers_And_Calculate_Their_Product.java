package org.example;

import java.util.Scanner;

/* Write a Java program that accepts two integers from the user and calculates the product of the two integers.
https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/c-programming-basic-exercises-10.php
*/
public class C01P10_Input_Two_Integers_And_Calculate_Their_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int firstInteger = sc.nextInt();
        System.out.println();
        System.out.print("Enter second integer: ");
        int secondInteger = sc.nextInt();
        System.out.println();
        int product = firstInteger * secondInteger;
        System.out.println("Product is " + product);
    }
}