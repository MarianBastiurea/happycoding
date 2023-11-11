package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class C01_p13 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first integer:");
        a=sc.nextInt();
        System.out.println("Enter the second integer:");
        b=sc.nextInt();
        System.out.println("Enter the third integer:");
        c=sc.nextInt();
        if (Math.max(a,b)>c)
            System.out.println("Maximum value of three integer is: "+Math.max(a,b));
            else
                System.out.println("Maximum value of three integer is: "+c);
    }
}