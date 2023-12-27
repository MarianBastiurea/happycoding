package org.example;

/* Write a Java program to compute the sum of the first 10 natural numbers.
https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-2.php
 */
class C03P02_Display_Sum_Of_First_10_integers {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i < 11; ++i) {
            count = count + 1;
            sum = sum + count;
        }
        System.out.println("Sum of first 10 integers is: " + sum);
    }
}