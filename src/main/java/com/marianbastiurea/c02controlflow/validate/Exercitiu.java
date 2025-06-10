package com.marianbastiurea.c02controlflow.validate;
import java.util.Scanner;

public class Exercitiu {


    public static void main(String[] args) {
        String a1;
        String b1;
        String c1;
        int a = 0, b = 0, c = 0, x = 0;
        int n, m;
        boolean found = false;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introdu o cifra (0,9) pentru a: ");
        while(true) {
            a1 = scanner.next();
            if (a1.matches("[0-9]")) {
                a = Integer.parseInt(a1);
                System.out.println(" Ai introdus cifra:" + a);
                break;
            } else {
                System.out.println("te rog introdu o singura cifra");
            }
        }
        System.out.println("Introdu o cifra (0,9) pentru b: ");
        while(true) {
            b1 = scanner.next();
            if (b1.matches("[0-9]")) {
                b = Integer.parseInt(b1);
                System.out.println(" Ai introdus cifra:" + b);
                break;
            } else {
                System.out.println("te rog introdu o singura cifra");
            }
        }
        System.out.println("Introdu o cifra (0,9) pentru c: ");
        while(true) {
            c1 = scanner.next();
            if (c1.matches("[0-9]")) {
                c = Integer.parseInt(c1);
                System.out.println(" Ai introdus cifra:" + c);
                break;
            } else {
                System.out.println("te rog introdu o singura cifra");
            }
        }
        System.out.println(" te rog introdu numarul x:");
        while ((!scanner.hasNextInt())) {
            System.out.println("Eroare: Te rog introdu doar cifre (un număr întreg valid).");
            scanner.next();
            System.out.print("Încearcă din nou: ");
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
            System.out.println("Nu există nicio combinație validă.");
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
