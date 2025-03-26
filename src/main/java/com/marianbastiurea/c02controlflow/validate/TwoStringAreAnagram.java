package com.marianbastiurea.c02controlflow.validate;

import java.util.Arrays;
/*
Write a program in Java to check whether two given strings are an anagram.
 */

public class TwoStringAreAnagram {
    private TwoStringAreAnagram() {
    }

    public static String checkAnagram(String firstString, String secondString) {
        String result;
        if (firstString.length() != secondString.length()) {
            result = "Not Anagram";
        } else {
            //Convert both string to lower case
            firstString = firstString.toLowerCase();
            secondString = secondString.toLowerCase();

            // convert both string to character array
            char[] firstChar = firstString.toCharArray();
            char[] secondChar = secondString.toCharArray();

            //Sorting both arrays
            Arrays.sort(firstChar);
            Arrays.sort(secondChar);

            //comparing elements of arrays
            if (Arrays.equals(firstChar, secondChar)) {
                result = "Anagram";
            } else result = "Not Anagram";
        }
        return result;
    }
}


