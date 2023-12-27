package org.example;

import java.util.Scanner;

/* Write a JAVA program to calculate the distance between two points.

We will input x,y coordinates of each point and we will
calculate distance between them using Pitagora's Theorem
https://www.w3resource.com/c-programming-exercises/basic-declarations-and-expressions/c-programming-basic-exercises-15.php
*/
public class C01P15_Calculate_Distance_Between_Two_Points {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 value:");
        int x1 = sc.nextInt();
        System.out.println();
        System.out.print("Enter y1 value:");
        int y1 = sc.nextInt();
        System.out.println();
        System.out.print("Enter x2 value:");
        int x2 = sc.nextInt();
        System.out.println();
        System.out.print("Enter y2 value:");
        int y2 = sc.nextInt();
        double distance = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("Distance is: " + distance);
    }
}