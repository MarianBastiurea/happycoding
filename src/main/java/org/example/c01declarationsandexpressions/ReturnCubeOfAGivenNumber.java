package org.example.c01declarationsandexpressions;

import java.util.Scanner;
/*
 Write a program in Java to display the cube of the number up to an integer.
*/

public class ReturnCubeOfAGivenNumber {
    public static void main(String[] args) {
        int givenNumber, cubeValueOfNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer:");
        givenNumber = sc.nextInt();
        cubeValueOfNumber = givenNumber * givenNumber * givenNumber;
        System.out.println("Cube value of integer is: " + cubeValueOfNumber);
    }
}