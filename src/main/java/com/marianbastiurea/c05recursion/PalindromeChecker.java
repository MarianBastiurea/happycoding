package com.marianbastiurea.c05recursion;

public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        String reversed = reverseRecursively(input);
        return input.equals(reversed);
    }


    private static String reverseRecursively(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String test1 = "Ana";
        String test2 = "radar";
        System.out.println("\"" + test1 + "\" este palindrom? " + isPalindrome(test1));
        System.out.println("\"" + test2 + "\" este palindrom? " + isPalindrome(test2));
    }
}
