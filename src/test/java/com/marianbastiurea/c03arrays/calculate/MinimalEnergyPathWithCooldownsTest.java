package com.marianbastiurea.c03arrays.calculate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimalEnergyPathWithCooldownsTest {

    @Test
    void return0(){
        int[] heights={10, 13, 12, 15, 10};
        int cooldown=1;
        int result=0;
        assertEquals(result, MinimalEnergyPathWithCooldowns.minEnergyToReachEnd(heights,cooldown));
    }

    @Test
    void return15(){
        int[] heights={5, 10, 15, 20};
        int cooldown=1;
        int result=15;
        assertEquals(result, MinimalEnergyPathWithCooldowns.minEnergyToReachEnd(heights,cooldown));
    }

    @Test
    void return1(){
        int[] heights={2, 10, 3};
        int cooldown=1;
        int result=1;
        assertEquals(result, MinimalEnergyPathWithCooldowns.minEnergyToReachEnd(heights,cooldown));
    }

    @Test
    void returnMinus1(){
        int[] heights={1, 2, 3};
        int cooldown=2;
        int result=-1;
        assertEquals(result, MinimalEnergyPathWithCooldowns.minEnergyToReachEnd(heights,cooldown));
    }

    @Test
    void return40(){
        int[] heights={10, 20, 15, 30, 25, 10, 35, 5, 40, 20};
        int cooldown=2;
        int result=10;
        assertEquals(result, MinimalEnergyPathWithCooldowns.minEnergyToReachEnd(heights,cooldown));
    }

}
