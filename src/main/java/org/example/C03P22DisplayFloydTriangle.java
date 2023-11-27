package org.example;

import java.util.Scanner;

public class C03P22DisplayFloydTriangle {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        a=sc.nextInt();
        for (int i=1; i<=a; ++i) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; ++j) {
                    if (j %2==0){
                        System.out.print("1 ");
                    }
                    else {
                        System.out.print("0 ");
                    }
                }
            }
            else {
                for (int j = 1; j <= i; ++j) {
                    if (j % 2 == 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
        }
    }
}