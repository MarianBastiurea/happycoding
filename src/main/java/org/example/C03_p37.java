package org.example;

import java.util.Scanner;

 class C03_p37 {
    public static void main(String[] args) {
       int a;
       int reverseNumber = 0;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter number to revert: ");
       a= sc.nextInt();
       for( ;a != 0; a=a/10)
        {
            int remainder = a % 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverseNumber);
    }
 }
