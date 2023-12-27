package org.example;

import java.util.Scanner;

/*  Write a Java program that reads 5 numbers and sums all odd values between them.


 we store all five elements in an array and
search for odds value in array and sum all
 https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/c-programming-basic-exercises-22.php
 */
public class C01P22_Input_Five_Integers_And_Calculate_Sum_Of_All_Odds_Value {
    public static void main(String[] args) {
        int sum = 0;
        int[] myArray = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number:");
            myArray[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                sum = sum;
            } else {
                sum = sum + myArray[i];
            }
        }
        System.out.println("Sum of all odds number is: " + sum);
    }
}
