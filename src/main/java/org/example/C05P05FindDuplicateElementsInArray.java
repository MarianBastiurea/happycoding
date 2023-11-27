package org.example;

import java.util.Scanner;

public class C05P05FindDuplicateElementsInArray {
    public static void main(String[] args) {
        int a,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number of array's element: ");
        a= sc.nextInt();
        int[] myArray= new int[a];
        for(int i=0; i<a;++i) {
            System.out.print("Input "+i+" element of array: ");
            myArray[i]= sc.nextInt();
        }
        for(int i=0; i<a;++i) {
            for (j = i+1; j < a; ++j) {
                if (myArray[i] == myArray[j]) {
                    System.out.println("Duplicate of elements array are: " + myArray[i]);
                    break;
                }
            }
        }
    }
}