package org.example;

import java.util.Scanner;

class C03P17PyramidNumberRepeatSameRow {
    public static void main(String[] args) {
       int a;
       int rows;
       int b;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter integer: ");
       a=sc.nextInt();
       rows=a-1;
       for (int i=1; i<=a; ++i) {
           for (int j = rows; j> 0; --j) {
               System.out.print(" ");
           }
           rows=rows-1;
           for(int k=1;k<=i;++k) {
               System.out.print(i+" ");
           }
           System.out.println("");
       }
    }
}