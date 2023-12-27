package org.example;

/* Write a program in Java to display the first 10 natural numbers.
https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-1.php
 */
public class C03P01_Display_First_10_Integers {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("First 10 integers are:");
        for (int i = 0; i < 10; ++i) {
            count = count + 1;
            System.out.print(count);
        }
    }
}