package org.example;

import java.util.Scanner;

 public class C03P32CheckIfANumberIsPrime {
    public static void main(String[] args) {
       int a;
       Scanner sc=new Scanner(System.in);
       System.out.print("Entere integer: ");
       a= sc.nextInt();
       for (int i=2; i<a; ++i) {
           if (a %i==0) {
               System.out.println("Number is not a prime number");
               break;
           }
           else {
               System.out.println("Number is a prime number");
               break;
           }
       }
    }
}