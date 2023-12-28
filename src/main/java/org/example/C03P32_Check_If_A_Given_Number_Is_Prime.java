package org.example;

import java.util.Scanner;
/*  Write a Java program to determine whether a given number is prime or not.

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-32.php
 */

public class C03P32_Check_If_A_Given_Number_Is_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int givenNumber = sc.nextInt();
        for (int i = 2; i < givenNumber; ++i) {
            if (givenNumber % i == 0) {
                System.out.println("Number is not givenNumber prime number");
                break;
            } else {
                System.out.println("Number is givenNumber prime number");
                break;
            }
        }
    }
}