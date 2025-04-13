package com.marianbastiurea.c02controlflow.validate;

/* 
Write a Java program that reads two integers and checks whether they are multiplied or not.
*/
public class CheckIfTwoIntegersAreMultiplied {
    private CheckIfTwoIntegersAreMultiplied() {
    }

    public static boolean checkMultiplied(int[] myArray) {

        return myArray[1] > myArray[0] && myArray[1] % myArray[0] == 0;
    }
}

