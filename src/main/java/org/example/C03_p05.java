package org.example;

import java.util.Scanner;

class C03_p05 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer:");
        a=sc.nextInt();
        b=a*a*a;
        System.out.println("Cube value of integer is: "+b);
    }
}