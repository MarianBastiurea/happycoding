package org.example;

import java.util.Scanner;

/*Write a program in C to display the number in reverse order.

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-37.php
 */


public class C03P37_Return_A_Given_Number_In_Reverse_Order {
    public static void main(String[] args) {
        int reverseNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to revert: ");
        int givenNumber = sc.nextInt();
        for (; givenNumber != 0; givenNumber = givenNumber / 10) {
            int remainder = givenNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverseNumber);
    }
}
