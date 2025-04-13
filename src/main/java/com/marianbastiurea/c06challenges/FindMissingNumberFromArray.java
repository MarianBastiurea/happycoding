package com.marianbastiurea.c06challenges;

public class FindMissingNumberFromArray {
    public static int findMissingNumber(int[] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        int number = myArray[myArray.length - 1] * (myArray[myArray.length - 1] + 1) / 2 - sum;
        System.out.println("Missing number is: " + number);
        return number;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 3, 4, 5, 6, 7, 8, 9, 10};
        int numberMissing = findMissingNumber(myArray);
        System.out.println("Missing number is: " + numberMissing);
    }
}
