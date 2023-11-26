package org.example;

import java.util.Scanner;

class C05P04CopyElementsFromArrayInOtherArray {
    public static void main(String[] args) {
        int a,j;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number of array's element: ");
        a= sc.nextInt();
        int[] myArray= new int[a];
        int[] copyArray= new int[a];
        for(int i=0; i<a;++i) {
            System.out.print("Input "+i+" element of array: ");
            myArray[i]= sc.nextInt();
        }
        for(int i=0; i<a;++i) {
            System.out.println("Elements of first array are: "+ myArray[i]);
        }
        for(int i=0; i<a;++i) {
            copyArray[i] = myArray[i];
            System.out.println("Elements of copy array are: " + myArray[i]);
        }
    }
}