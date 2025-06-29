package com.marianbastiurea.c03arrays.filter;

public class FindANumberInArray {
      static boolean exists(int[] myArray, int k){
          boolean answer=false;
          for (int i=0; i< myArray.length; i++){
              if(myArray[i]==k){
                  answer=true;
              }
          }
          return answer;
      }

    public static void main(String[] args) {
        int[] myArray={-9,14,37,102};
        int k=102;
        boolean answer=exists(myArray,k);
        System.out.println("k exist in myArray:"+ answer);
    }
}
