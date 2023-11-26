package org.example;

import java.util.Scanner;

 class C03P11DisplayPatternLikeTriangleRepeatNumber {
    public static void main(String[] args) {
        int a;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter integer: ");
       a=sc.nextInt();
       for (int i=1; i<=a;++i) {
           for (int j=1; j<=i; ++j) {
               System.out.print(i);
           }
           System.out.println("");
       }
    }
}