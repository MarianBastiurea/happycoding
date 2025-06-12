package com.marianbastiurea.c03arrays.sort;

public class FindNumberOfPuzzleSet {

    /*
    Problem Description
We define a set as a group formed by at least three puzzle pieces whose values are consecutive natural numbers.

Each puzzle piece has a natural number written on the back that indicates the set it belongs to. To speed up the sorting of the sets, John decided to use this information.

He takes a pile of n puzzle pieces and wants to sort them into valid sets.

Your task is to determine the minimum number of sets the n puzzle pieces in the mixed pile could come from.

Input
The first line contains a natural number n — the number of puzzle pieces in the pile.
The second line contains n natural numbers — the values written on each of the puzzle pieces.
Output
Display the minimum number of sets that the puzzle pieces can be grouped into, based on the rules.
Constraints and Notes
1 ≤ n ≤ 10,000
0 ≤ value of a puzzle piece ≤ 1,000
Each puzzle piece must belong to exactly one set
Consecutive numbers means numbers that follow one another without interruption, e.g.,
In increasing order: 1 2 3

     */

    public static int findPuzzleSet(int[] myArray) {
        int[] puzzleArray = sortAscendingArray(myArray);
        int x = 0;
        int setNumber = 0;
        for (int i = 0; i < puzzleArray.length - 1; i++) {
            if (puzzleArray[i + 1] - puzzleArray[i] == 1) {
                x++;
                if (x >= 3) {
                    setNumber++;
                    x = 0;
                }
            }
        }
        return setNumber;
    }

    public static int[] sortAscendingArray(int[] unsortedArray) {
        int temp = 0;
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            for (int j = 0; j < unsortedArray.length - 1; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    temp = unsortedArray[j];
                    unsortedArray[j] = unsortedArray[j + 1];
                    unsortedArray[j + 1] = temp;
                }
            }
        }
        return unsortedArray;
    }
}
