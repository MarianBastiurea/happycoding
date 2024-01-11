package org.example.c02controlflow.calculate;

/*
Write a Java program to compute the sum of the first 10 natural numbers.

 */
class SumOfFirst10Integers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first 10 integers is: " + sum);
    }
}