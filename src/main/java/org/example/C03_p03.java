package org.example;

import java.util.Scanner;

class C03_p03 {
    public static void main(String[] args) {
        int a;
        int sum = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        a = sc.nextInt();
        for (int i = 1; i <= a; ++i) {
            System.out.print(i);
        }
        for (int j = 1; j <=a; ++j) {
            sum=sum+j;}
            System.out.println("");
            System.out.println("Sum of first "+a+" integers is: "+sum);

        }


}