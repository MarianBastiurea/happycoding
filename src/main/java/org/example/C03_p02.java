package org.example;

class C03_p02 {
    public static void main(String[] args) {
        int a=0;
        int sum=0;
        for (int i=1; i<11; ++i) {
            a=a+1;
            sum=sum+a;
        }
        System.out.println("Sum of first 10 integers is: "+sum);

    }
}