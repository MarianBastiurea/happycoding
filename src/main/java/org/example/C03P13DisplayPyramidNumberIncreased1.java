package org.example;

import java.util.Scanner;
class C03P13DisplayPyramidNumberIncreased1 {
    int row;
    public static void main(String[] args) {
        int a;
        int b=0;
        int row;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer: ");
        a = sc.nextInt();
        int rows = a - 1;
        for (int i = 1; i <= a; ++i) {
            for (int j = rows; j > 0; j--) {
                System.out.print(" ");
            }
            rows = rows - 1;
            for (int c = 1; c <= i; ++c) {
                b=b+1;
                System.out.print(b+" ");
            }
                System.out.println("");
        }
    }
}
