package com.codewars.kyu6.bitcounting.main;

public class BitCounting {

    public static int countBits(int n) {
        int result = 0;
        String s = Integer.toBinaryString(n);
        for (char c : s.toCharArray()) {
            if (c == '1') {
                result++;
            }
        }
        return result;

        // return Integer.bitCount(n);
    }
}
