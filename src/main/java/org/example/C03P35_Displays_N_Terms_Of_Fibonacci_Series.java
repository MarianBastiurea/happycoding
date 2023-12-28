package org.example;

import java.util.Scanner;

/* Write a program in Java to display the first n terms of the Fibonacci series.
Fibonacci series 0 1 2 3 5 8 13

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-35.php

 */

public class C03P35_Displays_N_Terms_Of_Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int numberOfTerms= sc.nextInt();
        int x=0;
        int y=1;
        System.out.print( x+" "+y+" ");
        for (int i=2; i<numberOfTerms;++i) {
            int sum =x+y;
                System.out.print(sum+" ");
                x=y;
                y=sum;
        }
    }
}