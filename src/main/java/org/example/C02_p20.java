package org.example;

import java.util.Scanner;

class C02_p20 {

    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer:");
        a=sc.nextInt();
        if (a % 3==0) {
            System.out.println("Number is divided by 3");
        }
        if (a % 7==0) {
            System.out.println("Number is divided by 7");
        }
        if ((a % 3==0)&&(a % 7 ==0)) {}
        else {
            System.out.println("Number is not divided by 3 and 7");
        }
    }


}