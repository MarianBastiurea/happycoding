package com.marianbastiurea.c06challenges;

import java.util.Arrays;

public class AnagramChecker {

    public static boolean anagramChecker(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] charString1 = string1.toCharArray();
        Arrays.sort(charString1);
        char[] charString2 = string2.toCharArray();
        Arrays.sort(charString2);
        return Arrays.equals(charString1, charString2);
    }

    public static void main(String[] args) {
        String string1 = "listen";
        String string2 = "silent";
        String string3 = "word";
        System.out.println(" String " + string1 + " and string " + string2 + " are anagrams: " + anagramChecker(string1, string2));
        System.out.println(" String " + string1 + " and string " + string3 + " are anagrams: " + anagramChecker(string1, string3));
    }
}
