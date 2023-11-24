package org.example;

import java.util.Scanner;

class checkIfTwoIntegersAreMultiplied {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer:");
        a = sc.nextInt();
        System.out.println("Enter second integer: ");
        b = sc.nextInt();
        if (b > a) {
            if (b % a == 0) {
                System.out.println("Number are multiplied");
            } else {
                System.out.println("Number aren't multiplied");
            }
        }
        }

}

