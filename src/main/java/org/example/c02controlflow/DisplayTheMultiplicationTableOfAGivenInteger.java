package org.example.c02controlflow;

import java.util.Scanner;

public class DisplayTheMultiplicationTableOfAGivenInteger {
    public static void main(String[] args) {
        int multipliedNumber;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer:");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            multipliedNumber = number * i;
            System.out.println(number + "X" + i + "=" + multipliedNumber);
        }
    }
}
