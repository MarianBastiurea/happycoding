package org.example;

import java.util.Scanner;
 public class C03P45FindLCMOfTwoNumbers {
    public static void main(String[] args) {
        int a, b;
        int c = 1;
        int LCM;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer:");
        a = sc.nextInt();
        System.out.print("Enter second integer:");
        b = sc.nextInt();
        for (int i = 1; i <= a && i <= b; ++i) {
            if (a % i == 0 && b % i == 0) {
                c = i;
            }
        }
        LCM = (a * b) / c;
        System.out.println("The LCM of " + a + " and " + b + " is " + LCM);
    }
}
