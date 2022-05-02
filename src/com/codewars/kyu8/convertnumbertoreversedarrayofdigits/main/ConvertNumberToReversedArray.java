package com.codewars.kyu8.convertnumbertoreversedarrayofdigits.main;

public class ConvertNumberToReversedArray {

    public static int[] digitize(long n) {
        String temp = Long.toString(n);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            digits[i] = temp.charAt(temp.length() - 1 - i) - '0';
        }
        return digits;
    }
}


