package com.marianbastiurea.c03arrays.transform;

public class FlowerGarden {

    /*
    You are given a flower garden represented as an array of n plots, numbered from 0 to n - 1. Each plot can be either empty or already contain a flower. You are provided with two inputs:

An array flowers of length n, where flowers[i] = 1 means there is already a flower in plot i, and flowers[i] = 0 means it is empty.
An integer k representing the number of new flowers you want to plant.
Important rule: You cannot plant a flower in a plot adjacent to another flower. That means if you plant a flower at position i, then positions i-1 and i+1 must be empty or out of bounds.

Task: Write a function that returns true if you can plant exactly k flowers without violating the adjacency rule. Otherwise, return false.

✅ Example
Input: flowers = [1, 0, 0, 0, 1], k = 1
Output: true

Explanation: You can plant a flower at position 2 (0-based), with no adjacent flowers.
     */

    public static boolean plantFlowers(int[] flowers, int k){
        boolean answer=false;
        for(int i=0; i< flowers.length; i++){
            if((i == 0 || flowers[i - 1] == 0) &&
                    flowers[i] == 0 &&
                    (i == flowers.length - 1 || flowers[i + 1] == 0)){
                k--;
                flowers[i]=1;
            }
        }
        if (k==0){
            answer=true;
        }
        return answer;
    }
}
