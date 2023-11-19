package org.example;

import java.util.Scanner;

class C03_p43 {
    public static void main(String[] args) {
        int a;
        int b;
        int c=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first integer: ");
        a= sc.nextInt();
        System.out.print("Enter second integer: ");
        b= sc.nextInt();
        for(int i = 1; i <= a && i <= b; i++) {
            if(a%i==0 && b%i==0)
                c = i;
        }
        System.out.printf("HCF of "+a+" and "+ b+" is "+c);
    }
}