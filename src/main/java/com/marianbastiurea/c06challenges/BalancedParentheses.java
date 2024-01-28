package com.marianbastiurea.c06challenges;
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
    private BalancedParentheses () {}


    public static boolean areParenthesesBalanced(String expression) {
        int index = 0;
        char[] symbol = new char[expression.length()];

        for (char bracket : expression.toCharArray()) {
            switch (bracket) {
                case '(':
                case '[':
                case '{':
                    symbol[index++] = bracket;
                    break;
                case ')':
                    if (index == 0 || symbol[--index] != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (index == 0 || symbol[--index] != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (index == 0 || symbol[--index] != '{') {
                        return false;
                    }
                    break;
            }
        }
        return index == 0;
    }

}