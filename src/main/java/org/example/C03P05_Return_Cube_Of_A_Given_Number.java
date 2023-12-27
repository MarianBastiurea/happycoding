package org.example;

import java.util.Scanner;
/*Write a program in Java to display the cube of the number up to an integer.
https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-5.php
 */

public class C03P05_Return_Cube_Of_A_Given_Number {
    public static void main(String[] args) {
        int givenNumber, cubeValueOfNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer:");
        givenNumber = sc.nextInt();
        cubeValueOfNumber = givenNumber * givenNumber * givenNumber;
        System.out.println("Cube value of integer is: " + cubeValueOfNumber);
    }
}