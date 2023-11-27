package org.example;

import java.util.Scanner;

public class C03P05ReturnCubeOfNumber {
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