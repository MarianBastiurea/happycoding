package org.example;

import java.util.Scanner;

class C03_p39{
    public static void main(String[] args) {
        int sum=0;
        for (int i=100; i<=200;++i) {
            if (i % 9 == 0) {
                System.out.print(i+" ");
                sum = sum + i;
            }
        }
        System.out.println("");
            System.out.println("Sum is: "+sum);
    }
}