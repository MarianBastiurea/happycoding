package org.example;

import java.util.Scanner;

class C03_p12{
    public static void main(String[] args) {
        int a;
        int b=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer: ");
        a=sc.nextInt();
        for(int i=1; i<=a; ++i) {
            for (int j=1; j<=i;++j) {
                b=b+1;
                System.out.print(b);
            }
            System.out.println("");
        }
    }
}