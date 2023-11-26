package org.example;

import java.util.Scanner;

 class C03P36PyramidFirstLastNumber {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        a= sc.nextInt();
        for (int i=1; i<=a;++i) {
            for (int j = 0; j <= a-i ; ++j) {
                System.out.print("  ");
            }
            for (int k=1; k<=i;k++) {
                System.out.print(k+" ");
                }
            for (int l=i-1; l>=1;l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}