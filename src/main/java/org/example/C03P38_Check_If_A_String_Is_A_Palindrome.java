package org.example;

/* Write a C program to check whether a number is a palindrome or not.

https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-38.php

 */

public class C03P38_Check_If_A_String_Is_A_Palindrome {
    public boolean isPalindrome(char[] string) {
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
