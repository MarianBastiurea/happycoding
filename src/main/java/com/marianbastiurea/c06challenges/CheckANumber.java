package com.marianbastiurea.c06challenges;
import java.util.Scanner;
/*
"The program you will write will receive a number `x` and three magic digits: `a`, `b`, and `c`.
By combining (concatenating) two of the three magic digits, a number `n` can be formed, and the remaining unused digit will become the value of `m`.
If the product of `n` and `m` is equal to the value of `x`, the program will display the message YES.
Otherwise, it will display the message NO."**

*/



public class CheckANumber {


    public static void main(String[] args) {
        String a1;
        String b1;
        String c1;
        int a = 0, b = 0, c = 0, x = 0;
        boolean found = false;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a single digit (0,9) for a: ");
        while(true) {
            a1 = scanner.next();
            if (a1.matches("[0-9]")) {
                a = Integer.parseInt(a1);
                System.out.println(" Digit entered:" + a);
                break;
            } else {
                System.out.println("please input a single digit");
            }
        }
        System.out.println("Input a single digit (0,9) for b: ");
        while(true) {
            b1 = scanner.next();
            if (b1.matches("[0-9]")) {
                b = Integer.parseInt(b1);
                System.out.println(" Digit entered:" + b);
                break;
            } else {
                System.out.println("please enter a single digit");
            }
        }
        System.out.println("Input a single digit (0,9) for c: ");
        while(true) {
            c1 = scanner.next();
            if (c1.matches("[0-9]")) {
                c = Integer.parseInt(c1);
                System.out.println(" Digit entered:" + c);
                break;
            } else {
                System.out.println("please enter a single digit");
            }
        }
        System.out.println(" Input number x:");
        while ((!scanner.hasNextInt())) {
            System.out.println("Error: Please enter just number");
            scanner.next();
            System.out.print("Try again: ");
        }
        x= scanner.nextInt();
        scanner.close();

        found |= verificaSiAfiseaza(a, b, c, x);
        found |= verificaSiAfiseaza(b, a, c, x);
        found |= verificaSiAfiseaza(a, c, b, x);
        found |= verificaSiAfiseaza(c, a, b, x);
        found |= verificaSiAfiseaza(b, c, a, x);
        found |= verificaSiAfiseaza(c, b, a, x);
        if (!found) {
            System.out.println("NO");
        } else{
            System.out.println("Yes");
        }
    }
    private static boolean verificaSiAfiseaza(int prima, int aDoua, int aTreia, int x) {
        int n = prima * 10 + aDoua;
        int m = aTreia;
        if (x == n * m) {
            System.out.println("Valid: " + n + " * " + m + " = " + x);
            return true;
        }
        return false;
    }
}
