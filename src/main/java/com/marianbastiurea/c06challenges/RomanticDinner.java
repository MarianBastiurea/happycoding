package com.marianbastiurea.c06challenges;

import java.util.Scanner;

/*
Celebrating their one-month anniversary, Mihai wants to impress his girlfriend by cooking a romantic dinner.**

To truly amaze her, Mihai plans to learn two new recipes.

Given `n` recipe books, he needs your help to learn two new recipes in the shortest possible time, so that he still has time to get ready for the date.

Input

The first line contains the natural number `n`, representing the number of recipe books Mihai has.

Each of the following `n` lines contains 3 values:

* `a`: has the value `1` if Mihai can learn the **first recipe** from the current book, or `0` if he cannot.
* `b`: has the value `1` if Mihai can learn the **second recipe** from the current book, or `0` if he cannot.
* `c`: represents the number of **minutes** required to learn either just the first recipe, just the second recipe, or both recipes from the current book — depending on which ones are available.

Output

Display the **minimum number of minutes** in which Mihai can learn **two recipes**, using one or more of the `n` available books.
 */

public class RomanticDinner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a, b, c = 0;
        System.out.println("Input number of cooking books n" +
                ": ");
        while (true) {
            n = scanner.nextInt();
            if (1 <= n && n <= 100000) {
                System.out.println("input number is: " + n);
                break;
            } else {
                System.out.println("Please enter a number between 1 and 100000. ");
            }

        }

        System.out.println("please enter a value for a  (0 or 1): ");
        while (true) {
            a = scanner.nextInt();
            if (a == 0 || a == 1) {
                break;
            } else {
                System.out.println("Please input 0 or 1:");
            }
        }
        System.out.println("please enter a value for b  (0 or 1): ");
        while (true) {
            b = scanner.nextInt();
            if (b == 0 || b == 1) {
                break;
            } else {
                System.out.println("Please input 0 or 1:");
            }
        }
        System.out.println("Please enter a value for c between 0 and 60:");
        while (true) {
            String c1 = scanner.next();
            if (c1.matches("[0-60]")) {
                c = Integer.parseInt(c1);
                break;
            } else {
                System.out.println("Please input a number between 0 and 60:");
            }
        }

        if (a == 0 || b == 0) {
            System.out.println("No dinning tonight");
        } else {
            System.out.println(c);
        }
    }
}
