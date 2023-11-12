package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class C01_p22 {
    public static void main(String[] args) {
        int sum;
       int[] myArray=new int[5];
       Scanner sc=new Scanner(System.in);
        for (int i=0; i<5; i++) {
            System.out.println("Enter number:");
            myArray[i]=sc.nextInt();
        }
        sum=0;
        for (int i=0; i<5;i++){
            if (myArray[i] %2==0) {
                sum=sum;}
                else {
                    sum=sum+myArray[i];}
            }
        System.out.println("Sum is: "+sum);
        }
    }
