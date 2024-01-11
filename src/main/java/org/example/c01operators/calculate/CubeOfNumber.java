package org.example.c01operators.calculate;

import java.util.Scanner;
/*
 Write a program in Java to display the cube of the number up to an integer.
*/

public class CubeOfNumber {
    public static void main(String[] args) {
        int number, cubeValue;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer:");
        number = sc.nextInt();
        cubeValue = number * number * number;
        System.out.println("Cube value of integer is: " + cubeValue);
    }
}