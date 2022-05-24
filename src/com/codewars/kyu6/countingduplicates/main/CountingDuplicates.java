package com.codewars.kyu6.countingduplicates.main;

import java.util.Arrays;
import java.util.Collections;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        String[] strings = text.toLowerCase().split("");

        return (int) Arrays.stream(strings)
                .filter(x -> Collections.frequency(Arrays.asList(strings), x) > 1).distinct().count();
    }
}