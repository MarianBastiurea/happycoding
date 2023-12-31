package org.example.c02controlflow;

import java.util.Scanner;
/*
 Write a Java program to determine whether a given number is prime or not.
*/

public class CheckIfANumberIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int givenNumber = sc.nextInt();
        for (int i = 2; i < givenNumber; ++i) {
            if (givenNumber % i == 0) {
                System.out.println("Number " + givenNumber + " is not  prime number");
                break;
            } else {
                System.out.println("Number " + givenNumber + " is  prime number");
                break;
            }
        }
    }
}