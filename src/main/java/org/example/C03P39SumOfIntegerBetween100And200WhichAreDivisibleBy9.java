package org.example;

public class C03P39SumOfIntegerBetween100And200WhichAreDivisibleBy9 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=100; i<=200;++i) {
            if (i % 9 == 0) {
                System.out.print(i+" ");
                sum = sum + i;
            }
        }
        System.out.println("");
            System.out.println("Sum is: "+sum);
    }
}