package org.example;

import java.util.Scanner;

/* Write a program in Java to display the multiplication table for a given integer.
https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-6.php
 */
public class C03P06_Display_The_Multiplication_Table_Of_A_Given_Integer {
    public static void main(String[] args) {
        int givenNumber;
        int multipliedNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer:");
        givenNumber = sc.nextInt();
        for (int i = 1; i < 11; ++i) {
            multipliedNumber = givenNumber * i;
            System.out.println(givenNumber + "X" + i + "=" + multipliedNumber);
        }
    }
}