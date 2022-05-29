package com.codewars.kyu6.whicharein.main;

import java.util.Arrays;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        return Arrays.stream(array1).sorted()
                .filter(a1 -> Arrays.stream(array2).anyMatch(a2 -> a2.contains(a1))
                ).toArray(String[]::new);
    }
}
