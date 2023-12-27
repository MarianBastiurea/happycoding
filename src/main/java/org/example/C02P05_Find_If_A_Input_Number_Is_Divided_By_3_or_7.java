package org.example;
/* Write a Java program that checks if a positive integer is divisible by either 3 or 7,
or both. If the integer is a multiple of 3, then the program will return true.
 Similarly, if the integer is a multiple of 7, then also the program will return true.
 If the integer is not a multiple of 3 or 7, then the program will return false.

 https://www.w3resource.com/c-programming-exercises/basic-algo/index.php
 */

import java.util.Scanner;

public class C02P05_Find_If_A_Input_Number_Is_Divided_By_3_or_7 {
    public static void main(String[] args) {
        int givenNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer:");
        givenNumber = sc.nextInt();
        if ((givenNumber % 3 != 0) && (givenNumber % 7 != 0)) {
            System.out.println("Number is not divided by 3 or 7");
        }
        if (givenNumber % 3 == 0) {
            System.out.println("Number is divided by 3");
        }
        if (givenNumber % 7 == 0) {
            System.out.println("Number is divided by 7");
        }
    }
}