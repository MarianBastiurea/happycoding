package org.example;

import java.util.Scanner;

class C04_p44 {
    public static void main(String[] args) {
       double average=0;
       double sum=0;
       int[] myArray= new int[20];
       Scanner sc =new Scanner(System.in);
       System.out.println("Input student's mark one by one");
       System.out.println(" To finish this process, input 0 or a negative number: ");
       for (int i=1; i<=20;++i) {
           myArray[i] = sc.nextInt();
           sum=sum+myArray[i];
           if (myArray[i] <= 0) {
               break;
           }
           average=sum/i;
       }
       System.out.printf("Average is: %.2f", average);
    }
}