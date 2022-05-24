package com.codewars.kyu6.findtheparityoutlier.main;

import java.util.Arrays;

public class FindOutlier {
    public static int find(int[] integers) {
        int temp = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                temp++;
            }
        }
        return temp <= 1 ? findEven(integers) : findOdd(integers);
    }

    private static int findOdd(int[] integers) {
        return Arrays.stream(integers).filter(i -> i % 2 != 0).findAny().getAsInt();
    }

    private static int findEven(int[] integers) {
        return Arrays.stream(integers).filter(i -> i % 2 == 0).findAny().getAsInt();
    }
}
