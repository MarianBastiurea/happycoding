package org.example;

import java.util.Scanner;

class C03P38NumberIsPalindrome {
    public static void main(String[] args) {
        int a;
        int b;
        int reverseNumber = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number to check if it is a palindrome: ");
        a= sc.nextInt();
        b=a;
        for( ;a != 0; a=a/10) {
            int remainder = a % 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        if (b==reverseNumber) {
            System.out.println("The number " + b + " is a palindrome");
        }
        else {
            System.out.println("The number " + b + " is not a palindrome");
        }
    }
}