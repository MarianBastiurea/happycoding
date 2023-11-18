package org.example;

import java.util.Scanner;

 class C03_p31 {
    public static void main(String[] args) {
        int a;
        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer: ");
        a = sc.nextInt();
        rows = a - 1;
        for (int i = 1; i <= a; ++i) {
            for (int j = rows; j > 0; --j) {
                System.out.print(" ");
            }
            rows = rows - 1;
            for (int k = 1; k <= i; ++k) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        String b=" ";
        int t=1;
        int x=a-1;
        for (int m = a+t; m <= (2*a-1); ++m) {
            System.out.print(b.repeat(t));
            t=t+1;
            for (int p =x; p>0; --p) {
                System.out.print(" * ");
            }
            x=x-1;
            System.out.println();
        }
    }
}


