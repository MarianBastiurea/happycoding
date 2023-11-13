package org.example;

import java.util.Scanner;

 class C03_p08 {
    public static void main(String[] args) {
        int a;
        int b=-1;
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        a= sc.nextInt();
        for (int i=1; i<=a;++i) {
            b=b + 2;
            System.out.print(b+" ");
            sum = sum + b;
        }
        System.out.println("Sum is: "+sum);




        }

}