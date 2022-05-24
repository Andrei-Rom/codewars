package com.codewars.kyu6.isanumberprime.main;

import java.util.stream.IntStream;

public class Prime {
    public static boolean isPrime(int num) {
        return num >= 2 && IntStream.rangeClosed(2, (int) (Math.sqrt(num))).noneMatch(i -> num % i == 0);
    }
}
