package com.codewars.kyu7.alphabetsymmetry.test;

import com.codewars.kyu7.alphabetsymmetry.main.AlphabetSymmetry;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class AlphabetSymmetryTest{
    @Test
    public void sampleTest(){
        assertArrayEquals(new int[]{4,3,1}, AlphabetSymmetry.solve(new String[]{"abode","ABc","xyzD"}));
        assertArrayEquals(new int[]{4,3,0},AlphabetSymmetry.solve(new String[]{"abide","ABc","xyz"}));
        assertArrayEquals(new int[]{6,5,7},AlphabetSymmetry.solve(new String[]{"IAMDEFANDJKL","thedefgh","xyzDEFghijabc"}));
        assertArrayEquals(new int[]{1,3,1,3},AlphabetSymmetry.solve(new String[]{"encode","abc","xyzD","ABmD"}));
    }
}
