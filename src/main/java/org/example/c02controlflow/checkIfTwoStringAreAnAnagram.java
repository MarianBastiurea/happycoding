package org.example.c02controlflow;

import java.util.Arrays;
/*
Write a program in C to check whether two given strings are an anagram.
 */

public class checkIfTwoStringAreAnAnagram {
    public static String CheckAnagram(String FirstString, String SecondString) {
        String result;
        if (FirstString.length() != SecondString.length()) {
            result = "Not Anagram";
        } else {
            //Convert both string to lower case
            FirstString = FirstString.toLowerCase();
            SecondString = SecondString.toLowerCase();

            // convert both string to character array
            char[] FirstChar = FirstString.toCharArray();
            char[] SecondChar = SecondString.toCharArray();

            //Sorting both arrays
            Arrays.sort(FirstChar);
            Arrays.sort(SecondChar);

            //comparing elements of arrays
            if (Arrays.equals(FirstChar, SecondChar) == true) {
                result = "Anagram";
            } else result = "Not Anagram";
        }
        return result;
    }
}


