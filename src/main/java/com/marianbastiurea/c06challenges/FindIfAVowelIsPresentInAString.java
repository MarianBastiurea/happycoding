package com.marianbastiurea.c06challenges;

public class FindIfAVowelIsPresentInAString {

    public static boolean check(String myString) {
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        char[] myStringArray = myString.toCharArray();
        boolean isTrue = false;
        for (int i = 0; i < myStringArray.length; i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (myStringArray[i] == vowel[j]) {
                    isTrue = true;
                    break;
                }
            }
        }
        return isTrue;
    }
}

