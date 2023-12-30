package org.example.c02controlflow;

/*
Write a Java program to compute the sum of the first 10 natural numbers.

 */
class DisplaySumOfFirst10integers {
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