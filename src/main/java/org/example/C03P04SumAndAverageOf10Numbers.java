package org.example;

import java.util.Scanner;

public class C03P04SumAndAverageOf10Numbers {
    public static void main(String[] args) {
        int sum=0;
        double average=0;
        int[] myArray=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<10; i++) {
            System.out.println("Enter number:");
            myArray[i]=sc.nextInt();
        }
        for ( int i=0; i<10; i++) {
            sum = sum + myArray[i];
        }
        average = sum/10;
        System.out.println("Sum of given number is: "+sum);
        System.out.println("Average of given number is:"+average);

    }
}