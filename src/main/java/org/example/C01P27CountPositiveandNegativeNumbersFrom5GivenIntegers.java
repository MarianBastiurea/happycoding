package org.example;

import java.util.Scanner;

public class C01P27CountPositiveandNegativeNumbersFrom5GivenIntegers {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int[] myArray=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<5; i++) {
            System.out.println("Enter number:");
            myArray[i]=sc.nextInt();
        }
        for ( int i=0; i<5; i++){
        if (myArray[i]<0) {
            a=a+1;}
        else {
            b=b+1;
        }
        }
        System.out.println("there are: "+b+" positive numbers");
        System.out.println("there are: "+a+" negative numbers");
        }
    }
