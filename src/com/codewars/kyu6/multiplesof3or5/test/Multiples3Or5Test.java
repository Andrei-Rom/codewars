package com.codewars.kyu6.multiplesof3or5.test;

import com.codewars.kyu6.multiplesof3or5.main.Multiples3Or5;
import org.junit.Test;


import org.junit.Test;
        import static org.junit.Assert.assertEquals;

public class Multiples3Or5Test {
    @Test
    public void test() {
        assertEquals(23, new Multiples3Or5().solution(10));
    }

}