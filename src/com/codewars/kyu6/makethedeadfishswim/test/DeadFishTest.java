package com.codewars.kyu6.makethedeadfishswim.test;

import com.codewars.kyu6.makethedeadfishswim.main.DeadFish;

import static org.junit.Assert.*;

public class DeadFishTest {
    @org.junit.Test
    public void exampleTests() {
        assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
        assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
    }
}