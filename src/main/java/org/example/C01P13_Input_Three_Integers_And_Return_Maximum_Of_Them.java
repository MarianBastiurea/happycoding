package org.example;

import java.util.Scanner;

/* Write a Java program that accepts three integers and finds the maximum of three.
//https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/c-programming-basic-exercises-13.php
*/
public class C01P13_Input_Three_Integers_And_Return_Maximum_Of_Them {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int firstInteger = sc.nextInt();
        System.out.println();
        System.out.print("Enter the second integer:");
        int secondInteger = sc.nextInt();
        System.out.println();
        System.out.print("Enter the third integer:");
        int thirdInteger = sc.nextInt();
        System.out.println();
        if (Math.max(firstInteger, secondInteger) > thirdInteger)
            System.out.println("Maximum value of three integer is: " + Math.max(firstInteger, secondInteger));
        else
            System.out.println("Maximum value of three integer is: " + thirdInteger);
    }
}