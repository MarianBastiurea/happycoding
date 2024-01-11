package org.example.c02controlflow.calculate;

import java.util.Scanner;

/*
Write a Java program that accepts three integers and finds the maximum of three.
*/
public class MaxOfThreeNumbers {

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

        int max;
        if (firstInteger > secondInteger) {
            if (thirdInteger > firstInteger) {
                max = thirdInteger;
            } else {
                max = firstInteger;
            }
        } else {
            if (thirdInteger > secondInteger) {
                max = thirdInteger;
            } else {
                max = secondInteger;
            }
        }

        System.out.println("Maximum value of three integer is: " + max);
    }
}