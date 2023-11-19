package org.example;

import java.util.Scanner;

class C03_p33 {
    public static void main(String[] args) {
       int a;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number of rows: ");
       a= sc.nextInt();
       for (int i=1; i<=a;++i) {
           for (int j = 0; j <= a-i ; ++j) {
               System.out.print(" ");
           }
           int c=1;
           for (int k=1; k<=i;++k) {
               System.out.print(c + " ");
               c = c * (i - k) / k;
           }
               System.out.println();
       }
    }

}