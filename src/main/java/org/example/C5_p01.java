package org.example;

class C5_p01 {
    public static void main(String[] args) {
        int[] myArray= new int[10];
        myArray[0]=1;
        for (int i=1;i<=9;++i) {
            myArray[i] = i;
        }
        for(int i=0; i<=9; ++i) {
            System.out.print (myArray[i]+" ");
        }
    }
}