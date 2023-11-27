package org.example;

import java.util.Scanner;

public class C03P35DisplaysNTermsOfFibonacciSeries {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        a= sc.nextInt();
        int[] myArray= new int[a];
        int b=0;
        int c=1;
        System.out.print( b+" "+c+" ");
        for (int i=2; i<a;++i) {
            int sum =b+c;
                System.out.print(sum+" ");
                b=c;
                c=sum;
        }
    }
}