package org.example;

class TransformDaysinYears {
    public static void main(String[] args) {
        int years;
        int weeks;
        int days;
        int a=1329;
        int a1;
        int a2;
        int a3;

        a1=(int) a/365;
        a2= (a-a1*365)/7;
        a3=a-a1*365-a2*7;

    System.out.println("If convert 1329 days in years, weeks and days, result will be= "+a1+" years, "+a2+" weeks and "+a3+" days");

    }
}