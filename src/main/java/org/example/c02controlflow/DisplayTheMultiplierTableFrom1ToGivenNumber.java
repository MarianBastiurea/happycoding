package org.example.c02controlflow;

import java.util.Scanner;

/*
Write a program in Java to display the multiplier table vertically from 1 to n.
 */
public class DisplayTheMultiplierTableFrom1ToGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= number; ++j) {
                System.out.println(i + "X" + j + "=" + i * j);
            }
        }
    }
}