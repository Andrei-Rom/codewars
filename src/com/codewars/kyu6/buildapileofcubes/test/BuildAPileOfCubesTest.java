package com.codewars.kyu6.buildapileofcubes.test;

import static org.junit.Assert.*;

import com.codewars.kyu6.buildapileofcubes.main.BuildAPileOfCubes;
import org.junit.Test;


public class BuildAPileOfCubesTest {

    @Test
    public void test1() {
        assertEquals(2022, BuildAPileOfCubes.findNb(4183059834009L));
    }
    @Test
    public void test2() {
        assertEquals(-1, BuildAPileOfCubes.findNb(24723578342962L));
    }
    @Test
    public void test3() {
        assertEquals(4824, BuildAPileOfCubes.findNb(135440716410000L));
    }
    @Test
    public void test4() {
        assertEquals(3568, BuildAPileOfCubes.findNb(40539911473216L));
    }

}

