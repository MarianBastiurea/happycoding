package org.example;

import java.util.Scanner;

class C01_p10 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int a2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer:");
        a = sc.nextInt();
        System.out.println("Enter second integer: ");
        b = sc.nextInt();
        c = a * b;
        System.out.println("Product is " + c);
    }
}