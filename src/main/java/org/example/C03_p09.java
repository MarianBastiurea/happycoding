package org.example;

import java.util.Scanner;


class C03_p09{
    public static void main(String[] args) {
        int a;
        String b="*";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter integer:");
        a = sc.nextInt();
        for(int i=1; i<=a; ++i) {
            System.out.println(b.repeat(i));


        }
    }
}