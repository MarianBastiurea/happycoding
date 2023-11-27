package org.example;

import java.util.Scanner;

public class C03P07MultiplierTablefrom1ToN {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer: ");
        a=sc.nextInt();
        for (int i=1; i<=10;++i) {
            for (b=1;b<=a;++b ) {
                System.out.println(i + "X" + b + "=" + i * b);
            }
        }
    }
}