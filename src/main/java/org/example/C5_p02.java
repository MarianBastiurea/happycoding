package org.example;

import java.util.Scanner;

class C05P02DisplayNumberInReverseOrder {
    public static void main(String[] args) {
        int a,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number of array's element: ");
        a= sc.nextInt();
        int[] myArray= new int[a];
        for(int i=0; i<a;++i) {
            System.out.print("Input "+i+" element of array: ");
            myArray[i]= sc.nextInt();
            System.out.println();
        }
        for(j=a-1; j>=0; j--) {
            System.out.print(myArray[j]+" ");
        }
    }
}