package com.marianbastiurea.c03arrays.transform;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class FlowerGardenTest {

    @Test
    void oneFlowerTrue(){
        int[] flowers={1,0,0,0,1};
        int k=1;
        boolean result=true;
        assertEquals(result, FlowerGarden.plantFlowers(flowers,k));
    }

     @Test
     void twoFlowerFalse(){
         int[] flowers={1,0,0,0,1};
         int k=2;
         boolean result=false;
         assertEquals(result, FlowerGarden.plantFlowers(flowers,k));
     }
}
