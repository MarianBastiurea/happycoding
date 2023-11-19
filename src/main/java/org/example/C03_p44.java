package org.example;

import java.util.Scanner;

class C03_p44{
    public static void main(String args[]){
        int x, y, a, b, temp,HCF, LCM;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        a = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        b = scanner.nextInt();
        scanner.close();

        x = a;
        y = b;

        while(y != 0){
            temp = y;
            y = x%y;
            x = temp;
        }

        HCF = x;
        LCM= (a*b)/HCF;

        System.out.println("HCF of input numbers: "+HCF);
        System.out.println("LCM of input numbers: "+LCM);
    }
}