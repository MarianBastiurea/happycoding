package org.example;

import java.util.Scanner;

class C02_p05 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter integer:");
        a=sc.nextInt();
        if ((a % 3 ==0) && (a % 7==0)) {
            System.out.println("Number is divide by 3 or 7");
        }
        else{
            System.out.println("number is not divided by 3 or 7");
        }
        if (a % 3 ==0) {
            System.out.println("Number is divide by 3");
        }
        if (a % 7 ==0) {
            System.out.println("Number is divide by 7");
        }
        }

}