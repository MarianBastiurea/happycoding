package org.example.c02controlflow;

/*
 Write a program in Java to display the first 10 natural numbers.
 */
public class DisplayFirst10Integers {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("First 10 integers are:");
        for (int i = 0; i < 10; ++i) {
            count = count + 1;
            System.out.print(count + " ");
        }
    }
}