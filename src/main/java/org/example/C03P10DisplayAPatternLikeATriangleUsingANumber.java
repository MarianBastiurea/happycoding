package org.example;

import java.util.Scanner;

 class C03P10DisplayAPatternLikeATriangleUsingANumber {
    public static void main(String[] args) {
        int a;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer: ");
        a=sc.nextInt();

        for (int i=1; i<=a;++i) {
            for (int b=1;b<=i;++b) {
                System.out.printf(b+" ");
            }
            System.out.println("");
            }



        }

    }

