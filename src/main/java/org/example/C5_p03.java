package org.example;

import java.util.Scanner;

class C05P03SumOfAllElementsInArray {
    public static void main(String[] args) {
        int a,j;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number of array's element: ");
        a= sc.nextInt();
        int[] myArray= new int[a];
        for(int i=0; i<a;++i) {
            System.out.print("Input "+i+" element of array: ");
            myArray[i]= sc.nextInt();
            sum=sum+myArray[i];
            System.out.println();
        }
            System.out.print("Sum of array's elements is: "+sum);
        }
    }