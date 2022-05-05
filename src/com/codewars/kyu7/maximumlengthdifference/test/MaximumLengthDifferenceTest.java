package com.codewars.kyu7.maximumlengthdifference.test;

import org.junit.Test;

import static com.codewars.kyu7.maximumlengthdifference.main.MaximumLengthDifference.maximumLengthDifference;
import static org.junit.Assert.assertEquals;

public class MaximumLengthDifferenceTest {

    @Test
    public void basicTest() {
        String[] a1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] a2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

        assertEquals(13, maximumLengthDifference(a1, a2));
    }
}
