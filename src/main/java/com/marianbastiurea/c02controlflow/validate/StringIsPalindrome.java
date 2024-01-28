package com.marianbastiurea.c02controlflow.validate;

/*
 Write a Java program to check whether a number is a palindrome or not.
 */

public class StringIsPalindrome {
    private StringIsPalindrome () {}

    public static boolean isPalindrome(char[] string) {
        boolean result = false;
        if (string == null) {
            result = false;
        } else if (string.length == 1) {
            result = true;
        } else if (string.length > 1) {
            for (int head = 0, tail = string.length - 1; head < tail; head++, tail--) {
                if (string[head] == string[tail]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
