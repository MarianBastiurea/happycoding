package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class C01P15DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        int x1;
        int x2;
        int y1;
        int y2;
        double d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 value:");
        x1 = sc.nextInt();
        System.out.println("Enter y1 value:");
        y1 = sc.nextInt();
        System.out.println("Enter x2 value:");
        x2 = sc.nextInt();
        System.out.println("Enter y2 value:");
        y2 = sc.nextInt();
        d = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
        System.out.println("Distance is: " + d);
    }
}