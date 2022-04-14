package com.codewars.kyu5.perimeterofsquaresinarectangle.main;

import java.math.BigInteger;

public class SumFct {

    public static BigInteger perimeter(BigInteger n) {
        // n + 1 is the number of squares (they are numbered from 0 to n)
        BigInteger temp;
        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("0");
        BigInteger result = new BigInteger("0");
        for (BigInteger i = BigInteger.valueOf(0); i.compareTo(n) <= 0; i = i.add(BigInteger.valueOf(1))) {
            temp = a;
            a = b;
            b = temp.add(a);
            result = result.add(b);
        }
        return result.multiply(BigInteger.valueOf(4));

    }
}
