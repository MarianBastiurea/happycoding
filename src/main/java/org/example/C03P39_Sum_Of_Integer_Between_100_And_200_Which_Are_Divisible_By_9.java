package org.example;

/*Write a program in C to find the number and sum of all integers between
100 and 200 which are divisible by 9.

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-39.php
 */

public class C03P39_Sum_Of_Integer_Between_100_And_200_Which_Are_Divisible_By_9 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Number between 100 and 200 which are divisible by 9: ");
        for (int i = 100; i <= 200; ++i) {
            if (i % 9 == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println();
        System.out.println("Sum of them is: " + sum);
    }
}