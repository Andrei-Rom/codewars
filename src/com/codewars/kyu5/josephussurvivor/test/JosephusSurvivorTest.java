package com.codewars.kyu5.josephussurvivor.test;

import static org.junit.Assert.assertEquals;

import com.codewars.kyu5.josephussurvivor.main.JosephusSurvivor;
import org.junit.Test;
import java.util.Random;

public class JosephusSurvivorTest {

    @Test
    public void test1() {
        josephusTest(7, 3, 4);
    }

    @Test
    public void test2() {
        josephusTest(11, 19, 10);
    }

    @Test
    public void test3() {
        josephusTest(40, 3, 28);
    }

    @Test
    public void test4() {
        josephusTest(14, 2, 13);
    }

    @Test
    public void test5() {
        josephusTest(100, 1, 100);
    }

    @Test
    public void test6() {
        josephusTest(100000, 5, 40333);
    }

    @Test
    public void test7() {
        josephusTest(1000000 , 5, 718997);
    }

    private void josephusTest(final int n, final int k, final int result) {
        String testDescription = String.format("Testing where n = %d and k = %d", n, k);
        assertEquals(testDescription, result, JosephusSurvivor.josephusSurvivor(n, k));
    }
}