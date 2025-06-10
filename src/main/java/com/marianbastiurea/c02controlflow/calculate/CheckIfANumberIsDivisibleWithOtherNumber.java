package com.marianbastiurea.c02controlflow.calculate;

import java.util.Scanner;

/*
The number a has had its sunglasses stolen — and without them, it can't stay on the beach. Since only numbers b and c were present on the beach, one of them must be the thief. According to the Number Police, the thief must be the number divisible by a, as the sunglasses only match that number.

Task
You are given three natural numbers: a, b, and c.

a is the number whose sunglasses were stolen.
b and c are the suspects.
You must determine which of the two (b or c) is divisible by a. The number that is divisible by a is declared to be the thief.

Input
Read three natural numbers a, b, and c from the first line, separated by spaces.

Output
Print the value of either b or c, whichever is divisible by a.

If both b and c are divisible by a, print the message:
Error

Constraints
1 ≤ a, b, c ≤ 20
It is guaranteed that at least one of b or c is divisible by a.
 */
public class CheckIfANumberIsDivisibleWithOtherNumber {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        boolean answerB = false;
        boolean answerC = false;

        System.out.println("Please input a value for a between 1 to 20:");
        a = inputANumber();
        System.out.println("Please input a value for b between 1 to 20:");
        b = inputANumber();
        System.out.println("Please input a value for c between 1 to 20:");
        c = inputANumber();
        answerB = checkIfANumberIsDivisible(b, a);
        answerC = checkIfANumberIsDivisible(c, a);
        if (answerB && answerC) {
            System.out.println("Error");
        } else {
            if (answerB) {
                System.out.println(b + " is divisible with " + a);
            }
            if (answerC) {
                System.out.println(c + " is divisible with " + a);
            }
        }


    }

    public static int inputANumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a1 = scanner.nextInt();
            if (a1 >= 1 && a1 <= 20) {
                return a1;
            } else {
                System.out.println("Please input a value between 1 and 20");
            }
        }
    }

    public static boolean checkIfANumberIsDivisible(int x, int y) {
        return x % y == 0;
    }


}
