package org.example;

import java.util.Scanner;

/* Write a program in Java to display the multiplier table vertically from 1 to n.
https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-7.php
 */
public class C03P07_Display_The_Multiplier_Table_From_1_To_Given_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int givenNumber = sc.nextInt();
        for (int i = 1; i <= 10; ++i) {
            for (int b = 1; b <= givenNumber; ++b) {
                System.out.println(i + "X" + b + "=" + i * b);
            }
        }
    }
}