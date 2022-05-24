package com.codewars.kyu6.findtheparityoutlier.test;

import com.codewars.kyu6.findtheparityoutlier.main.FindOutlier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OutlierTest {
    @Test
    public void testExample() {
        int[] exampleTest1 = {2, 6, 8, -10, 3};
        int[] exampleTest2 = {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        int[] exampleTest4 = {2, 4, 6, 8, 10, 1};
        int[] exampleTest5 = {1, 3, 5, 7, 9, 40};

        assertEquals(3, FindOutlier.find(exampleTest1));
        assertEquals(206847684, FindOutlier.find(exampleTest2));
        assertEquals(0, FindOutlier.find(exampleTest3));
        assertEquals(1, FindOutlier.find(exampleTest4));
        assertEquals(40, FindOutlier.find(exampleTest5));
    }
}
