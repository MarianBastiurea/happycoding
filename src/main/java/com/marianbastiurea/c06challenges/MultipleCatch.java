package com.marianbastiurea.c06challenges;

public class MultipleCatch {
    public void tryAndCatch(int x) {
        int n = 1000;
        int arr[] = new int[n];
        for (int i = 0; i <= n; i++) {
            arr[i] = i / x;
        }
    }
}
