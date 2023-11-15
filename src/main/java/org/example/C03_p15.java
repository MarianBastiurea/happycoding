package org.example;

import java.util.Scanner;
class C03_p15 {


    public static void main(String[] args) {
        int a;
        int product=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer:");
        a=sc.nextInt();
        for (int b=1; b<=a;++b) {
            product=product*b;}
            System.out.println(product);


    }
}