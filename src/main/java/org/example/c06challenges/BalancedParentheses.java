package org.example.c06challenges;
/*
Balanced Parentheses

Write a Java program to determine if the parentheses (), the brackets [], and the braces {}, in a string are balanced.

For example:

{{)(}} is not balanced because ) comes before (

({)} is not balanced because ) is not balanced between {} and similarly the { is not balanced between ()

[({})] is balanced

{}([]) is balanced

{()}[[{}]] is balanced
 */

public class BalancedParentheses {

    public static boolean areParenthesesBalanced(String expression) {
        int balance = 0;

        for (char bracket : expression.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                balance++;
            } else if (bracket == ')' || bracket == ']' || bracket == '}') {
                balance--;
                if (balance < 0) {
                    return false; // More closing brackets than opening brackets
                }
            }
        }

        return balance == 0; // Balance should be zero if all brackets are balanced
    }
}