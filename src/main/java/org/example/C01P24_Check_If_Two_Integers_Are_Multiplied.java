package org.example;

import java.util.Scanner;

/* Write a Java program that reads two integers and checks whether they are multiplied or not.

https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/c-programming-basic-exercises-24.php
*/
public class C01P24_Check_If_Two_Integers_Are_Multiplied {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int firstInteger = sc.nextInt();
        System.out.println();
        System.out.print("Enter second integer: ");
        int secondInteger = sc.nextInt();
        if (secondInteger > firstInteger) {
            if (secondInteger % firstInteger == 0) {
                System.out.println("Number are multiplied");
            } else {
                System.out.println("Number aren't multiplied");
            }
        }
    }
}

