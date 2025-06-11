package com.marianbastiurea.c02controlflow.calculate;

/*You are given a sequence of n integers.

Goal: Find the longest subsequence of prime numbers in increasing order from the given sequence.
Let x be the length of this longest subsequence.
Return the value of x.
If no such subsequence exists, return the message:
        "There is no such subsequence".
Constraints and Clarifications
2 ≤ n ≤ 100
        1 ≤ length of the binary sequence ≤ 100
Each element in the number sequence is in the range: 2 ≤ element ≤ 100
The number sequence is guaranteed to contain at least one odd number
The binary sequence must contain only 0 and 1 as valid values
A subsequence refers to a continuous segment of elements taken from the original sequence, keeping their original order
*/


import java.util.Scanner;

public class FindNumberOfPrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input size of array: ");
        int n = scanner.nextInt();
        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Please input value for " + i + " position in array");
            myArray[i] = inputANumber();
        }

        int primeLength = 0;
        int maxLength = 0;

        for (int i = 0; i < n - 1; i++) {
            if (findIfANumberIsPrime(myArray[i])) {
                primeLength = 1;
                int j = i + 1;

                while (j < myArray.length && findIfANumberIsPrime(myArray[j]) && myArray[j - 1] < myArray[j]) {
                    primeLength++;
                    j++;
                }
                maxLength = Math.max(maxLength, primeLength);

            }
        }

        if (maxLength == 0) {
            System.out.println("There is no such subsequence");
        } else {
            System.out.println("There are " + maxLength + " prime numbers in ascending order");
        }

    }

    public static int inputANumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a1 = scanner.nextInt();
            if (a1 >= 1 && a1 <= 100) {
                return a1;
            } else {
                System.out.println("Please input a value between 2 and 100");
            }
        }
    }


    public static boolean findIfANumberIsPrime(int a) {
        for (int i = 2; i < a - 1; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
