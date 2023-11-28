package org.example;

import java.util.Scanner;

 public class C03P18FindSumOfSeries {
     //1-x^2/2!+X^4/4!
    public static void main(String[] args) {
       int n;
       int x;
       int a=0;
       double b;
       double sum;
       double result =1;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter value of X: ");
       x=sc.nextInt();
        System.out.print("Enter number of terms: ");
        n= sc.nextInt();
        for (int i=2; i<=n; ++i) {
            int fact =1;
            a=a+2;
            if (i %2==0) {
                b = -1;
            }
            else {
                b = 1;
            }
            for (int j = 1; j <= a; ++j) {
                fact = fact * j;
            }
            sum =Math.pow(x, a)/fact * b;
            result=result+sum;
        }
        System.out.println(" value of result: "+result);
    }
}