package com.codewars.kyu7.howmanyaresmallerthanme.main;

public class HowManyAreSmallerThanMe {
    public static int[] howManyAreSmallerThanMe(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    result[i]++;
                }
            }
        }
        return result;
    }
}