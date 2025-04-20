package com.marianbastiurea.c06challenges;

public class ReverseAString {
    public static String reverseAString(String myString) {
        char[] myStringToArray = myString.toCharArray();
        for (int i = 0, j = myStringToArray.length - 1; i < j; i++, j--) {
            char temp = myStringToArray[i];
            myStringToArray[i] = myStringToArray[j];
            myStringToArray[j] = temp;
        }
        return new String(myStringToArray);
    }
}
