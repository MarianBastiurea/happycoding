package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class XCopy {
    public static void main(String[] args) {
        int org = 42;
        XCopy x = new XCopy();
        int y = x.go(org);
        System.out.println(org+""+y);}
        int go(int arg) {
            arg = arg * 2;
            return arg;
        }

    }

