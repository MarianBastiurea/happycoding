package org.example;

import java.util.Scanner;

public class C03P06MultiplierANumber {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer:");
        a=sc.nextInt();
        for(int i=1; i<11; ++i) {
            b=a*i;
            System.out.println(a+"X"+i+"="+b);
        }
    }
}