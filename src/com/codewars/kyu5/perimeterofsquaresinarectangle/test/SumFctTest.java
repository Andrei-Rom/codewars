package com.codewars.kyu5.perimeterofsquaresinarectangle.test;

import static org.junit.Assert.*;
import java.math.BigInteger;
import java.util.Random;

import com.codewars.kyu5.perimeterofsquaresinarectangle.main.SumFct;
import org.junit.Test;


public class SumFctTest {

    @Test
    public void test1() {
        assertEquals(BigInteger.valueOf(4), SumFct.perimeter(BigInteger.valueOf(0)));
    }
    @Test
    public void test2() {
        assertEquals(BigInteger.valueOf(16), SumFct.perimeter(BigInteger.valueOf(2)));
    }
    @Test
    public void test3() {
        assertEquals(BigInteger.valueOf(80), SumFct.perimeter(BigInteger.valueOf(5)));
    }
    @Test
    public void test4() {
        assertEquals(BigInteger.valueOf(216), SumFct.perimeter(BigInteger.valueOf(7)));
    }
    @Test
    public void test5() {
        assertEquals(BigInteger.valueOf(14098308), SumFct.perimeter(BigInteger.valueOf(30)));
    }
    @Test
    public void test6() {
        assertEquals(new BigInteger("3765563580170350269813084895225152661245605470860136918008636804"), SumFct.perimeter(BigInteger.valueOf(300)));
    }
}
