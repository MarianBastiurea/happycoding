package org.example;

import java.util.Scanner;

class C03_p27 {
    public static void main(String[] args) {
       int a;
       int sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter integer: ");
       a=sc.nextInt();
       for(int i=1; i<a;++i) {
           if (a % i == 0) {
               System.out.print(i + " ");
               sum = sum + i;
           }
       }
           if (sum==a) {
               System.out.println(" The sum is: "+sum);
               System.out.println("Number "+a+ " is perfect number");
           }
    }
}